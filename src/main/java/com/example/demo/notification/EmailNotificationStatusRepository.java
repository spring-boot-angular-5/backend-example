package com.example.demo.notification;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmailNotificationStatusRepository extends JpaRepository<EmailNotificationStatus, Long> {
}
