package jalgor_gen2.leetcode.part2;

public class Q211_WordDictionary {

    class Node {
	char val;
	Node[] children;
	boolean isWord;
	
	Node(char val) {
	    this.val = val;
	    this.children = new Node[26];
	}
    }
    
    Node root;
    
    
    /** Initialize your data structure here. */
    public Q211_WordDictionary() {
        root = new Node('#');
    }
    
    /** Adds a word into the data structure. */
    public void addWord(String word) {
	Node cur = root;
	for ( int i = 0; i < word.length(); i ++ ) {
	    int key = word.charAt(i) - 'a';
	    if ( cur.children[key] == null) {
		cur.children[key] = new Node(word.charAt(i));
	    }
	    cur = cur.children[key];
	}
	cur.isWord = true;
    }
    
    /** Returns if the word is in the data structure. A word could contain the dot character '.' to represent any one letter. */
    public boolean search(String word) {
	return search(word, 0, root);
    }
    
    private boolean search ( String word, int idx, Node cur ) {
	
	if ( idx >= word.length()) 
	    return cur.isWord;
	
	if ( word.charAt(idx) != '.') {
	    int key = word.charAt(idx) - 'a';
	    if ( cur.children[key] == null )
		return false;
	    else
		return search ( word, idx + 1, cur.children[key]);
	}
	else {
	    boolean res = false;
	    for ( int i = 0; i < 26; i++ ) {
		if ( cur.children[i] != null)
		    res = res || search(word, idx + 1, cur.children[i]);
	    }
	    return res;
	}
    }
}
