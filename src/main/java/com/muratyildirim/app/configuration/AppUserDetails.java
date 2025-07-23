package com.muratyildirim.app.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.muratyildirim.app.user.User;
import com.muratyildirim.app.user.UserService;

@Service
public class AppUserDetails implements UserDetailsService {

	@Autowired
	UserService userService;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User inDB = userService.getUser(username);
		if (inDB == null)
			throw new UsernameNotFoundException(username + " is not found");
		return new CurrentUser(inDB);
	}

}
