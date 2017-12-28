package jalgor_gen2.leetcode.part2;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

import jalgor_gen2.leetcode.Solution;

public class Q146_LRUCache extends Solution{

    LinkedHashMap<Integer, Integer> lhm = new LinkedHashMap<Integer, Integer>();
    int capacity;
    
    public Q146_LRUCache(int capacity) {
        this.capacity = capacity;
    }
    
    public int get(int key) {
        
	if ( lhm.containsKey(key)) {
	    Integer value = lhm.get(key);
	    return update(key, value);
	}
	
	return -1;
    }
    
    public void put(int key, int value) {
        
	if ( lhm.containsKey(key) ) {
	    update(key, value);
	} else {
	    lhm.put(key, value);
	    
	    if (lhm.size() > capacity) {
		Entry<Integer, Integer> entry = lhm.entrySet().iterator().next();
		lhm.remove(entry.getKey(), entry.getValue());
	    }
	}
    }
    
    private int update(int key, int value) {
	    lhm.remove(key);
	    lhm.put(key, value);
	    return value;
    }
}
