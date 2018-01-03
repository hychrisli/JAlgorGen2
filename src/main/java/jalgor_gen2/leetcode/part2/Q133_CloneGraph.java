package jalgor_gen2.leetcode.part2;

import java.util.HashMap;
import java.util.Map;

import jalgor_gen2.structure.UndirectedGraphNode;

public class Q133_CloneGraph {

    Map<UndirectedGraphNode, UndirectedGraphNode> lkp = 
	    new HashMap<UndirectedGraphNode, UndirectedGraphNode>();

    public UndirectedGraphNode cloneGraph(UndirectedGraphNode node) {

	if ( node == null ) return null;
	if (lkp.containsKey(node)) return lkp.get(node);
	
	UndirectedGraphNode nn = new UndirectedGraphNode(node.label);
	lkp.put(node, nn);
	
	for (UndirectedGraphNode neighbor: node.neighbors){
	    nn.neighbors.add(cloneGraph(neighbor));
	}
	
	return nn;
    }

}
