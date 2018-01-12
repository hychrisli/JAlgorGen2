package jalgor_gen2.leetcode.part2;

public class Q058_LastWordLen {

    public int lengthOfLastWord(String s) {
        
	int n = s.length();
	
	while ( n > 0 && s.charAt(n-1) == ' ') n--;
	
	
	for ( int i = n - 1; i >= 0; i --) {
	    if ( s.charAt(i) == ' ') return n - i - 1;
	}
	
	return n;
    }
    
}
