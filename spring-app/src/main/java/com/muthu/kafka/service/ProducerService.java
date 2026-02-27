package com.muthu.kafka.service;

import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProducerService {

    private final KafkaTemplate<String, String> kafkaTemplate;

    public String sendMessage(String message) {
        kafkaTemplate.send("psyncopate-topic", message);
        return "Message sent to Kafka: " + message;
    }
}