package jalgor_gen2.other;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class IsTree {

    private final static int E1 = 0;
    private final static int E2 = 1;
    private final static int E3 = 2;
    private final static int E4 = 3;
    private final static int E5 = 4;
    private final static String[] errorCode = { "E1", "E2", "E3", "E4", "E5" };

    boolean[] visited = new boolean[26];
    int totalVisits = 0;
    boolean[] errors = new boolean[5];

    public class Node {

	char val;
	Node parent;
	Node left;
	Node right;

	Node(char val) {
	    this.val = val;
	}

	public String toString() {
	    char leftVal = '0', rightVal = '0';

	    if (left != null)
		leftVal = left.val;

	    if (right != null)
		rightVal = right.val;

	    return "(" + val + "(" + leftVal + "," + rightVal + "))";
	}

    }

    public String sExp(String input) {

	Node[] nodeDict = new Node[26];
	int nodeNum = 0;
	Node root = null;
	String[] rs = input.split("\\s+");
	

	for (String r : rs) {
	    char pVal = r.charAt(1);
	    char cVal = r.charAt(3);
	    int pIdx = pVal - 'A';
	    int cIdx = cVal - 'A';

	    // System.out.println( pIdx + "," + cIdx);

	    if (nodeDict[pIdx] == null) {
		nodeDict[pIdx] = new Node(pVal);
		root = nodeDict[pIdx];
		nodeNum += 1;
	    }

	    if (nodeDict[cIdx] == null){
		nodeDict[cIdx] = new Node(cVal);
		nodeNum += 1;
	    }
		
	    nodeDict[cIdx].parent = nodeDict[pIdx];
	    
	    if (nodeDict[pIdx].left == null)
		// new parent
		nodeDict[pIdx].left = nodeDict[cIdx];
	    else if (nodeDict[pIdx].right == null) {
		// still a spot
		if (nodeDict[pIdx].left.val < nodeDict[cIdx].val)
		    // left node set
		    nodeDict[pIdx].right = nodeDict[cIdx];
		else if (nodeDict[pIdx].left.val > nodeDict[cIdx].val) { 
		    // left node is larger. swap
		    nodeDict[pIdx].right = nodeDict[pIdx].left;
		    nodeDict[pIdx].left = nodeDict[cIdx];
		} else // duplicate edges
		    errors[E2] = true;
	    } else { // both spots taken
		if (nodeDict[pIdx].left == nodeDict[cIdx] || nodeDict[pIdx].right == nodeDict[cIdx])
		    // duplicate edges
		    errors[E2] = true;
		else { // More than 2 children
		    errors[E1] = true;
		    break;
		}
	    }

	}

	for (int i = E1; i <= E2; i++) {
	    if (errors[i])
		return errorCode[i];
	}
	//System.out.println(Arrays.toString(nodeDict));
	
	while (root.parent != null)
	    root = root.parent;
	
	String res = preOrder(root);
	
	// Multiple roots
	if (totalVisits < nodeNum)
	    errors[E4] = true;
	
	for (int i = E3; i <= E5; i++) {
	    if (errors[i])
		return errorCode[i];
	}
	
	return res;
    }

    private String preOrder(Node node) {
	
	if (node == null)
	    return "";
	
	//System.out.println(node.val);
	
	if (visited[node.val - 'A']){
	    // cycle present
	    errors[E3] = true;
	    return "";
	}
	else {
	    visited[node.val - 'A'] = true;
	    totalVisits += 1;
	}
	
	String lStr = preOrder(node.left);
	String rStr = preOrder(node.right);
 	
	return  "(" + node.val + lStr + rStr + ")";
    }

    public static void main(String[] args) throws IOException {
	Scanner scan = new Scanner(System.in);
	String input = scan.nextLine();
	IsTree isTree = new IsTree();
	String res = isTree.sExp(input);
	System.out.println(res);
    }
}

// (A,B) (A,C) (B,G) (C,H) (E,F) (B,D) (C,E) "Example"
// (B,D) (D,E) (A,B) (C,F) (E,G) (A,C) "Example"
// (A,B) (A,C) (B,D) (D,C) "Example, E3"
// (A,B) (A,C) (B,D) (B,G) (C,E) (C,D) "E3"
// (A,B) (A,C) (B,D) (F,G) (C,E) (C,D) "E3"
