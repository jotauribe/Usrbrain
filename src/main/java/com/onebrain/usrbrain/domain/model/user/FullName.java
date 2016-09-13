package com.onebrain.usrbrain.domain.model.user;

public class FullName {
	
	private String name;
	
	private String lastname;
	
	public FullName(String name, String lastname){
		
		this.name = name;
		this.lastname = lastname;
		
	}

	public String name(){
		
		return this.name;
		
	}
	
	public String lastname(){
		
		return this.lastname;
		
	}
	
	public FullName edit(String name, String lastname){
		
		return new FullName(name, lastname);
		
	}
	
	public FullName editName(String name){
	
		return new FullName(name, this.lastname);
		
	}
	
	public FullName editLastname(String lastname){
		
		this.lastname = lastname;
		return new FullName(this.name, lastname);
		
	}

	public boolean equals(Object anObject){
		if(anObject != null && anObject.getClass() == this.getClass())
			if(((FullName)anObject).name().equals(this.name())
					&& ((FullName)anObject).lastname().equals(this.lastname()))
				return true;

		return false;
	}
	
}
