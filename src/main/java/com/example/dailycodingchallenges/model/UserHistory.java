package com.example.dailycodingchallenges.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class UserHistory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long userId;
    private Long challengeId;
    private boolean success;
}