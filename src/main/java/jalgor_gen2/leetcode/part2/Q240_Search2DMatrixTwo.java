package jalgor_gen2.leetcode.part2;

public class Q240_Search2DMatrixTwo {

    
    // Better solution
    // https://leetcode.com/problems/search-a-2d-matrix-ii/discuss/66140
    public boolean searchMatrix(int[][] matrix, int target) {
	
	if ( matrix.length < 1 || matrix[0].length < 1) return false;
	
	int row = 0, col = matrix[0].length - 1;
	
	while ( row < matrix.length && col >= 0) {
	    if ( matrix[row][col] == target ) return true;
	    if ( matrix[row][col] > target) col--;
	    else row ++;
	}
	return false;
    }
    
    
    // Binary search on each row
    public boolean searchMatrixV1(int[][] matrix, int target) {
	
	if ( matrix.length < 1 || matrix[0].length < 1) return false;
	
	int rlo = 0, rhi = matrix.length;
	
	while ( rlo < rhi ) {
	    int rmid = rlo + ( rhi - rlo ) / 2;
	    if ( matrix[rmid][0] > target)
		rhi = rmid;
	    else 
		rlo = rmid + 1;
	}
	
	for ( int i = 0; i < rlo; i ++ ) {
	    int lo = 0, hi = matrix[0].length;
	    while ( lo < hi ) {
		int mid = lo + (hi - lo) / 2;
		if ( matrix[i][mid] == target) return true;
		if ( matrix[i][mid] > target)
		    hi = mid;
		else 
		    lo = mid + 1;
	    }   
	}
	return false;
    }
    
}
