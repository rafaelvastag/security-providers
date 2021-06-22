package com.vastag.app.example.security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/default-controller")
public class GenericController {

	@GetMapping("/health-check")
	public String get() {
		return "Default controller running";
	}
	
	@GetMapping("/free")
	public String getHealth() {
		return "Default controller running in free mode";
	}
}
