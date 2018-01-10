package jalgor_gen2.leetcode.part2;

import java.util.HashMap;
import java.util.Map;

public class Q166_RecurDecimal {

    public String fractionToDecimal(int numerator, int denominator) {

	StringBuilder sb = new StringBuilder();

	long aVal = numerator;
	long bVal = denominator;

	if ( aVal == 0 ) return "0";
	
	if (aVal < 0 && bVal < 0) {
	    aVal = -aVal;
	    bVal = -bVal;
	} else if (aVal < 0 || bVal < 0) {
	    aVal = Math.abs(aVal);
	    bVal = Math.abs(bVal);
	    sb.append('-');
	}

	while (aVal > bVal) {
	    sb.append(aVal / bVal);
	    aVal %= bVal;
	}

	if (aVal > 0) {
	    if (sb.length() == 0 || sb.charAt(sb.length() - 1) == '-')
		sb.append('0');
	    sb.append('.');
	} else
	    return sb.toString();

	StringBuilder fsb = new StringBuilder();
	Map<Integer, Integer> remLkp = new HashMap<Integer, Integer>();
	int idx = 0;
	remLkp.put((int) aVal, 0);

	while (aVal != 0) {
	    aVal *= 10;
	    fsb.append(aVal / bVal);
	    aVal = aVal % bVal;
	    int remainder = (int) aVal;

	    if (remLkp.containsKey(remainder)) {
		sb.append(fsb.subSequence(0, remLkp.get(remainder)));
		sb.append('(');
		sb.append(fsb.subSequence(remLkp.get(remainder), fsb.length()));
		sb.append(')');
		return sb.toString();
	    }

	    remLkp.put(remainder, ++idx);
	}
	sb.append(fsb);
	return sb.toString();
    }
}
