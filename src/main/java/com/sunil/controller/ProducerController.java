package com.sunil.controller;

import com.sunil.modal.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProducerController {
		@Autowired
		KafkaTemplate<String, Employee> kafkaTemplate;
	private static final String TOPIC ="NewTopic";
	@PostMapping("/publish")
	public String publishMessage(@RequestBody Employee employee){
		kafkaTemplate.send(TOPIC,employee);
		return "Employee publish Successfully";
	}
}