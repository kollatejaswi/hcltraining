package com.hcl.service;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.hcl.domain.Customer;
import com.hcl.exception.ProductNotFound;

public class ProductServiceImpTest {
	static ProductService service=null;
	@Before
	public void beforeEach() {
	service=new ProductServiceImp();
	}
	@After
	public void afterEach()
	{
	service=null;
	}
	@Test
	public void testAddCustomer() {
		Customer customer=new Customer(1, "tv", "entertainment");
		boolean b=service.addCustomer(customer);
		assertTrue(b);
	}

	@Test(expected = ProductNotFound.class)
	public void testDeleteCustomer() {
		int id=1;
		boolean b=service.deleteCustomer(id);
		assertTrue(b);
	}

	@Test
	public void testGetCustomers() {
		List<Customer> customers=service.getCustomers();
		assertNotNull(customers);
	}

}
