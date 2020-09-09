package io.codementor.neo4j.repositories;

import java.util.List;

import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

import io.codementor.neo4j.entities.Author;

@Repository
public interface AuthorRepository extends Neo4jRepository<Author, Long> {

	@Query("MATCH (au:Author)<-[a:AUTHORED]-(b:Book) RETURN au,a,b")
	List<Author> getAllAuthors();
}
