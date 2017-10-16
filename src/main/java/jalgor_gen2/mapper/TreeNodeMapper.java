package jalgor_gen2.mapper;

import java.util.ArrayList;
import java.util.List;

import jalgor_gen2.structure.TreeNode;

public class TreeNodeMapper {
	public static TreeNode toTreeNode(String[] vals){
		// Complete tree 
		
		if ( vals.length == 0 ) return null;
		
		TreeNode root = new TreeNode(Integer.valueOf(vals[0]));
		List<TreeNode> nodeList = new ArrayList<TreeNode>();
		nodeList.add(root);
		
		for ( int i = 1; i < vals.length; i++){
			if ( vals[i].equals("#")){
				nodeList.add(null);
			} else {
				int parent = ( i - 1 ) / 2;
				boolean isLeft = ( i - 1 ) % 2 == 0 ? true : false;
				TreeNode node = new TreeNode(Integer.valueOf(vals[i]));
				nodeList.add(node);
				
				if (isLeft)
					nodeList.get(parent).left = node;
				else
					nodeList.get(parent).right = node;
 			}
		}
		
		return root;
	}
}
