package jalgor_gen2.leetcode.part2;

import java.util.HashMap;
import java.util.Map;


// Unnecessary Additional class. 
public class Q208_Trie {

    class Node {
	char val;
	Node[] children;

	Node(char val) {
	    this.val = val;
	    this.children = new Node[27];
	}
    }

    private Node root;

    /** Initialize your data structure here. */
    public Q208_Trie() {
	root = new Node('#');
    }

    /** Inserts a word into the trie. */
    public void insert(String word) {
	Node cur = root;
	for (int i = 0; i < word.length(); i++) {
	    int key = word.charAt(i) - 'a';
	    if (cur.children[key] == null)
		cur.children[key] = new Node(word.charAt(i));
	    cur = cur.children[key];
	}
	
	cur.children[26] = new Node('#');
    }

    /** Returns if the word is in the trie. */
    public boolean search(String word) {

	Node cur = root;
	for (int i = 0; i < word.length(); i++) {
	    int key = word.charAt(i) - 'a';
	    if (cur.children[key] == null)
		return false;
	    cur = cur.children[key];
	}
	
	if (cur.children[26] != null) return true;
	
	return false;
    }

    /**
     * Returns if there is any word in the trie that starts with the given
     * prefix.
     */
    public boolean startsWith(String prefix) {
	Node cur = root;
	for (int i = 0; i < prefix.length(); i++) {
	    int key = prefix.charAt(i) - 'a';
	    if (cur.children[key] == null)
		return false;
	    cur = cur.children[key];
	}
	return true;
    }

}
