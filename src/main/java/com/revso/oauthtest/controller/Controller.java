package com.revso.oauthtest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@GetMapping("/")
	public String hello() {
		return "Hello Revso";
	}
	
	@GetMapping("/restricted")
	public String restricted() {
		return "to see this text you need to be logged in!";
	}
}
