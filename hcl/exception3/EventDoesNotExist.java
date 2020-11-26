package com.hcl.exception3;

public class EventDoesNotExist extends RuntimeException {

	public EventDoesNotExist(String des) {
		super(des);
	}
}
