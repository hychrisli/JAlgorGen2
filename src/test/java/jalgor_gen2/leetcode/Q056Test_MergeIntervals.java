package jalgor_gen2.leetcode;

import static org.hamcrest.CoreMatchers.equalTo;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import structure.Interval;

public class Q056Test_MergeIntervals extends AbstractTest<List<Interval>> {
	
	private Q056_MergeIntervals sol = new Q056_MergeIntervals();
	
	@Override
	protected void baseTest(List<Interval> expected, List<Interval> actual) {
		Assert.assertThat(actual, equalTo(expected));
	}

	@Test
	public void test1(){
		List<Interval> input = new ArrayList<Interval>();
		input.add(new Interval(1, 3));
		input.add(new Interval(2, 6));
		input.add(new Interval(8, 10));
		input.add(new Interval(15, 18));
		
		List<Interval> output = new ArrayList<Interval>();
		output.add(new Interval(1,6));
		output.add(new Interval(8,10));
		output.add(new Interval(15,18));
		
		this.baseTest(output, sol.merge(input));
		
	}
	
}
