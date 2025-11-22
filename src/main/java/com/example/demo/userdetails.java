package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="registers")
public class userdetails {
	@Id
private String name;
private String email;
private String password;
private String moblieno;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getMoblieno() {
	return moblieno;
}
public void setMoblieno(String moblieno) {
	this.moblieno = moblieno;
}




}
