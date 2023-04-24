package com.suchiit.model;

import java.util.Date;

import javax.annotation.Generated;




import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "user")
public class User {
@Id

	private String userid;
	private String username;
	private String email;
	private String firstName;
	private String lastName;
	private String password;
	private String description;
	private String address;
	private long moblieNo;
	@CreatedDate
	private Date createdAt;
	@LastModifiedDate
	private Date updatedAt;
	private String status;
}
