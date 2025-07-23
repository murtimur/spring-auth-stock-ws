package com.muratyildirim.app.auth;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.muratyildirim.app.auth.dto.AuthResponse;
import com.muratyildirim.app.auth.dto.Credentials;
import com.muratyildirim.app.auth.exception.AuthenticationException;
import com.muratyildirim.app.auth.token.Token;
import com.muratyildirim.app.auth.token.TokenService;
import com.muratyildirim.app.user.User;
import com.muratyildirim.app.user.UserService;
import com.muratyildirim.app.user.dto.UserDTO;

@Service
public class AuthService {

	@Autowired
	UserService userService;

	@Autowired
	PasswordEncoder passwordEncoder;

	@Autowired
	TokenService tokenService;

	public AuthResponse authenticate(Credentials creds) {
		User inDB = userService.getUser(creds.username());
		if (inDB == null)
			throw new AuthenticationException();
		if (!passwordEncoder.matches(creds.password(), inDB.getPassword()))
			throw new AuthenticationException();
		Token token = tokenService.createToken(inDB, creds);
		AuthResponse auth = new AuthResponse();
		auth.setToken(token);
		auth.setUser(new UserDTO(inDB));
		return auth;
	}

	public void logout(String authorizationHeader) {
		tokenService.logout(authorizationHeader);
	}

}
