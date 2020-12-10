package com.hcl.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.hcl.domain.DbCredentials;
import com.hcl.domain.Emp;
import com.hcl.util.DBUtil;

public class EmpDaoImpl implements EmpDao {
   Emp e=new Emp();
	@Override
	public boolean insert(Emp e) {
		Connection con=null;
		PreparedStatement pst=null;
		boolean b=false;
		DbCredentials credentials=DBUtil.getCredentials();
		try
		{
			con=DBUtil.getConnection(credentials.getDriver(), credentials.getUrl(), credentials.getUname(), credentials.getPwd());
			if(con!=null)
			{
				pst=con.prepareStatement("insert into admin values(?,?)");
				pst.setInt(1, e.getEno());
				pst.setString(2, e.getName());
				int i=pst.executeUpdate();
				System.out.println(i);
				if(i>0)
				{
					System.out.println("success");
					b=true;
				}
				else
				{
					System.out.println("not inserted");
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
	public boolean delete(int eno) {
		 Connection con=null;
		PreparedStatement pst=null;
		boolean b=false;
		DbCredentials credentials=DBUtil.getCredentials();
		try
		{
			con=DBUtil.getConnection(credentials.getDriver(), credentials.getUrl(), credentials.getUname(), credentials.getPwd());
			if(con!=null)
			{
				pst=con.prepareStatement("delete from admin where id=?");
				pst.setInt(1, eno);
				int i=pst.executeUpdate();
				if(i>0)
				{
					System.out.println("deleted");
					b=true;
				}
				else
				{
					System.out.println("not");
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
	public List<Emp> getDetails() {
		Connection con=null;
		PreparedStatement pst=null;
		boolean b=false;
		ResultSet rs=null;
		List<Emp>em=new ArrayList<>();
		DbCredentials credentials=DBUtil.getCredentials();
		try
		{
			con=DBUtil.getConnection(credentials.getDriver(), credentials.getUrl(), credentials.getUname(), credentials.getPwd());
			if(con!=null)
			{
				pst=con.prepareStatement("select * from admin");
				 rs=pst.executeQuery();
				while(rs.next())
				{
				   em.add(new Emp(rs.getInt(1),rs.getString(2)));
				}
			}
		}
			catch(Exception e1)
			{
				e1.printStackTrace();
			}
		return em;
	}

	@Override
	public boolean update(int eno,String name) {
		Connection con=null;
		PreparedStatement pst=null;
		boolean b=false;
		DbCredentials credentials=DBUtil.getCredentials();
		try
		{
			con=DBUtil.getConnection(credentials.getDriver(), credentials.getUrl(), credentials.getUname(), credentials.getPwd());
			if(con!=null)
			{
				pst=con.prepareStatement("update admin set name=? where id=?");
				pst.setString(1,name);
				pst.setInt(2,eno);
				int i=pst.executeUpdate();
				if(i>0)
				{
					System.out.println("updated successfully");
					b=true;
				}
				else
				{
					System.out.println("not updated");
				}
			}
		}
			catch(Exception e1)
			{
				e1.printStackTrace();
			}
		return b;
	}

}
