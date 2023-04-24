package com.suchiit.service.impl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.suchiit.model.User;
import com.suchiit.repo.UserRepository;
import com.suchiit.service.UserService;
@Service
public class UserServiceImpl implements UserService{
@Autowired
private UserRepository userrepo;
	@Override
	public User createUser(User user) {
		// TODO Auto-generated method stub
		
		user.setCreatedAt(new Date(System.currentTimeMillis()));
		user.setStatus("active");
		return userrepo.save(user);
	}

	@Override
	public User LoginUser(String email, String password) {
		// TODO Auto-generated method stub
		
		
		return userrepo.verifyEmailAndPassword(email, password);
	}

}
