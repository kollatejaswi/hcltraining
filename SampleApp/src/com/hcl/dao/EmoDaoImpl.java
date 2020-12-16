package com.hcl.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.hcl.domain.DbCredentials;
import com.hcl.domain.Emp;
import com.hcl.util.DBUtil;

public class EmoDaoImpl implements EmpDao {

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

	}

