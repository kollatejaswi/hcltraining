package com.hcl.service;

import java.util.List;

import com.hcl.domain.Customer;

public interface ProductService {
	boolean addCustomer(Customer customer);
	boolean deleteCustomer(int id);
	List<Customer> getCustomers();
}
