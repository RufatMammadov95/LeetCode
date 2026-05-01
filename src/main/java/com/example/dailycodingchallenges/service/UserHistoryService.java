package com.example.dailycodingchallenges.service;

import com.example.dailycodingchallenges.model.UserHistory;
import com.example.dailycodingchallenges.repository.UserHistoryRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserHistoryService {

	private final UserHistoryRepository userHistoryRepository;

	public UserHistoryService(UserHistoryRepository userHistoryRepository) {
		this.userHistoryRepository = userHistoryRepository;
	}

	public List<UserHistory> getUserHistory(Long userId) {
		return userHistoryRepository.findByUserId(userId);
	}

	public UserHistory saveHistory(UserHistory history) {
		return userHistoryRepository.save(history);
	}
}
