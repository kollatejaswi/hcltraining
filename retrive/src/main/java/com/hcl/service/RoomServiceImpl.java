package com.hcl.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.hcl.dao.RoomDao;
import com.hcl.domain.Room;
@Component
public class RoomServiceImpl implements RoomService {
   private RoomDao roomdao;
   public RoomServiceImpl() {
	// TODO Auto-generated constructor stub
}
   @Autowired
	public RoomServiceImpl(RoomDao roomdao) {
	super();
	this.roomdao = roomdao;
}


	public RoomDao getRoomdao() {
	return roomdao;
}
public void setRoomdao(RoomDao roomdao) {
	this.roomdao = roomdao;
}
	@Override
	public List<Room> getAll() {
	
		return roomdao.getAll();
	}

}
