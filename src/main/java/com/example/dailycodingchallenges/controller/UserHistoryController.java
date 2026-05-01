package com.example.dailycodingchallenges.controller;

import com.example.dailycodingchallenges.model.UserHistory;
import com.example.dailycodingchallenges.service.UserHistoryService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/history")
public class UserHistoryController {

	private final UserHistoryService userHistoryService;

	public UserHistoryController(UserHistoryService userHistoryService) {
		this.userHistoryService = userHistoryService;
	}

	@GetMapping("/{userId}")
	public List<UserHistory> getHistory(@PathVariable Long userId) {
		return userHistoryService.getUserHistory(userId);
	}

	@PostMapping
	public UserHistory addHistory(@RequestBody UserHistory history) {
		return userHistoryService.saveHistory(history);
	}
}