package com.muthu.kafka.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class MessageConsumer {

    @KafkaListener(topics = "psyncopate-topic", groupId = "demo-group")
    public void listen(String message) {
        System.out.println("Consumed message: " + message);
    }
}