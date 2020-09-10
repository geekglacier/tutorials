package io.codementor.neo4j.repositories;

import java.util.List;

import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

import io.codementor.neo4j.entities.Book;
@Repository
public interface BookRepository extends Neo4jRepository<Book, Long> {

	Book findByTitle(String title);

	Book findByLanguage(String language);
	
	@Query("MATCH (b:Book) RETURN b")
	List<Book> getAllBooks();

	@Query("MATCH (b:Book) WHERE b.title =~ ('(?i).*'+$str+'.*') RETURN b")
	List<Book> findByTitleContaining(String str);
}
