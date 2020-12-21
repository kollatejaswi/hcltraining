package com.hcl.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.hcl.domain.DbCredentials;
import com.hcl.domain.User;
import com.hcl.util.DBUtil;

public class UserDaoImpl implements UserDao {

	@Override
	public boolean insert(User user) {
		Connection con=null;
		PreparedStatement pst=null;
		boolean b=false;
		int i;
		DbCredentials credentials=DBUtil.getCredentials();
		try
		{
			con=DBUtil.getConnection(credentials.getDriver(), credentials.getUrl(), credentials.getUname(), credentials.getPwd());
			if(con!=null)
			{
				pst=con.prepareStatement("insert into user(userid,username,password,gender,designation)values(?,?,?,?,?)");
				pst.setInt(1, user.getUserid());
				pst.setString(2, user.getUsername());
				pst.setString(3, user.getPassword());
				pst.setString(4, user.getGender());
				pst.setString(5, user.getDesignation());
				 i=pst.executeUpdate();
				if(i>0)
				{
					b=true;
				}
			}
		}
			catch(Exception e1)
			{
				e1.printStackTrace();
			}
		return b;
	}

	@Override
	public boolean validate(User user) {
		Connection con=null;
		PreparedStatement pst=null;
		boolean b=false;
		ResultSet rs=null;
		DbCredentials credentials=DBUtil.getCredentials();
		try
		{
			con=DBUtil.getConnection(credentials.getDriver(), credentials.getUrl(), credentials.getUname(), credentials.getPwd());
			if(con!=null)
			{
				pst=con.prepareStatement("select * from user where username=? and password=?");
				pst.setString(1, user.getUsername());
				pst.setString(2, user.getPassword());
				
				 rs=pst.executeQuery();
				 b=rs.next();
			}
			con.close();
		}
			catch(Exception e1)
			{
				e1.printStackTrace();
			}
		return b;
	}

	@Override
	public Optional<User> getUserByUserName(String userName) {
		Connection con=null;
		PreparedStatement pst=null;
		boolean b=false;
		ResultSet rs=null;
		Optional<User> useroptional=null;
		DbCredentials credentials=DBUtil.getCredentials();
		try
		{
			con=DBUtil.getConnection(credentials.getDriver(), credentials.getUrl(), credentials.getUname(), credentials.getPwd());
			if(con!=null)
			{
				pst=con.prepareStatement("select * from user where username=?");
				pst.setString(1, userName);
				
				 rs=pst.executeQuery();
				 b=rs.next();
				 User user=new User(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5));
					useroptional=Optional.ofNullable(user);
			}
			con.close();
		}
			catch(Exception e1)
			{
				e1.printStackTrace();
			}
		return useroptional;
	}
	}
	

