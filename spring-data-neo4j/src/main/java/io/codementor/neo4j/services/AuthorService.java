package io.codementor.neo4j.services;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.codementor.neo4j.entities.Author;
import io.codementor.neo4j.repositories.AuthorRepository;

@Service
public class AuthorService {
	
	@Autowired
	private AuthorRepository authorRepository;

	public List<Author> getAll() {
		return authorRepository.getAllAuthors();
		
	}

}
