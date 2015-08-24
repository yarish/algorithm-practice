package com.wrox.algorithms.iteration;

import junit.framework.TestCase;

public class ReverseIteratorTest extends TestCase {

	public void testIterationsRespectsBounds() {
		Object array[] = new Object[] { "A", "B", "C", "D", "E", "F" };
		ArrayIterator iterator = new ArrayIterator(array, 1, 3);
		ReverseIterator reverseIterator = new ReverseIterator(iterator);

		reverseIterator.first();
		assertFalse(reverseIterator.isDone());
		System.out.println("reverseIterator.current()="
				+ reverseIterator.current());
		assertSame(array[3], reverseIterator.current());

		reverseIterator.next();
		assertFalse(reverseIterator.isDone());
		assertSame(array[2], reverseIterator.current());

		reverseIterator.next();
		assertFalse(reverseIterator.isDone());
		assertSame(array[1], reverseIterator.current());
		reverseIterator.next();
		assertTrue(reverseIterator.isDone());

		try {
			reverseIterator.current();
			fail();
		} catch (IteratorOutOfBoundsException e) {
			// expected
		}
	}

	public void testBackwardsIteration() {
		Object[] array = new Object[] { "A", "B", "C" };
		ArrayIterator iterator = new ArrayIterator(array);
		ReverseIterator reverseIterator = new ReverseIterator(iterator);
		reverseIterator.last();
		assertFalse(reverseIterator.isDone());
		System.out.println(reverseIterator.current());
		assertSame(array[0], reverseIterator.current());
		reverseIterator.previous();
		assertFalse(reverseIterator.isDone());
		assertSame(array[1], reverseIterator.current());
		reverseIterator.previous();
		assertFalse(reverseIterator.isDone());
		assertSame(array[2], reverseIterator.current());
		reverseIterator.previous();
		assertTrue(reverseIterator.isDone());
		try {
			reverseIterator.current();
			fail();
		} catch (IteratorOutOfBoundsException e) {
			// expected
		}
	}

}
