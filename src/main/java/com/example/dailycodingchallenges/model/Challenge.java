package com.example.dailycodingchallenges.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Challenge {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String title;
	private String difficulty;
}