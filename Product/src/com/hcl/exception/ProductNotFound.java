package com.hcl.exception;

public class ProductNotFound extends RuntimeException{
public ProductNotFound(String des) {
	super(des);
}
}
