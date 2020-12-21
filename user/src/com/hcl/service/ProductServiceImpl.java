package com.hcl.service;

import java.util.List;

import com.hcl.dao.ProductDao;
import com.hcl.dao.ProductDaoImpl;
import com.hcl.domain.Product;

public class ProductServiceImpl implements ProductService {
    ProductDao dao=new ProductDaoImpl();
	@Override
	public List<Product> getProduct() {
		// TODO Auto-generated method stub
		return dao.getAll();
	}

}
