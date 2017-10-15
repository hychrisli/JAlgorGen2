package jalgor_gen2.leetcode;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;

public abstract class AbstractTest<T> {

	protected abstract void baseTest(T expected, T actual);
	
	protected void testAssertEquals(T expected, T actual){
		Assert.assertEquals(expected, actual);
	}
	
	protected void testAssertyArrayEquals(T[] expected, T[] actual){
		Assert.assertArrayEquals(expected, actual);
	}
	
	protected void testLogicEqualTo(T expected, T actual){
		Assert.assertThat(actual, CoreMatchers.equalTo(expected));
	}
	
}
