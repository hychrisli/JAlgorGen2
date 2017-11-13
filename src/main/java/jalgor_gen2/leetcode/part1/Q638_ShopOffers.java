package jalgor_gen2.leetcode.part1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jalgor_gen2.leetcode.Solution;

public class Q638_ShopOffers extends Solution {
	public int shoppingOffers(List<Integer> price, 
			List<List<Integer>> special, 
			List<Integer> needs) {
		
		Map<String, Integer> dplkp = new HashMap<String, Integer>();
		
		for ( int i = 0; i < price.size(); i++ ){
			
			List<Integer> regular = new ArrayList<Integer>(Collections.nCopies(price.size() + 1, 0));
			regular.set(price.size(), price.get(i));
			regular.set(i, 1);
			special.add(regular);
		}
		
		dplkp.put(Arrays.toString(new int[needs.size()]), 0);
		
		return helper(special, needs, 0, dplkp);
	}
	
	
	private Integer helper(List<List<Integer>> offers, List<Integer> needs, int idx, Map<String, Integer> dplkp){
		String key = Arrays.toString(needs.toArray());
		log.info(key + " ---- " + idx);
		int n = needs.size();
		if ( dplkp.containsKey(key)) 
			return dplkp.get(key);
		
		Integer value = Integer.MAX_VALUE;
		for ( int i = 0; i < offers.size(); i++){
			
			List<Integer> needs2 = new ArrayList<Integer>(needs);
			boolean valid = true;
			for (int j = 0; j < n; j++){
				needs2.set(j, needs2.get(j) - offers.get(i).get(j));
				if ( needs2.get(j) < 0) {
					valid = false;
					break;
				}
			}
			
			if (valid){
				Integer pre =  helper(offers, needs2, i, dplkp);
				if (pre < Integer.MAX_VALUE)
					value = Math.min(value,  pre + offers.get(i).get(n));	
			}
		}
		
		// value = Math.min(value, dplkp.getOrDefault(key, Integer.MAX_VALUE));
		dplkp.put(key, value);
		return value;
	}
	
	
	
	
	public int shoppingOffers_v1(List<Integer> price, 
			List<List<Integer>> special, 
			List<Integer> needs) {
        
		for ( int i = 0; i < price.size(); i++ ){
			
			List<Integer> regular = new ArrayList<Integer>(Collections.nCopies(price.size() + 1, 0));
			regular.set(price.size(), price.get(i));
			regular.set(i, 1);
			special.add(regular);
		}
		
		/*for ( List<Integer> elem : special)
			log.info(Arrays.toString(elem.toArray()));*/
		
		int[] minPrice = {Integer.MAX_VALUE};
		
		helper_v1(special, needs, 0, 0, minPrice);
		
		return minPrice[0];
    }
	
	private void helper_v1 (List<List<Integer>> offers, List<Integer> needs, int idx, int curPrice, int[] minPrice ){
		
		boolean isDone = true;
		
		if ( curPrice >= minPrice[0]) return;
		
		for ( Integer need : needs )
			if ( need < 0)
				return;
			else if ( need > 0 )
				isDone = false;
			
		if ( isDone )
			minPrice[0] = Math.min(minPrice[0], curPrice);
		
		for ( int i = idx; i < offers.size(); i++){
			
			for ( int j = 0; j < needs.size(); j++)
				needs.set(j, needs.get(j) - offers.get(i).get(j));
			
			helper_v1(offers, needs, i, curPrice + offers.get(i).get(needs.size()), minPrice);
			
			for ( int j = 0; j < needs.size(); j++)
				needs.set(j, needs.get(j) + offers.get(i).get(j));
		}
	}
	
}
