package com.example.dailycodingchallenges.repository;

import com.example.dailycodingchallenges.model.Challenge;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChallengeRepository extends JpaRepository<Challenge, Long> {
}