package com.alan.music_catalog_insights.service;

import com.alan.music_catalog_insights.config.JwtService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import java.util.Optional;
import com.alan.music_catalog_insights.dto.LoginRequest;
import com.alan.music_catalog_insights.entity.User;
import com.alan.music_catalog_insights.repository.UserRepository;

@Service
public class UserService {

	private final JwtService jwtService;
	private final UserRepository userRepository;
	private final PasswordEncoder passwordEncoder;

	public UserService(UserRepository userRepository,
	                   PasswordEncoder passwordEncoder, JwtService jwtService) {
	    this.userRepository = userRepository;
	    this.passwordEncoder = passwordEncoder;
	    this.jwtService = jwtService;

	}
    
	public User registerUser(User user) {

	    user.setPassword(passwordEncoder.encode(user.getPassword()));

	    return userRepository.save(user);
	}

	public PasswordEncoder getPasswordEncoder() {
		return passwordEncoder;
	}
	
	public String login(LoginRequest request) {

	    Optional<User> optionalUser = userRepository.findByEmail(request.getEmail());

	    if (optionalUser.isEmpty()) {
	        throw new RuntimeException("User not found");
	    }

	    User user = optionalUser.get();

	    if (!passwordEncoder.matches(request.getPassword(), user.getPassword())) {
	        throw new RuntimeException("Invalid Password");
	    }

	    return jwtService.generateToken(user.getEmail());
	}
}