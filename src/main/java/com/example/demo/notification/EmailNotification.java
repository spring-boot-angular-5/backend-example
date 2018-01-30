package com.example.demo.notification;

import com.example.demo.user.User;
import lombok.Data;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Data
@Entity
public class EmailNotification {
    @Id
    @GeneratedValue
    private Long emailNotificationId;

    @ManyToOne
    private User receiver;

    private String subject;

    private String body;

    @OneToMany(mappedBy = "emailNotification")
    private Set<EmailNotificationStatus> statuses = new HashSet<>();
}
