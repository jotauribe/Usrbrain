package com.onebrain.usrbrain.domain.model.user;

public class Telephone {
	
	/**
	 * identifier serve as a description for the number. 
	 * Example: Main, Home, Work, Etc. 
	 */
	private String identifier;
	
	private String number;
	
	public Telephone(String number, String identifier){
		
		this.identifier = identifier;
		this.number = number;
		
	}
	
	public Telephone changeNumber(String number){
		
		return new Telephone(this.identifier, number);
		
	}
	
	public Telephone changeIdentifier(String identifier){
		
		return new Telephone(identifier, this.number);
		
	}
	
	public String number(){
		
		return this.number;
		
	}
	
	public boolean equals(Object anObjet){
		
		if(anObjet.getClass() == this.getClass())
			if(((Telephone)anObjet).number == this.number)
				return true;
		
		return false;
		
	}

}
