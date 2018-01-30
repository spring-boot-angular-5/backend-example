package com.example.demo.notification;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

@Component
public class EmailSender {
    private final ExecutorService executorService;
    private final EmailNotificationRepository emailNotificationRepository;

    private Future<?> task;

    public EmailSender(ExecutorService emailSenderExecutor,
                       EmailNotificationRepository emailNotificationRepository) {
        this.executorService = emailSenderExecutor;
        this.emailNotificationRepository = emailNotificationRepository;
    }

    public void start() {
        task = executorService.submit(() -> {
            while (!task.isCancelled() && !task.isDone()) {
                tryToSend();
            }
        });
    }
    public void stop() {
        task.cancel(true);
    }

    @Async
    public void tryToSend() {

    }
}
