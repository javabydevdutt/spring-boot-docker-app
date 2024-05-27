package com.devdutt.docker.api.controller;

import java.time.LocalTime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeRestController {

	@GetMapping("/wish")
	public String wish() {
		String name = "Devdutt";
		int hour = LocalTime.now().getHour();
		if (hour < 12) {
			return "Good Morning:- " + name;
		} else if (hour < 16) {
			return "Good AfterNoon:- " + name;
		} else if (hour < 20) {
			return "Good Evening:- " + name;
		} else {
			return "Good Night:- " + name;
		}
	}

}
