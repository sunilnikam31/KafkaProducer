package com.sunil.controller;

import com.sunil.modal.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
public class ProducerController {
    private static final String TOPIC = "EmployeeTopic";
    @Autowired
    KafkaTemplate<String, Employee> kafkaTemplate;

    @PostMapping("/publish")
    public String publishMessage(@RequestBody Employee employee) {
        kafkaTemplate.send(TOPIC, employee);
        return "Employee publish Successfully";
    }
}