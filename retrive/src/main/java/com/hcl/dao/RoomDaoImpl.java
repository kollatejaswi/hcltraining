package com.hcl.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.hcl.domain.Room;
@Component
public class RoomDaoImpl implements RoomDao {
     private DataSource datasource;
     public RoomDaoImpl() {
		// TODO Auto-generated constructor stub
	}
     @Autowired
	public RoomDaoImpl(DataSource datasource) {
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
	public List<Room> getAll() {
		Connection con=null;
		Statement pst=null;
		ResultSet rs=null;
		List<Room>em=new ArrayList<>();
		Room r=new Room();
		try
		{
			con=datasource.getConnection();
			if(con!=null)
			{
				pst=con.createStatement();
				rs=pst.executeQuery("select photo,room_type,price,room_id from room");

				while(rs.next())
				{
				   em.add(new Room(rs.getString(1),rs.getString(2),rs.getString(3),rs.getInt(4)));
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
