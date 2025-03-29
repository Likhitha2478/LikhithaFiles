package org.tnsif.onlineshopping.entities;

public abstract class User {
private int UserId;
private String username;
private String email;
public User (int UserId, String username, String email) {

this.UserId = UserId;
this.username = username;
this.email = email;
}

public int getUserId()
{
	return UserId;
}
public void setUserId(int userId) {
	this.UserId = userId;
}
public String getUsername()
{
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getEmail() {
	return email;
}

public void setEmail(String email)
{
	this.email = email;
}

public String toString()
{
	return "User [userId = " + UserId + ", username+" + username + ",email=" + email + "]";
}
	
		

	}
	



