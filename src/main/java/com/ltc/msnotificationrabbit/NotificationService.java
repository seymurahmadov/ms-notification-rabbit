package com.ltc.msnotificationrabbit;

import com.ltc.msnotificationrabbit.config.RabbitMQConfig;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class NotificationService {

    @RabbitListener(queues = RabbitMQConfig.QUEUE)
    public void receiveMessage(User user){
        System.out.println("Notification sent to user: " + user.getEmail());
    }
}
