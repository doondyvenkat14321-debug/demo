package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class userservice {
	@Autowired
	repository rs;
public String  user(String name, String email,String  pasword,String mobile) {
	userdetails us= new userdetails();
	us.setName(name);
	us.setEmail(email);
	us.setPassword(pasword);
	us.setMoblieno(mobile);
	rs.save(us);
	return "ok";
	
}

 


}
