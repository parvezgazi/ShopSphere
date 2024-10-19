package com.gazi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gazi.model.PasswordResetToken;

public interface PasswordResetTokenRepository extends JpaRepository<PasswordResetToken, Integer> {
	PasswordResetToken findByToken(String token);
}
