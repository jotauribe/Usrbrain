package com.onebrain.usrbrain.domain.model.user;

import java.util.Date;

import com.onebrain.common.Identity;

public class UserAccount {
	
	private UserId id;
	
	private String nickname;
	
	private FullName fullName;
	
	private String email;
	
	private Date birthday;
	
	private String password;
	
	private Date createdOn;
	
	private Date updatedOn;
	
	public UserAccount( UserId id, 
						String nickname, 
						FullName fullName,  
						String email, 
						Date birthday, 
						String password) {
		
		this.id = id;
		this.nickname = nickname;
		this.fullName = fullName;
		this.email = email;
		this.birthday = birthday;
		this.password = password;
		
	}
	
	public UserId id(){
		
		return this.id;
		
	}
	
	public String email(){
		
		return this.email;
		
	}

	public void editEmail(String email){
		
		this.email = email;
		
	}
	
	public void changeFullname(String name, String lastname){
		
		
		
	}
	
}