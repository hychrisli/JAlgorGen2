package jalgor_gen2.leetcode.part2;

import java.util.ArrayList;
import java.util.List;

public class Q093_RestoreIPAddresses {
    public List<String> restoreIpAddresses(String s) {
        List<String> res = new ArrayList<String>();
        backtrack(res, s, new int[4], 0, 0);
	return res;
    }
    
    private static void backtrack(List<String> res, String s, int[] nums, int start, int pos) {
	if ( pos > 3 ) {
	    if ( start == s.length()) {
		StringBuilder sb = new StringBuilder();
		for ( int num : nums)
		    sb.append(num + ".");
		sb.setLength(sb.length() - 1);
		res.add(sb.toString());
	    }
	    return;
	} else {
	    int val = 0;
	    for ( int i = start; i < s.length(); i ++ ) {
		// multiple zeros
		if ( i > start && s.charAt(i-1) == '0' && val == 0)
		    break;
		val = val * 10 + s.charAt(i) - '0';
		if ( val > 255 ) break;
		nums[pos] = val;
		backtrack(res, s, nums, i + 1, pos + 1);
		nums[pos] = -1;
	    }
	}
    }
}
