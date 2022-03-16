package com.api.parkingcontrol.dtos;

import javax.validation.constraints.NotBlank;

import lombok.Data;

@Data
public class LoginDTO {

	@NotBlank
	private String user;
	
	@NotBlank
	private String pass;

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}



	
}
