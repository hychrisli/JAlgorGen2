package jalgor_gen2.leetcode;

import org.junit.Assert;
import org.junit.Test;

public class Q621Test_TaskScheduler extends AbstractTest<Integer> {

	private Q621_TaskScheduler sol = new Q621_TaskScheduler();
	
	@Override
	protected void baseTest(Integer expected, Integer actual) {
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void test1(){
		char[] tasks = {'A','A','A','B','B','B'};
		this.baseTest(8, sol.leastInterval(tasks, 2));
	}
	
	
	@Test
	public void test2(){
		char[] tasks = {'A','A','A','B','B'};
		this.baseTest(7, sol.leastInterval(tasks, 2));
	}

	@Test
	public void test3(){
		char[] tasks = {'A','A','A','B','B','C','C','C'};
		this.baseTest(10, sol.leastInterval(tasks, 3));
	}

	
	@Test
	public void test4(){
		char[] tasks = {'A','A','A','B','B'};
		this.baseTest(5, sol.leastInterval(tasks, 0));
	}
	
	@Test
	public void test5(){
		char[] tasks = {'A','A','A','A','B','B', 'C', 'C', 'C'};
		this.baseTest(9, sol.leastInterval(tasks, 1));
	}
	
	
	@Test
	public void test6(){
		char[] tasks = {'A','A','A','A','B','B', 'C', 'C', 'C'};
		this.baseTest(10, sol.leastInterval(tasks, 2));
	}
	

}
