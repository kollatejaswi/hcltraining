package com.hcl.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="STUDENT")
public class Student {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column( name="SID")
Integer id;
@Column( name="NAME")
String name;
@Column( name="ADDRESS")
String address;
public Student() {
	// TODO Auto-generated constructor stub
}
public Student(Integer id, String name, String address) {
	super();
	this.id = id;
	this.name = name;
	this.address = address;
}
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}

}
