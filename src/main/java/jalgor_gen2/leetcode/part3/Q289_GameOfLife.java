package jalgor_gen2.leetcode.part3;

public class Q289_GameOfLife {
    public void gameOfLife(int[][] board) {
        
	int m = board.length;
	if ( m < 1 ) return;
	int n = board[0].length;
	
	for ( int row = 0; row < m; row ++) {
	    for ( int col = 0; col < n; col++) {
		
		int cnt = 0;
		    
	    	for ( int i = row - 1; i < row + 2; i ++ ) {
	    	    if ( i >= 0 && i < m) {
	    		for ( int j = col - 1; j < col + 2; j ++) {
	    		    if ( j >=0 && j < n && ( i != row || j != col)) {
	    			cnt += board[i][j] % 2; 
	    		    }
	    		}
	    	    }
	    	}
		
	    	if ((cnt > 3  || cnt < 2 ) && (board[row][col] == 1) 
	    		|| (cnt == 3 && board[row][col] == 0)) board[row][col] += 2;
	    }
	}
	
	for ( int i = 0; i < m ; i++)
	    for ( int j = 0; j < n; j++)
		if ( board[i][j] > 1 ) 
		    board[i][j] = ( board[i][j] - 1 ) % 2;
	
    }
}
