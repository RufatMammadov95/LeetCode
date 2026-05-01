package com.example.dailycodingchallenges.controller;

import com.example.dailycodingchallenges.service.LeetCodeClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/leetcode")
public class LeetCodeController {

	private final LeetCodeClient leetCodeClient;

	public LeetCodeController(LeetCodeClient leetCodeClient) {
		this.leetCodeClient = leetCodeClient;
	}

	@GetMapping("/daily")
	public String getDaily() {
		return leetCodeClient.getDailyChallenge();
	}
}