package com.isakhanli.notification;

import com.isakhanli.clients.notification.NotificationRequest;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@AllArgsConstructor
@RestController
@RequestMapping("api/v1/notification")
public class NotificationController {
    private final NotificationService notificationService;

    @PostMapping
    public void sendNotification(NotificationRequest notificationRequest){
        log.info("sent notification {}",notificationRequest);
        notificationService.send(notificationRequest);
    }
}
