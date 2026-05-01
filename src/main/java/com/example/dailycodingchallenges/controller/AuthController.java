package com.example.dailycodingchallenges.controller;

import com.example.dailycodingchallenges.model.AppUser;
import com.example.dailycodingchallenges.repository.UserRepository;
import com.example.dailycodingchallenges.security.JwtService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {

	private final UserRepository userRepository;
	private final JwtService jwtService;

	public AuthController(UserRepository userRepository, JwtService jwtService) {
		this.userRepository = userRepository;
		this.jwtService = jwtService;
	}

	@PostMapping("/register")
	public AppUser register(@RequestBody AppUser user) {
		return userRepository.save(user);
	}

	@PostMapping("/login")
	public String login(@RequestBody AppUser user) {

		AppUser dbUser = userRepository.findByUsername(user.getUsername()).orElseThrow();

		if (dbUser.getPassword().equals(user.getPassword())) {
			return jwtService.generateToken(user.getUsername());
		}

		return "Wrong credentials";
	}
}