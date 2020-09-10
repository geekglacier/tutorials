package io.codementor.neo4j.services;

import java.util.List;
import java.util.Optional;

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
	
	public Author saveAuthor(Author author) {
		return authorRepository.save(author);
	}
	
	public Optional<Author> getAuthorById(Long id) {
		return authorRepository.findById(id);
	}
	
	public void deleteAuthor(Long id) {
		authorRepository.deleteById(id);
	}
	
	public Long getCountOfAuthors() {
		return authorRepository.count();
	}
	
	public void deleteAllAuthors() {
		authorRepository.deleteAll();
	}

}
