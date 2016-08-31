package com.onebrain.usrbrain.domain.model.user;

import com.onebrain.common.AlwaysValidEntity;

public class EmailAddress extends AlwaysValidEntity {
	
	protected String address;
	
	public EmailAddress(String address){
		
		this.setAddress(address);
		
	}
	
	public String address(){
		
		return this.address;
		
	}
	
	private void setAddress(String address){
		
		this.assertArgumentNotNull(address, "The email address can not be NULL");
		this.assertArgumentNotEmpty(address, "The email address is required");
		this.assertArgumentLength(address, 3, 100, "The email address mut be between 3-100 characters");
		
		//TODO: patter assessment
		
		this.address = address;
		
	}

}
