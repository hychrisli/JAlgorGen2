package jalgor_gen2.leetcode.part2;

import jalgor_gen2.leetcode.Solution;

public class Q516_MaxPalindromSubSeq extends Solution {

    String s;
    int[][] lkp;

    public int longestPalindromeSubseq(String s) {

	int n = s.length();

	this.s = s;
	this.lkp = new int[n][n];

	return helper(0, n - 1);
    }

    private int helper(int lo, int hi) {

	if (lo > hi)
	    return 0;
	else if (lo == hi)
	    return 1;
	else if (lkp[lo][hi] > 0)
	    return lkp[lo][hi];

	int res = 0;

	if (s.charAt(lo) == s.charAt(hi))
	    res = helper(lo + 1, hi - 1) + 2;
	else
	    res = Math.max(helper(lo + 1, hi), helper(lo, hi - 1));

	lkp[lo][hi] = res;

	return res;

    }

}
