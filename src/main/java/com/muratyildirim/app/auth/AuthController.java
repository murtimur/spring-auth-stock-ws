package com.muratyildirim.app.auth;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseCookie;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.muratyildirim.app.auth.dto.AuthResponse;
import com.muratyildirim.app.auth.dto.Credentials;
import com.muratyildirim.app.shared.GenericMessage;

@RestController
public class AuthController {

	@Autowired
	AuthService authService;

	@PostMapping("/api/v1/auth")
	ResponseEntity<AuthResponse> handleAuthentication(@Valid @RequestBody Credentials creds) {
		var authResponse = authService.authenticate(creds);
		var cookie = ResponseCookie.from("access-token-v1", authResponse.getToken().getToken()).path("/").httpOnly(true)
				.build();
		return ResponseEntity.ok().header(HttpHeaders.SET_COOKIE, cookie.toString()).body(authResponse);
	}

	@PostMapping("/api/v1/logout")
	ResponseEntity<GenericMessage> handleLogout(
			@RequestHeader(name = "Authorization", required = false) String authorizationHedaer,
			@CookieValue(name = "access-token-v1", required = false) String cookieValue) {
		var tokenWithPrefix = authorizationHedaer;
		if (cookieValue != null)
			tokenWithPrefix = "AnyPrefix " + cookieValue;
		authService.logout(tokenWithPrefix);
		var cookie = ResponseCookie.from("access-token-v1", "").path("/").maxAge(0).httpOnly(true).build();
		return ResponseEntity.ok().header(HttpHeaders.SET_COOKIE, cookie.toString())
				.body(new GenericMessage("Logout success"));
	}

}
