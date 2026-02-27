package com.muthu.kafka.controller;

import com.muthu.kafka.service.ProducerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/kafka")
@RequiredArgsConstructor
public class ProducerController {

    private final ProducerService producerService;

    @PostMapping("/produce")
    public String produce(@RequestParam String message) {
        return producerService.sendMessage(message);
    }
}