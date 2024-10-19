package com.gazi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gazi.model.Notification;

public interface NotificationRepository extends JpaRepository<Notification, Long> {



}
