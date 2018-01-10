package jalgor_gen2.leetcode.part2;

public class Q067_AddBinary {

    public String addBinary(String a, String b) {

	StringBuilder sb = new StringBuilder();
	int m = a.length(), n = b.length(), carryOn = 0;
	
	for ( int i = m - 1, j = n - 1; i >= 0 || j >= 0; i--, j--) {
	    int aVal = i < 0 ? 0 : a.charAt(i) - '0';
	    int bVal = j < 0 ? 0 : b.charAt(j) - '0';
	    sb.append((aVal + bVal + carryOn) % 2 );
	    carryOn = (aVal + bVal + carryOn) / 2;
	}
	
	if ( carryOn > 0) sb.append(carryOn);
	
	return sb.reverse().toString();
    }
    
}
