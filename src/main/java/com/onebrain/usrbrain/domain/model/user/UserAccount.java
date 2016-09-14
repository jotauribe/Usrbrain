package com.onebrain.usrbrain.domain.model.user;

import com.onebrain.common.AlwaysValidEntity;

import java.util.Date;

public class UserAccount extends AlwaysValidEntity{
	
	private UserId id;
	
	private String userName;

	private String passwordHash;

	private String passwordSalt;

	private Person person;
	
	private Date createdOn;
	
	private Date lastUpdate;
	
	public UserAccount( UserId id, 
						String userName,
						String password) {
		
		this.setId(id);
		this.setUserName(userName);
		this.setPasswordHash(password);
		this.createdOn = new Date();
		
	}

	protected void setId(UserId id){
		assertArgumentNotNull(id, "An id is required");
		this.id = id;
	}

	protected void setUserName(String userName){
		assertArgumentNotNull(userName, "An id is required");
		this.userName = userName;
	}

	protected void setPasswordHash(String passwordHash){
		assertArgumentNotNull(passwordHash, "A password is required");
		assertArgumentLength(passwordHash, 6, 32, "Password lenght must to be between 6 and 35 characters");
		this.passwordHash = passwordHash;
	}

	public UserId id(){
		return this.id;
	}
	
	public void changeFullname(String name, String lastname){
		
		
		
	}
	
}