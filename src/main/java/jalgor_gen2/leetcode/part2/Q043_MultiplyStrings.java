package jalgor_gen2.leetcode.part2;

import java.util.Arrays;

import jalgor_gen2.leetcode.Solution;

public class Q043_MultiplyStrings extends Solution {

    public String multiply(String num1, String num2) {

	if (num1.equals("0") || num2.equals("0")) return "0";
	
	int m = num1.length(), n = num2.length();
	
	int[] res = new int[m+n];
	int carryOn = 0;
	
	for ( int i = m - 1; i >= 0; i--) {
	    carryOn = 0;
	    for ( int j = n - 1; j >= 0; j--) {
		int k = i + j + 1;
		int val = res[k] + carryOn + ( num1.charAt(i) - '0') * (num2.charAt(j) - '0');
		carryOn = val / 10;
		res[k] = val % 10;
	    }
	    res[i] = carryOn;
	}
	
	int si = res[0] == 0 ? 1 : 0;
	
	StringBuilder sb = new StringBuilder();
	for ( int i = si; i < m + n; i ++)
	    sb.append(res[i]);
	
	return sb.toString();
    }

}
