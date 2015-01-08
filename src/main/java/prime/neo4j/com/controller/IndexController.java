package prime.neo4j.com.controller;

import org.neo4j.graphdb.DynamicLabel;
import org.neo4j.graphdb.GraphDatabaseService;
import org.neo4j.graphdb.Node;
import org.neo4j.graphdb.ResourceIterable;
import org.neo4j.graphdb.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.neo4j.support.Neo4jTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
	
	@Autowired Neo4jTemplate template;
	
	@RequestMapping("/index")
	public String index() {
		GraphDatabaseService gds = template.getGraphDatabaseService();
		Transaction tx = gds.beginTx();
		
		ResourceIterable<Node> sentiments = gds.findNodesByLabelAndProperty(DynamicLabel.label("Sentiment"), "sentiment", "positive");
		
		for (Node node : sentiments) {
			System.out.println(node.getId());
//			System.out.println(node.getDegree());
//			System.out.println(node.);
		}
		
		
		
		
		tx.success(); 
		tx.finish();
		
		
		
		return "index";
	}
}
