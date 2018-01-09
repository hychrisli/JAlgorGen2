package jalgor_gen2.leetcode.part2;

import java.util.stream.IntStream;

public class Q038_CountAndSay {
    public String countAndSay(int n) {

	String seq = "1";

	while (n > 1) {
	    StringBuilder sb = new StringBuilder();
	    int cnt = 0;
	    char pre = '0';

	    for (int i = 0; i < seq.length(); i++) {
		char cur = seq.charAt(i);
		if (cur == pre)
		    cnt++;
		else {
		    if (cnt > 0) {
			sb.append(cnt);
			sb.append(pre);
		    }

		    pre = cur;
		    cnt = 1;
		}
	    }

	    sb.append(cnt);
	    sb.append(pre);
	    seq = sb.toString();
	    n -= 1;
	}

	return seq;
    }
}
