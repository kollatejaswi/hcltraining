package com.hcl.dao;

import java.util.List;

import com.hcl.domain.Emp;

public interface EmpDao {
  public boolean insert(Emp e);
  List<Emp> getAll();
}
