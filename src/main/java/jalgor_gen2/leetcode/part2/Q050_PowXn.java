package jalgor_gen2.leetcode.part2;

import jalgor_gen2.leetcode.Solution;

public class Q050_PowXn extends Solution{
    
    public double myPow(double x, int n) {
        
	if ( n == 0 ) return 1.0;
	
	int myN = n / 2;
	
	double val;
	
	if ( n < 0 ) {
	    myN = -myN;
	    val = 1.0 / myPow(x, myN);
	    x = 1.0 / x;
	} else 
	    val = myPow(x, myN);
	
	if ( n % 2 == 0) 
	    return val * val;
	else 
	    return val * val * x;
    }

}
