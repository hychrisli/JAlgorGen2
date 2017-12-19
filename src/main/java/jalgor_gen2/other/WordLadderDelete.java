package jalgor_gen2.other;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class WordLadderDelete {

    
    public static int  getLongestPath(String startWord, Set<String> dict) {
	
	int wLen = startWord.length();
	int maxPath = 0;
	
	if (wLen < 1 || ! dict.contains(startWord))
	    return maxPath;
	
	for (int i = 0; i < wLen; i++) {
	    String left = startWord.substring(0, i);
	    String right = startWord.substring(i + 1, wLen);
	    System.out.println(left + right);
	    maxPath = Math.max(maxPath, getLongestPath(left + right, dict) + 1);
	}
	return maxPath;
    }
    
    public static int getLongestPath(String startWord, Set<String> dict, List<String> path) {
	int wLen = startWord.length();
	int maxPathLen = 0;
	
	if (wLen < 1 || ! dict.contains(startWord))
	    return maxPathLen;
	
	String pathWord = "";
	
	for (int i = 0; i < wLen; i++) {
	    String left = startWord.substring(0, i);
	    String right = startWord.substring(i + 1, wLen);
	    String newWord = left + right;
	    System.out.println(newWord);
	    int curPathLen = getLongestPath(newWord, dict, path) + 1;
	    if (curPathLen > maxPathLen) {
		maxPathLen = curPathLen;
		pathWord = newWord;
	    }
	}
	
	if (!pathWord.equals("")) 
	    path.add(pathWord);
	
	return maxPathLen;
	
    }
    
    
    public static void main (String[] args) throws IOException {
	Scanner scan = new Scanner(System.in);
	int num = scan.nextInt();
	Set<String> dict = new HashSet<String>();
	
	while(num > 0){
	    dict.add(scan.next());
	    num -= 1;
	}
	
	String startWord = scan.next();	
	scan.close();

	List<String> path = new ArrayList<String>();
	
	// System.out.println(WordLadderDelete.getLongestPath(startWord, dict));
	System.out.println(WordLadderDelete.getLongestPath(startWord, dict, path));
	path.add(startWord);
	System.out.println(Arrays.toString(path.toArray()));
    }
}
