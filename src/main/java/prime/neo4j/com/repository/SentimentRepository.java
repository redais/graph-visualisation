package prime.neo4j.com.repository;

import org.springframework.data.neo4j.repository.GraphRepository;



import prime.neo4j.com.entity.Movie;
import prime.neo4j.com.entity.Sentiment;

public interface SentimentRepository extends GraphRepository<Sentiment>{
	
}
