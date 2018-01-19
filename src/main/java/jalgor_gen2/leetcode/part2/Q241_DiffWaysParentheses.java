package jalgor_gen2.leetcode.part2;

import java.util.ArrayList;
import java.util.List;

public class Q241_DiffWaysParentheses {

    public List<Integer> diffWaysToCompute(String input) {
        
	List<Integer> res = new ArrayList<Integer>();
	int val = 0; List<Integer> left = null, right = null;
	
	for ( int i = 0; i < input.length(); i ++) {
	    
	    char c = input.charAt(i);
	    
	    if ( c == '*' || c == '+' || c == '-' ) {
		
		val = 0;
		left = diffWaysToCompute(input.substring(0, i));
		right  = diffWaysToCompute(input.substring(i+1));
		
		for ( Integer lv : left) {
		    for ( Integer rv : right) {
			
			switch(c) {
			case '*':
			    res.add(lv * rv);
			    break;
			case '+':
			    res.add(lv + rv);
			    break;
			case '-':
			    res.add(lv - rv);
			    break;
			}
		    }
		}
	    } else 
		val = val * 10 + c - '0';
	}
	
	if ( res.size() == 0) res.add(val);
	
	return res;
    }
    
}
