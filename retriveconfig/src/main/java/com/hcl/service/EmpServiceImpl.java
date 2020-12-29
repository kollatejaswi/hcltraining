package com.hcl.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.hcl.dao.EmpDao;
import com.hcl.domain.Emp;
@Component
public class EmpServiceImpl implements EmpService {
   private EmpDao empdao;
   public EmpServiceImpl() {
	// TODO Auto-generated constructor stub
}
   @Autowired
	public EmpServiceImpl(EmpDao empdao) {
	super();
	this.empdao = empdao;
}

	public EmpDao getEmpdao() {
		return empdao;
	}

	public void setEmpdao(EmpDao empdao) {
		this.empdao = empdao;
	}

	@Override
	public List<Emp> getAll() {
	
		return empdao.getAll();
	}

}
