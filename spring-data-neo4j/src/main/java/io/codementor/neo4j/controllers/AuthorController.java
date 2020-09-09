package io.codementor.neo4j.controllers;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.codementor.neo4j.entities.Author;
import io.codementor.neo4j.services.AuthorService;

@RestController
@RequestMapping("/api/authors")
public class AuthorController {
	
	@Autowired
	private AuthorService authorService;
	
	@GetMapping
	public Collection<Author> getAllAuthors() {
		return authorService.getAll();
	}

}
