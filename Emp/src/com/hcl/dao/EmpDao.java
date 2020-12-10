package com.hcl.dao;

import java.util.List;

import com.hcl.domain.Emp;

public interface EmpDao {
   boolean insert(Emp e);
   boolean delete(int eno);
   List<Emp> getDetails();
   boolean update(int eno,String name);
   
}
