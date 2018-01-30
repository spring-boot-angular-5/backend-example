package com.example.demo.notification;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.sql.Timestamp;

@Data
@Entity
public class EmailNotificationStatus {
    @Id
    @GeneratedValue
    private Long emailNotificationStatusId;

    @ManyToOne
    private EmailNotification emailNotification;

    private Timestamp createdAt;

    private boolean status;

    private String error;
}
