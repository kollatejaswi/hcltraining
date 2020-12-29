package com.hcl.domain;

public class Room {
     String photo;
     String roomtype;
     String price;
     int roomid;
     String photopath;
     
     public Room() {
		// TODO Auto-generated constructor stub
	}
	public Room(int roomid, String roomtype, String price, String photo, String photopath) {
		super();
		this.roomid = roomid;
		this.roomtype = roomtype;
		this.price = price;
		this.photo = photo;
		this.photopath = photopath;
	}
	
	public Room(String photo, String roomtype, String price, int roomid) {
		super();
		this.photo = photo;
		this.roomtype = roomtype;
		this.price = price;
		this.roomid = roomid;
	}
	public int getRoomid() {
		return roomid;
	}
	public void setRoomid(int roomid) {
		this.roomid = roomid;
	}
	public String getRoomtype() {
		return roomtype;
	}
	public void setRoomtype(String roomtype) {
		this.roomtype = roomtype;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public String getPhotopath() {
		return photopath;
	}
	public void setPhotopath(String photopath) {
		this.photopath = photopath;
	}
     
}
