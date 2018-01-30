package com.example.demo.notification;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Configuration
public class NotificationConfig {
    @Bean
    public ExecutorService emailSenderExecutor() {
        return Executors.newCachedThreadPool();
    }
}
