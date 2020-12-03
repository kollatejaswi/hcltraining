package com.hcl.domain;
import java.io.Serializable;
public class Customer implements Serializable {
	private Integer productid;
	private String productname;
	private String productpurpose;
	public Customer() {
		// TODO Auto-generated constructor stub
	}
	
	public Customer(Integer productid, String productname, String productpurpose) {
		super();
		this.productid = productid;
		this.productname = productname;
		this.productpurpose = productpurpose;
	}

	public Integer getProductid() {
		return productid;
	}

	public void setProductid(Integer productid) {
		this.productid = productid;
	}

	public String getProductname() {
		return productname;
	}

	public void setProductname(String productname) {
		this.productname = productname;
	}

	public String getProductpurpose() {
		return productpurpose;
	}

	public void setProductpurpose(String productpurpose) {
		this.productpurpose = productpurpose;
	}

	@Override
	public String toString() {
	return String.format("%d\t%s\t%s", productid,productname,productpurpose);
	}

}
