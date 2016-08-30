package com.onebrain.usrbrain.domain.model.user;

import com.onebrain.common.Identity;

public class UserId implements Identity {
	
	private String id;
	
	public String asString() {
		
		return this.id;
		
	}

}
