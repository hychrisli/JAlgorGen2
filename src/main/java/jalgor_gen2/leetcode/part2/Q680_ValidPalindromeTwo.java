package jalgor_gen2.leetcode.part2;

import jalgor_gen2.leetcode.Solution;

public class Q680_ValidPalindromeTwo extends Solution {

    public boolean validPalindrome(String s) {

	int lo = 0, hi = s.length() - 1;
	boolean isDeleted = false;

	while (lo < hi) {
	    // System.out.println(lo + ": " + s.charAt(lo) + ", " + hi + ": " + s.charAt(hi));
	    if (s.charAt(lo) != s.charAt(hi)) {
		if (isDeleted)
		    return false;
		else {
		    if (s.charAt(lo + 1) == s.charAt(hi)) {
			if (lo + 2 >= hi - 1 || s.charAt(lo + 2) == s.charAt(hi - 1)) {
			    lo += 1;
			    isDeleted = true;
			}
		    }

		    if (!isDeleted && s.charAt(lo) == s.charAt(hi - 1)) {
			if (lo + 1 >= hi - 2 || s.charAt(lo + 1) == s.charAt(hi - 2)) {
			    hi -= 1;
			    isDeleted = true;
			}
		    }

		    if (!isDeleted)
			return false;
		}
	    }
	    lo += 1;
	    hi -= 1;
	}

	return true;
    }

}
