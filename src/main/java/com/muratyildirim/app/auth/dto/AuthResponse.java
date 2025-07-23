package com.muratyildirim.app.auth.dto;

import com.muratyildirim.app.auth.token.Token;
import com.muratyildirim.app.user.dto.UserDTO;

public class AuthResponse {

	UserDTO user;

	Token token;

	public UserDTO getUser() {
		return user;
	}

	public void setUser(UserDTO user) {
		this.user = user;
	}

	public Token getToken() {
		return token;
	}

	public void setToken(Token token) {
		this.token = token;
	}
}
