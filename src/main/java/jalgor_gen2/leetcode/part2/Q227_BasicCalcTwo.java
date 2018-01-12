package jalgor_gen2.leetcode.part2;

import java.util.Stack;

public class Q227_BasicCalcTwo {

    public int calculate(String s) {
        
	s += "+"; // end of the expression
	Stack<Integer> stk = new Stack<Integer>();
	int val = 0;
	char op = '+';
	
	for ( int i = 0; i < s.length(); i ++ ) {
	    
	    if ( s.charAt(i) == ' ') continue;
	    if ( s.charAt(i) < '0') {
		
		if ( op == '+') stk.push(val);
		else if (op == '-') stk.push(-val);
		else if (op == '*') stk.push(stk.pop() * val);
		else stk.push(stk.pop() / val);
		
		val = 0;
		op = s.charAt(i);
	    } else {
		val = val * 10 + s.charAt(i) - '0';
	    }
	}
	
	int res = 0;
	while (! stk.isEmpty()) res += stk.pop();
	
	return res;
    }
    
}
