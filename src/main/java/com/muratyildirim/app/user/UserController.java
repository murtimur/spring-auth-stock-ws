package com.muratyildirim.app.user;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.muratyildirim.app.shared.GenericMessage;
import com.muratyildirim.app.user.dto.UserCreateDTO;

@RestController
public class UserController {

	@Autowired
	private UserService userService;

	@PostMapping("/api/v1/users")
	GenericMessage save(@Valid @RequestBody UserCreateDTO user) {
		userService.save(user.toUser());
		return new GenericMessage("Kullanıcı oluşturuldu.");
	}

}
