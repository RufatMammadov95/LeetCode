package com.example.dailycodingchallenges.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class LeetCodeClient {

	private final RestTemplate restTemplate = new RestTemplate();

	public String getDailyChallenge() {
		return "API WORKS FINE";
	}
}