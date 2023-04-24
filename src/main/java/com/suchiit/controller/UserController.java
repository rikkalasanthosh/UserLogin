package com.suchiit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.suchiit.model.User;
import com.suchiit.service.UserService;

@RestController
@RequestMapping("/restapi/")
public class UserController {

	
@Autowired
private UserService userServiceImpl;

@PostMapping("/users")
public ResponseEntity<?> addUsers(@RequestBody User user)
{

	User usersave=userServiceImpl.createUser(user);
	if(usersave!=null)
	{
		return new ResponseEntity<>("Data Inserted SuccessFully",HttpStatus.CREATED);
	}
	else
	{
	return new ResponseEntity<>("Data not inserted successfully",HttpStatus.INTERNAL_SERVER_ERROR);
	}
}


@GetMapping("/login")
public ResponseEntity<?> LoginUser(@RequestParam("email") String email,@RequestParam("password") String password)
{
	User userlogin=userServiceImpl.LoginUser(email, password);
	if(userlogin!=null)
	{
		return new ResponseEntity<User>(userlogin,HttpStatus.CREATED);
	}
	else
	{
	return new ResponseEntity<>("Login Failure",HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
}
