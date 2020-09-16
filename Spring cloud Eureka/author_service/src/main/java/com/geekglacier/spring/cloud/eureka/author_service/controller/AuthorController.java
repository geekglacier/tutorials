package com.geekglacier.spring.cloud.eureka.author_service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/authors")
public class AuthorController { 
	
	@Autowired
	private RestTemplate restTemplate;

	@GetMapping("/books")
	public String getAllBooks() {
		return restTemplate.getForObject("http://BOOK-SERVICE/books", String.class);
	}
}
