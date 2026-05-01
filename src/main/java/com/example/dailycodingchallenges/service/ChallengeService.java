package com.example.dailycodingchallenges.service;

import com.example.dailycodingchallenges.model.Challenge;
import com.example.dailycodingchallenges.repository.ChallengeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChallengeService {

	private final ChallengeRepository challengeRepository;

	public ChallengeService(ChallengeRepository challengeRepository) {
		this.challengeRepository = challengeRepository;
	}

	public List<Challenge> getAllChallenges() {
		return challengeRepository.findAll();
	}

	public Challenge saveChallenge(Challenge challenge) {
		return challengeRepository.save(challenge);
	}
}