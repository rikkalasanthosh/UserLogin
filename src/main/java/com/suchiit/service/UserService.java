package com.suchiit.service;

import com.suchiit.model.User;

public interface UserService {
public User createUser(User user);
public User LoginUser(String email,String password);

}
