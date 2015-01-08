package prime.neo4j.com.repository;

import org.springframework.data.neo4j.repository.GraphRepository;


import prime.neo4j.com.entity.Movie;

public interface MovieRepository extends GraphRepository<Movie>{
	
}
