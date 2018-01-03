package jalgor_gen2.leetcode.part2;

public class Q134_GasStation {

    // https://leetcode.com/problems/gas-station/discuss/42568
    public int canCompleteCircuit(int[] gas, int[] cost){
	
	int tank = 0, total = 0, si = 0;
	
	for ( int i = 0; i < gas.length; i++) {
	    tank += gas[i] - cost[i];
	    
	    if ( tank < 0) {
		si = i + 1;
		total += tank;
		tank = 0;
	    }
	}
	
	return total + tank < 0 ? -1 : si;
    }
    
    // time limit exceeded
    public int canCompleteCircuitV1(int[] gas, int[] cost) {
        
	int n = gas.length;
	int totalGas = 0, totalCost = 0;
	
	for ( int i = 0; i < n; i++) {
	    totalGas += gas[i];
	    totalCost += cost[i];
	}
	
	if ( totalCost > totalGas) return -1;
	
	int si = 0;
	
	while ( si < n ) {
	    
	    int curGas = 0, curCost = 0;
	    int cur = si;
	    
	    while ( curGas >= curCost && curGas < totalGas) {
		curGas += gas[cur];
		curCost += cost[cur];
		
		cur = ( cur + 1 ) % n; 
	    }
	    
	    if ( cur == si) return si;
	    else si = cur;
	}

	return -1;
    }
    
}
