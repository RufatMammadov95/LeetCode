package com.example.dailycodingchallenges.controller;

import com.example.dailycodingchallenges.model.Challenge;
import com.example.dailycodingchallenges.service.ChallengeService;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/challenges")
public class ChallengeController {

	private final ChallengeService challengeService;

	public ChallengeController(ChallengeService challengeService) {
		this.challengeService = challengeService;
	}

	@GetMapping
	public List<EntityModel<Challenge>> getAllChallenges() {

		List<Challenge> challenges = challengeService.getAllChallenges();

		return challenges.stream().map(ch -> EntityModel.of(ch, WebMvcLinkBuilder
				.linkTo(WebMvcLinkBuilder.methodOn(ChallengeController.class).getAllChallenges()).withSelfRel()))
				.collect(Collectors.toList());
	}

	@PostMapping
	public Challenge createChallenge(@RequestBody Challenge challenge) {
		return challengeService.saveChallenge(challenge);
	}
}