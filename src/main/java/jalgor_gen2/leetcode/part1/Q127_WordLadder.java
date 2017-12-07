package jalgor_gen2.leetcode.part1;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

import jalgor_gen2.leetcode.Solution;

public class Q127_WordLadder extends Solution {

    public int ladderLength(String beginWord, String endWord, List<String> wordList) {

	Map<String, Boolean> wordMap = new HashMap<String, Boolean>();
	Queue<String> curlvl = new LinkedList<String>();
	Queue<String> newlvl = new LinkedList<String>();

	for (String word : wordList)
	    wordMap.put(word, false);

	int wordLen = beginWord.length();
	curlvl.add(beginWord);
	int cnt = 1;

	while (!curlvl.isEmpty()) {
	    String word = curlvl.poll();
	    if (word.equals(endWord))
		return cnt;

	    char[] chrs = word.toCharArray();
	    
	    for (int i = 0; i < wordLen; i++) {
		for (char c = 'a'; c <= 'z'; c++) {
		    if (c != chrs[i]){
			char cur = chrs[i];
			chrs[i] = c;
			String nxtWord = new String(chrs);
			//log.info(nxtWord);
			chrs[i] = cur;
			
			if (wordMap.containsKey(nxtWord) && !wordMap.get(nxtWord)) {
			    //log.info(nxtWord);
			    newlvl.add(nxtWord);
			    wordMap.put(nxtWord, true);
			}
		    }
		}
	    }
	    
	    if (curlvl.isEmpty()) {
		cnt += 1;
		curlvl = newlvl;
		newlvl = new LinkedList<String>();
	    }
	}
	return 0;
    }

}
