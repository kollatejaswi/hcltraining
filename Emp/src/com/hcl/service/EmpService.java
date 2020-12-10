package com.hcl.service;

import java.util.List;

import com.hcl.domain.Emp;

public interface EmpService {
   void add();
   void delete();
   List<Emp> getDetails();
   void update();
}
