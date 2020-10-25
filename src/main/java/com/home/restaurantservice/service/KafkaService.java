package com.home.restaurantservice.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import commons.Order;

@Service
public class KafkaService {

	@KafkaListener(topics = "order_topic", containerFactory = "concurrentKafkaListenerContainerFactory", groupId="group_id")
	public void consumeJson(Order order) {
		System.out.println("Consumed JSON Message: " + order);
	}

}
