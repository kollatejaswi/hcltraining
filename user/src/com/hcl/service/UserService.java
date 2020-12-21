package com.hcl.service;

import java.util.Optional;

import com.hcl.domain.User;

public interface UserService {
   public boolean register(User user);
   public boolean validate(User user);
   Optional<User> getUserByUserName(String userName);
}
