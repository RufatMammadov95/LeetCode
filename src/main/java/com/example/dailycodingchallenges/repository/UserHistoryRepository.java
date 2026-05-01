package com.example.dailycodingchallenges.repository;

import com.example.dailycodingchallenges.model.UserHistory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserHistoryRepository extends JpaRepository<UserHistory, Long> {

	List<UserHistory> findByUserId(Long userId);
}