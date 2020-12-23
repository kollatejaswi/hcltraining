package com.hcl;

import java.util.Set;

public class Collage {
    private String name;
    private Set<String> courses;
    public Collage() {
		// TODO Auto-generated constructor stub
	}
	public Collage(String name, Set<String> courses) {
		super();
		this.name = name;
		this.courses = courses;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Set<String> getCourses() {
		return courses;
	}
	public void setCourses(Set<String> courses) {
		this.courses = courses;
	}
    
}
