package jalgor_gen2.leetcode.part2;

public class Q165_CompareVersionNum {

    public int compareVersion(String version1, String version2) {
        
	String [] d1 = version1.split(".");
	String [] d2 = version2.split(".");

	int m = d1.length;
	int n = d2.length;
	int l = Math.min(m, n);
	
	for ( int i = 0; i < l; i++) {
	    int val1 = Integer.valueOf(d1[i]);
	    int val2 = Integer.valueOf(d2[i]);
	    
	    if ( val1 < val2 ) return -1;
	    if ( val1 > val2 ) return 1;
	}
	
	
	if ( m > l ){
	    for ( int i = l; i < m; i++) {
		int val = Integer.valueOf(d1[i]);
		if ( val > 0 ) return 1;
	    }
	} else {
	    for ( int i = l; i < n; i++) {
		int val = Integer.valueOf(d2[i]);
		if ( val > 0) return -1;
	    }
	}
	
	return 0;

    }
    
}
