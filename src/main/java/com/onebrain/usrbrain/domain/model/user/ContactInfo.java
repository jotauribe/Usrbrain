package com.onebrain.usrbrain.domain.model.user;

import java.util.ArrayList;

public class ContactInfo {

	private EmailAddress email;
	
	private Telephone telephone;
	
	public ContactInfo(EmailAddress email, Telephone telephone){
		this.email = email;
		this.telephone = telephone;
	}

	public Telephone telephone(){
		return this.telephone;
	}

	public EmailAddress emailAddress(){
		return this.email;
	}

	public ContactInfo changeEmailAddress(String anAddress){
		//TODO
		return null;
	}
}
