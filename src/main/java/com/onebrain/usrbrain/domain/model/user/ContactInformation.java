package com.onebrain.usrbrain.domain.model.user;

import java.util.ArrayList;

public class ContactInformation {

	private EmailAddress email;
	
	private Telephone telephone;
	
	public ContactInformation(EmailAddress email, Telephone telephone){
		this.email = email;
		this.telephone = telephone;
	}

	public Telephone telephone(){
		return this.telephone;
	}

	public EmailAddress emailAddress(){
		return this.email;
	}

	public ContactInformation changeEmailAddress(EmailAddress anAddress){
		return new ContactInformation(anAddress, this.telephone());
	}
}
