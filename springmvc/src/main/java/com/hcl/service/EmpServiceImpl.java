package com.hcl.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.dao.EmpDao;
import com.hcl.domain.Emp;
@Service
public class EmpServiceImpl implements EmpService {
   private EmpDao empdao;
   @Autowired
	public EmpServiceImpl(EmpDao empdao) {
	super();
	this.empdao = empdao;
}

	@Override
	public boolean insert(Emp e) {
		return empdao.insert(e);
	}

	@Override
	public List<Emp> getAll() {
		// TODO Auto-generated method stub
		return empdao.getAll();
	}

}
