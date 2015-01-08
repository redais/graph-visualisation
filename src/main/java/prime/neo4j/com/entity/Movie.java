package prime.neo4j.com.entity;

import org.springframework.data.neo4j.annotation.GraphId;
import org.springframework.data.neo4j.annotation.Indexed;
import org.springframework.data.neo4j.annotation.NodeEntity;

@NodeEntity 
public class Movie {
    
	@GraphId 
	private Long nodeId;
	
	@Indexed(unique=true) 
	private String id;
	
	private String title;
    private int year;
    
    public Movie(){
    	
    }
    
    public Movie(String id, String title, int year) {
		this.id = id;
		this.title = title;
		this.year = year;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public long getNodeId() {
		// TODO Auto-generated method stub
		return this.nodeId;
	}
}