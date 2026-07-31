package com.alan.music_catalog_insights.controller;
import com.alan.music_catalog_insights.dto.LoginRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alan.music_catalog_insights.entity.User;
import com.alan.music_catalog_insights.service.UserService;

@RequestMapping("/api")
@RestController
public class UserController {
	private final UserService userService;

	@GetMapping("/test")
	public String test() {
	    return "Backend Working";
	}
	
	@PostMapping("/register")
	public User registerUser(@RequestBody User user) {

	    return userService.registerUser(user);

	}
	
	public UserController(UserService userService) {
	    this.userService = userService;
	}

	public UserService getUserService() {
		return userService;
	}
	
	@PostMapping("/login")
	public String login(@RequestBody LoginRequest request) {

	    return userService.login(request);

	}
}
