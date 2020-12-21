package com.hcl.service;

import java.util.Optional;

import com.hcl.dao.UserDao;
import com.hcl.dao.UserDaoImpl;
import com.hcl.domain.User;

public class UserServiceImpl implements UserService {
    UserDao dao=new UserDaoImpl();
	@Override
	public boolean register(User user) {
		boolean b=false;
		if(user!=null)
		{
			b= dao.insert(user);
		}
		return b;
	}

	@Override
	public boolean validate(User user) {
		boolean b=false;
		if(user!=null)
		{
			b=dao.validate(user);
		}
		return b;
	}

	@Override
	public Optional<User> getUserByUserName(String userName) {
		// TODO Auto-generated method stub
		return dao.getUserByUserName(userName);
	}

}
