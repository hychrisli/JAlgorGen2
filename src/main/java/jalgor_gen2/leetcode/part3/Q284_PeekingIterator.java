package jalgor_gen2.leetcode.part3;

import java.util.Iterator;

public class Q284_PeekingIterator implements Iterator<Integer>{

    Iterator<Integer> iterator;
    Integer firstVal = null;
    
    public Q284_PeekingIterator(Iterator<Integer> iterator) {
	this.iterator = iterator;
	if ( this.iterator.hasNext())
	    firstVal = this.iterator.next();
    }

    // Returns the next element in the iteration without advancing the iterator.
    public Integer peek() {
	return firstVal == null ? iterator.next() : firstVal;
    }

    // hasNext() and next() should behave the same as in the Iterator interface.
    // Override them if needed.
    @Override
    public Integer next() {
	
	Integer res = firstVal;
	
	if ( firstVal == null ) 
	    return iterator.next();
	else if ( iterator.hasNext())
	    firstVal = iterator.next();
	else
	    firstVal = null;
    
    	return res;
    }

    @Override
    public boolean hasNext() {
	return firstVal != null;
    }

}
