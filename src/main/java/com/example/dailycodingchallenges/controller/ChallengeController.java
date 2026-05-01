package com.example.dailycodingchallenges.controller;

import com.example.dailycodingchallenges.model.Challenge;
import com.example.dailycodingchallenges.service.ChallengeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/challenges")
public class ChallengeController {

	private final ChallengeService challengeService;

	public ChallengeController(ChallengeService challengeService) {
		this.challengeService = challengeService;
	}

	@GetMapping
	public List<Challenge> getAllChallenges() {
		return challengeService.getAllChallenges();
	}

	@PostMapping
	public Challenge createChallenge(@RequestBody Challenge challenge) {
		return challengeService.saveChallenge(challenge);
	}
}