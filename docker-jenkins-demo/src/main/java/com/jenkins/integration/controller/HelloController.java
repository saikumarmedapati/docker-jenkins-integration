package com.jenkins.integration.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {
	
	@GetMapping
	public ResponseEntity<String> getHelloMessage() {
		return ResponseEntity.ok("Hello, Iam GET API second version");
	}
}
