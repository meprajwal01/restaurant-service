package com.home.restaurantservice.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import commons.Restaurant;

@RestController
public class RestaurantResource {

	@GetMapping(value = "/rest")
	public Restaurant restaurant() {
		return new Restaurant(101, "Barbie Q");
	}
}
