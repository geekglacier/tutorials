package com.geekglacier.spring.cloud.eureka.book_service.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/books")
public class BookController {

	@GetMapping
	public List<String> getBookList() {
		return List.of("book1", "book2", "book3");
	}
}
