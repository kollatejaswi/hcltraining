package com.hcl.service;

import java.util.List;

import com.hcl.domain.Emp;

public interface EmpService {
   public boolean insert(Emp e);
   List<Emp> getAll();
}
