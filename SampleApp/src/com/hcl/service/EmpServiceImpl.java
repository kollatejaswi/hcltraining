package com.hcl.service;

import java.util.List;

import com.hcl.dao.EmoDaoImpl;
import com.hcl.dao.EmpDao;
import com.hcl.domain.Emp;

public class EmpServiceImpl implements EmpService {
	private EmpDao dao=new EmoDaoImpl();
	@Override
	public List<Emp> getDetails() {
		return dao.getDetails();
	}

}
