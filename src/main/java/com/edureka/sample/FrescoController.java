package com.edureka.sample;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FrescoController {
@GetMapping("/hello")
	public String displayName(@RequestParam(value="name", defaultValue="welcome")String name) {
		return "Hello "+name;
		
	}
}
