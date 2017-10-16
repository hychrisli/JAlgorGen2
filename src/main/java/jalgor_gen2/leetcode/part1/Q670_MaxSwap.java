package jalgor_gen2.leetcode.part1;

import java.util.Arrays;

import jalgor_gen2.leetcode.Solution;

public class Q670_MaxSwap extends Solution {
    public int maximumSwap(int num) {
        
    	char[] digits = Integer.toString(num).toCharArray();
    	int[] lkp = new int[10];
    	
    	for ( int i = 0; i < digits.length; i ++ )
    		lkp[digits[i] - '0'] = i; 
    	
    	for ( int i = 0; i < digits.length; i ++ ){
    		for ( int j = 9; j > digits[i] - '0'; j --){
    			if (lkp[j] > i){
    				digits[lkp[j]] = digits[i];
    				digits[i] = (char) ('0' + j);
    				return Integer.valueOf(new String(digits));
    			}
    		}
    	}
    	
    	return num;
    }
}
