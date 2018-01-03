package jalgor_gen2.leetcode.part2;

public class Q130_SurroundedRegions {

    public void solve(char[][] board) {
        
	int m = board.length;
	if ( m < 1 ) return;
	int n = board[0].length;
	
	for ( int i = 0; i < m ; i++) {
	    if ( board[i][0] == 'O')
		dfs(board, i, 0);
	    if ( board[i][n-1] == 'O')
		dfs(board, i, n-1);
	}
	
	for ( int j = 1; j < n-1; j++) {
	    if ( board[0][j] == 'O')
		dfs(board, 0, j);
	    if ( board[m-1][j] == 'O')
		dfs(board, m-1, j);
	}
	
	
	for ( int i = 0; i < m; i++) 
	    for ( int j = 0; j < n; j++) {
		if ( board[i][j] == 'O')
		    board[i][j] = 'X';
		else if ( board[i][j] == '1')
		    board[i][j] = 'O';
	    }
    }
    
    public void dfs(char[][] board, int x, int y) {
	if (board[x][y] != 'O')
	    return;
	
	board[x][y] = '1';
	if ( x < board.length - 1)
	    dfs(board, x + 1, y);
	if ( x > 0 )
	    dfs(board, x - 1, y);
	if ( y < board[0].length - 1)
	    dfs(board, x, y + 1);
	if ( y > 0)
	    dfs(board, x, y - 1);
    }
    
}
