package jalgor_gen2.leetcode.part1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import jalgor_gen2.leetcode.AbstractTest;

public class Q638Test_ShopOffers extends AbstractTest<Integer> {

	private Q638_ShopOffers sol = new Q638_ShopOffers();
	
	@Override
	protected void baseTest(Integer expected, Integer actual) {
		this.testAssertEquals(expected, actual);
	}

	// @Test
	public void test1(){
		List<Integer> price = Arrays.asList(new Integer[]{2, 5});
		List<List<Integer>> special = new ArrayList<List<Integer>>();
		special.add(Arrays.asList(new Integer[]{3,0,5}));
		special.add(Arrays.asList(new Integer[]{1,2,10}));
		List<Integer> needs = Arrays.asList(new Integer[]{3,2});
		this.baseTest(14, sol.shoppingOffers(price, special, needs));
	}
	
	
	// @Test
	public void test2(){
		List<Integer> price = Arrays.asList(new Integer[]{2,3,4});
		List<List<Integer>> special = new ArrayList<List<Integer>>();
		special.add(Arrays.asList(new Integer[]{1,1,0,4}));
		special.add(Arrays.asList(new Integer[]{2,2,1,9}));
		List<Integer> needs = Arrays.asList(new Integer[]{1,2,1});
		this.baseTest(11, sol.shoppingOffers(price, special, needs));
	}
	
	
	@Test
	public void test3(){
		List<Integer> price = Arrays.asList(new Integer[]{10,1,1,3,8,3});
		List<List<Integer>> special = new ArrayList<List<Integer>>();
		special.add(Arrays.asList(new Integer[]{0,5,6,5,6,0,14}));
		special.add(Arrays.asList(new Integer[]{6,3,2,1,2,0,11}));
		special.add(Arrays.asList(new Integer[]{3,5,3,3,6,6,12}));
		special.add(Arrays.asList(new Integer[]{0,3,0,6,6,1,25}));
		special.add(Arrays.asList(new Integer[]{4,5,3,2,3,2,15}));
		special.add(Arrays.asList(new Integer[]{2,0,1,6,2,4,2}));
		special.add(Arrays.asList(new Integer[]{4,2,4,5,5,5,22}));
		special.add(Arrays.asList(new Integer[]{3,2,6,3,5,4,9}));
		special.add(Arrays.asList(new Integer[]{4,6,4,6,2,5,1}));
		special.add(Arrays.asList(new Integer[]{3,0,0,6,6,2,18}));
		special.add(Arrays.asList(new Integer[]{1,4,2,3,4,4,1}));
		special.add(Arrays.asList(new Integer[]{3,2,6,6,4,4,2}));
		special.add(Arrays.asList(new Integer[]{1,1,0,5,5,2,15}));
		special.add(Arrays.asList(new Integer[]{0,1,5,4,6,5,7}));
		special.add(Arrays.asList(new Integer[]{3,5,2,4,0,5,20}));
		special.add(Arrays.asList(new Integer[]{3,0,3,6,3,2,3}));
		special.add(Arrays.asList(new Integer[]{5,4,1,6,6,1,7}));
		special.add(Arrays.asList(new Integer[]{2,1,6,1,2,2,8}));
		special.add(Arrays.asList(new Integer[]{0,5,4,3,4,4,4}));
		special.add(Arrays.asList(new Integer[]{2,0,2,5,1,5,7}));
		special.add(Arrays.asList(new Integer[]{4,6,5,0,3,4,19}));
		special.add(Arrays.asList(new Integer[]{0,5,6,3,0,5,8}));
		special.add(Arrays.asList(new Integer[]{0,5,0,0,3,4,15}));
		special.add(Arrays.asList(new Integer[]{5,6,1,1,0,3,15}));
		special.add(Arrays.asList(new Integer[]{1,2,0,3,1,5,12}));
		special.add(Arrays.asList(new Integer[]{2,1,6,3,6,3,7}));
		special.add(Arrays.asList(new Integer[]{4,6,3,3,4,3,3}));
		special.add(Arrays.asList(new Integer[]{1,5,5,6,4,6,19}));
		special.add(Arrays.asList(new Integer[]{4,1,5,3,3,5,25}));
		special.add(Arrays.asList(new Integer[]{2,1,6,4,2,3,7}));
		special.add(Arrays.asList(new Integer[]{0,0,6,2,6,0,7}));
		special.add(Arrays.asList(new Integer[]{4,3,0,3,6,3,5}));
		special.add(Arrays.asList(new Integer[]{4,1,1,6,2,6,10}));
		special.add(Arrays.asList(new Integer[]{5,2,5,5,1,4,8}));
		special.add(Arrays.asList(new Integer[]{4,1,1,2,6,0,20}));
		special.add(Arrays.asList(new Integer[]{5,6,3,0,2,1,12}));
		special.add(Arrays.asList(new Integer[]{2,4,4,4,5,5,11}));
		special.add(Arrays.asList(new Integer[]{0,2,2,3,2,1,13}));
		special.add(Arrays.asList(new Integer[]{3,3,2,5,4,3,24}));
		special.add(Arrays.asList(new Integer[]{3,1,3,0,0,4,20}));
		special.add(Arrays.asList(new Integer[]{3,5,2,3,2,6,1}));
		special.add(Arrays.asList(new Integer[]{6,2,6,4,4,0,24}));
		special.add(Arrays.asList(new Integer[]{6,1,0,2,4,2,18}));
		special.add(Arrays.asList(new Integer[]{0,5,6,1,0,2,20}));
		special.add(Arrays.asList(new Integer[]{0,6,0,1,2,0,16}));
		special.add(Arrays.asList(new Integer[]{5,6,0,2,6,5,7}));
		special.add(Arrays.asList(new Integer[]{3,5,0,0,6,1,25}));
		special.add(Arrays.asList(new Integer[]{1,3,1,6,0,6,3}));
		special.add(Arrays.asList(new Integer[]{0,6,0,0,6,0,23}));
		special.add(Arrays.asList(new Integer[]{1,5,2,4,2,3,18}));
		special.add(Arrays.asList(new Integer[]{1,1,6,4,6,4,4}));
		special.add(Arrays.asList(new Integer[]{3,3,5,2,5,4,21}));
		special.add(Arrays.asList(new Integer[]{5,1,3,5,1,3,8}));
		special.add(Arrays.asList(new Integer[]{0,2,3,6,0,6,3}));
		special.add(Arrays.asList(new Integer[]{3,0,6,4,6,5,23}));
		special.add(Arrays.asList(new Integer[]{3,1,4,6,4,0,24}));
		special.add(Arrays.asList(new Integer[]{0,3,1,5,4,2,8}));
		special.add(Arrays.asList(new Integer[]{5,6,5,3,6,6,3}));
		special.add(Arrays.asList(new Integer[]{6,3,3,0,3,2,8}));
		special.add(Arrays.asList(new Integer[]{0,6,5,3,0,0,10}));
		special.add(Arrays.asList(new Integer[]{2,6,0,3,2,1,2}));
		special.add(Arrays.asList(new Integer[]{6,2,3,5,1,6,2}));
		special.add(Arrays.asList(new Integer[]{5,5,2,4,2,3,7}));
	
		List<Integer> needs = Arrays.asList(new Integer[]{3,6,1,4,5,4});
		this.baseTest(49, sol.shoppingOffers(price, special, needs));
	}
	
}
