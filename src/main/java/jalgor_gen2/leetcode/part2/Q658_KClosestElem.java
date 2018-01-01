package jalgor_gen2.leetcode.part2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import jalgor_gen2.leetcode.Solution;

public class Q658_KClosestElem extends Solution {

    // https://leetcode.com/problems/find-k-closest-elements/discuss/106419
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
	
	int lo = 0, hi = arr.length - k;
	List<Integer> res = new ArrayList<Integer>();
	
	while ( lo < hi ) {
	    
	    int mid = ( lo + hi ) / 2;
	    
	    if ( x - arr[mid] > arr[mid + k] - x) 
		lo = mid + 1;
	    else 
		hi = mid;
	}
	
	for ( int i = 0; i < k; i ++)
	    res.add(arr[i+lo]);
	
	return res;
    }

    // Version 1
    public List<Integer> findClosestElementsV1(int[] arr, int k, int x) {

	int n = arr.length, lo = 0, hi = n;
	List<Integer> res = new ArrayList<Integer>();

	while (lo < hi) {

	    int mid = (lo + hi) / 2;
	    // System.out.println("mid: " + mid + ", val: " + arr[mid]);
	    if (x < arr[mid])
		hi = mid;
	    else if (x > arr[mid])
		lo = mid + 1;
	    else {
		lo = mid + 1;
		break;
	    }
	}
	lo -= 1;
	int si = lo - 1, ei = lo + 1;
	k -= 1;

	if (lo < 0) {
	    si += 1;
	    k += 1;
	} else if (lo >= n) {
	    ei -= 1;
	    k += 1;
	}

	// System.out.println("lo: " + lo + ", si: " + si + ", ei: " + ei);

	while (k-- > 0) {

	    if (si < 0)
		ei++;
	    else if (ei >= n)
		si--;
	    else if (x - arr[si] <= arr[ei] - x)
		si--;
	    else
		ei++;
	}

	for (int i = si + 1; i < ei; i++)
	    res.add(arr[i]);

	// System.out.println(Arrays.toString(res.toArray()));

	return res;
    }

}
