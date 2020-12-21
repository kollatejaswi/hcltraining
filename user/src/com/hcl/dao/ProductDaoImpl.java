package com.hcl.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.hcl.domain.DbCredentials;
import com.hcl.domain.Product;
import com.hcl.util.DBUtil;

public class ProductDaoImpl implements ProductDao {

	@Override
	public List<Product> getAll() {
		Connection con=null;
		PreparedStatement pst=null;
		boolean b=false;
		ResultSet rs=null;
		List<Product>em=new ArrayList<>();
		DbCredentials credentials=DBUtil.getCredentials();
		try
		{
			con=DBUtil.getConnection(credentials.getDriver(), credentials.getUrl(), credentials.getUname(), credentials.getPwd());
			if(con!=null)
			{
				pst=con.prepareStatement("select * from product");
				 rs=pst.executeQuery();
				while(rs.next())
				{
				   em.add(new Product(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getInt(5)));
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

