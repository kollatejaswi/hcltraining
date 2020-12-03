package com.hcl.service;
import com.hcl.exception.ProductNotFound;
import java.util.ArrayList;
import java.util.List;

import com.hcl.domain.Customer;
public class ProductServiceImp implements ProductService {
	List<Customer> customers=new ArrayList<>();
	@Override
	public boolean addCustomer(Customer customer) {
	if(customer!=null)
	return customers.add(customer);
	else
	return false;

	}
	@Override
	public boolean deleteCustomer(int id)throws ProductNotFound {
	boolean b=false;
	Customer customer=getCustomer(id);
	if(customer!=null)
	b=customers.remove(customer);
	else
	{
	throw new ProductNotFound("no customer existed with id");
	}
	return b;
	}

	@Override
	public List<Customer> getCustomers() {

	return customers;
	}
	private Customer getCustomer(int id)
	{
	Customer customer=null;
	for(Customer customer2:customers)
	{
	if(id==customer2.getProductid())
	{
	customer=customer2;
	break;
	}
	}
	return customer;
	}

	}
