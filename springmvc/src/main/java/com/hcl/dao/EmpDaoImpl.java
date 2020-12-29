package com.hcl.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.*;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hcl.domain.Emp;

@Repository
public class EmpDaoImpl implements EmpDao {
   private DataSource datasource;
   @Autowired
	public EmpDaoImpl(DataSource datasource) {
	super();
	this.datasource = datasource;
}

	@Override
	public boolean insert(Emp e) {
		Connection con=null;
		PreparedStatement pst=null;
		boolean b=false;
		try
		{
			con=datasource.getConnection();
			if(con!=null)
			{
				pst=con.prepareStatement("insert into admin values(?,?)");
				pst.setInt(1, e.getEno());
				pst.setString(2, e.getName());
				int i=pst.executeUpdate();
				System.out.println(i);
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
	public List<Emp> getAll() {
		Connection con=null;
		PreparedStatement pst=null;
		boolean b=false;
		ResultSet rs=null;
		List<Emp>em=new ArrayList<>();
		try
		{
			con=datasource.getConnection();
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
