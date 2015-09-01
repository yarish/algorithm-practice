package com.wrox.algorithms.list;

import org.pmw.tinylog.Logger;

import junit.framework.TestCase;

public abstract class AbstractListTestCase extends TestCase {

	protected static final Object VALUE_A = "A";
	protected static final Object VALUE_B = "B";
	protected static final Object VALUE_C = "C";
	protected static final Object VALUE_D = "D";
	protected static final Object VALUE_E = "E";

	protected abstract List createList();

	// Insert into an empty list
	public void testInsertIntoEmptyList() {
		Logger.info("---begin---");
		List list = createList();
		assertSame(0, list.size());
		assertTrue(list.isEmpty());

		list.insert(0, VALUE_A);
		list.insert(1, VALUE_B);
		list.insert(2, VALUE_C);
		list.insert(3, VALUE_D);
		list.insert(4, VALUE_E);

		assertFalse(list.isEmpty());
		assertSame(VALUE_A, list.get(0));
		assertSame(VALUE_B, list.get(1));
		assertSame(VALUE_C, list.get(2));
		assertSame(VALUE_D, list.get(3));
		assertSame(VALUE_E, list.get(4));
		Logger.info("---End---");
	}

	// Insert Between Elements
	public void testInsertBetweenElements() {
		Logger.info("---begin---");
		List list = createList();
		list.insert(0, VALUE_A);
		list.insert(1, VALUE_B);
		list.insert(1, VALUE_C);

		assertEquals(3, list.size());
		assertEquals(VALUE_A, list.get(0));
		assertEquals(VALUE_C, list.get(1));
		assertEquals(VALUE_B, list.get(2));
		Logger.info("---End---");
	}

	// Insert before first element
	public void testInsertBeforeFirstElements() {

		Logger.info("---begin---");
		List list = createList();
		list.insert(0, VALUE_A);
		list.insert(1, VALUE_B);
		list.insert(0, VALUE_C);

		assertEquals(3, list.size());
		assertEquals(VALUE_C, list.get(0));
		assertEquals(VALUE_A, list.get(1));
		assertEquals(VALUE_B, list.get(2));
		Logger.info("---End---");
	}

	// Insert after last element

	public void testInsertAfterLastElement() {

		Logger.info("---begin---");
		List list = createList();
		list.insert(0, VALUE_A);
		list.insert(1, VALUE_B);
		list.insert(2, VALUE_C);

		assertEquals(3, list.size());
		assertEquals(VALUE_A, list.get(0));
		assertEquals(VALUE_B, list.get(1));
		assertEquals(VALUE_C, list.get(2));
		Logger.info("---End---");
	}

	// check out of bounds exception
	public void testInsertOutOfBoundsException() {
		Logger.info("---begin---");
		List list = createList();

		try {
			list.insert(-1, VALUE_A);
			fail();
		} catch (IndexOutOfBoundsException e) {
			// excepted
		}

		try {
			list.insert(1, VALUE_B);
			fail();
		} catch (IndexOutOfBoundsException e) {
			// excepted
		}
		Logger.info("---End---");

	}

	// test add at the end of the list

	public void testAdd() {
		Logger.info("---begin---");
		List list = createList();

		list.insert(0, VALUE_A);
		list.insert(1, VALUE_B);
		list.insert(2, VALUE_C);

		assertEquals(3, list.size());
		assertSame(VALUE_A, list.get(0));
		assertSame(VALUE_B, list.get(1));
		assertSame(VALUE_C, list.get(2));
		Logger.info("---End---");
	}

	public void setTest() {

		Logger.info("---begin---");
		List list = createList();
		list.insert(0, VALUE_A);
		assertSame(VALUE_A, list.get(0));

		list.set(0, VALUE_B);
		assertSame(VALUE_B, list.get(0));

		Logger.info("---End---");

	}

	public void testGetOUtOFBounds() {

		Logger.info("---begin---");
		List list = createList();

		try {
			list.get(-1);
			fail();
		} catch (IndexOutOfBoundsException e) {
			Logger.info("expected : IndexOutOfBoundsException");
		}

		try {
			list.get(0);
			fail();
		} catch (IndexOutOfBoundsException e) {
			Logger.info("expected : IndexOutOfBoundsException");
		}

		list.add(VALUE_A);

		try {
			list.get(1);
			fail();
		} catch (IndexOutOfBoundsException e) {
			Logger.info("expected : IndexOutOfBoundsException");
		}

		Logger.info("---End---");
	}

	public void testSetOutOfBounds() {

		Logger.info("---begin---");
		List list = createList();

		try {
			list.set(-1, VALUE_A);
			fail();
		} catch (IndexOutOfBoundsException e) {
			Logger.info("expected : IndexOutOfBoundsException");
		}

		try {
			list.set(0, VALUE_B);
			fail();
		} catch (IndexOutOfBoundsException e) {
			Logger.info("expected : IndexOutOfBoundsException");
		}

		list.insert(0, VALUE_A);

		try {
			list.set(1, VALUE_C);
			fail();
		} catch (IndexOutOfBoundsException e) {
			Logger.info("expected : IndexOutOfBoundsException");
		}

		Logger.info("---End---");

	}
}
