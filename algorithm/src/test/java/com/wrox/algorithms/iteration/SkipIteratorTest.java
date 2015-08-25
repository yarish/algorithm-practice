package com.wrox.algorithms.iteration;

import junit.framework.TestCase;

public class SkipIteratorTest extends TestCase {
	

	Object array[] = new Object[] { "A", "B", "C", "D", "E", "F", "G", "H",
			"I", "J", "K" };
	ArrayIterator iterator = new ArrayIterator(array);
	SkipIterator skip_iterator = new SkipIterator(iterator, 2);
	
	public void testIterationsRespectsBounds(){
		
		skip_iterator.first();
		assertFalse(skip_iterator.isDone());
		assertSame(array[0], skip_iterator.current());

		skip_iterator.next();
		assertFalse(skip_iterator.isDone());
		assertSame(array[3], skip_iterator.current());

		skip_iterator.next();
		assertFalse(skip_iterator.isDone());
		assertSame(array[6], skip_iterator.current());

		
		skip_iterator.next();
		assertFalse(skip_iterator.isDone());
		assertSame(array[9], skip_iterator.current());


	}
	
	
	
	public void testIterationsRespectsBoundsReverseOrder(){
		
		skip_iterator.last();
		assertFalse(skip_iterator.isDone());
		System.out.println("skip_iterator.current()="+skip_iterator.current());
		assertSame(array[10], skip_iterator.current());

		skip_iterator.previous();
		assertFalse(skip_iterator.isDone());
		System.out.println("skip_iterator.current()="+skip_iterator.current());
		assertSame(array[7], skip_iterator.current());

		skip_iterator.previous();
		assertFalse(skip_iterator.isDone());
		System.out.println("skip_iterator.current()="+skip_iterator.current());
		assertSame(array[4], skip_iterator.current());

		
		skip_iterator.previous();
		assertFalse(skip_iterator.isDone());
		System.out.println("skip_iterator.current()=" + skip_iterator.current());
		assertSame(array[1], skip_iterator.current());


	}

}
