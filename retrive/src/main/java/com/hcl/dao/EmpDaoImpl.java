package com.hcl.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.hcl.domain.Emp;
@Component
public class EmpDaoImpl implements EmpDao {
     private DataSource datasource;
     public EmpDaoImpl() {
		// TODO Auto-generated constructor stub
	}
     @Autowired
	public EmpDaoImpl(DataSource datasource) {
		super();
		this.datasource = datasource;
	}
    
	public DataSource getDatasource() {
		return datasource;
	}

	public void setDatasource(DataSource datasource) {
		this.datasource = datasource;
	}

	@Override
	public List<Emp> getAll() {
		Connection con=null;
		Statement pst=null;
		ResultSet rs=null;
		List<Emp>em=new ArrayList<>();
		try
		{
			con=datasource.getConnection();
			if(con!=null)
			{
				pst=con.createStatement();
				rs=pst.executeQuery("select * from admin");

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
