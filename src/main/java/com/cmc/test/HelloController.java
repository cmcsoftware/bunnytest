package com.cmc.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/")
public class HelloController {

	@GetMapping("hello")
	public String hello() {
		return "Hello World version 2.1";
	}
}
