package jalgor_gen2.leetcode.part2;

public class Q275_HIndexTwo {
    
    // binary search
    public int hIndex(int[] citations) {
        
	int len =  citations.length;
	int lo = 0, hi = len - 1;
	int res = 0;
	
	while ( lo < hi ) {
	    int mid = (lo + hi) / 2;
	    if ( citations[mid] == len - mid ) return citations[mid];
	    else if ( citations[mid] < len - mid ) lo = mid + 1;
	    else hi = mid;
	}
	return res;
    }
    
}
