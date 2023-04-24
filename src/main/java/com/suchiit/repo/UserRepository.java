package com.suchiit.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.suchiit.model.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> 
{

	public User findByEmail(String email);

	public User findByEmailAndPassword(String email, String password);

	public default User verifyEmailAndPassword(String email, String password) 
	{
	
		User user = new User();
		Boolean flag = false;
		User values = findByEmail(email);
		System.out.println("hiiiii"+values);
		if (values.getUserid() != null) 
		{
			flag = true;
		}

		if (flag) 
		{
			user = findByEmailAndPassword(email, password);

		}
		return user;

	}

}
