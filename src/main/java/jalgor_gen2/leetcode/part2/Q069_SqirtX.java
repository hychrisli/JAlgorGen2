package jalgor_gen2.leetcode.part2;

public class Q069_SqirtX {
    
    // Don't use (int) Math.sqrt(x);
    // not so good, because of the type conversion
    public int mySqrt(int x) {

	if ( x == 0 ) return 0;
	
	int lo = 1, hi = Math.min(46340, x);

	while (lo <= hi) {
	    int mid = lo + (hi - lo) / 2;

	    if (mid <= x / mid) {
		if ( mid + 1 > x / ( mid + 1))
		    return mid;
		lo = mid + 1;
	    } else {
		hi = mid - 1;
	    }
	}
	
	return x;
    }
}
