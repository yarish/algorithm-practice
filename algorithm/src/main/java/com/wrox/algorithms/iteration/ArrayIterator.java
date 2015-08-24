package com.wrox.algorithms.iteration;

public class ArrayIterator implements Iterator {

	// for the entire array
	private final Object[] _array;
	private final int _start;
	private final int _end;
	private int _current = -1;
	private Object[] array;

	// for the selected iterator
	private int length;
	private int _first;
	private int _last;

	public ArrayIterator(Object[] array, int start, int length) {
		_start = 0;
		_end = length - 1;
		this.length = length;
		this._array = array;
		assert array != null : "array can't be null";
		assert start >= 0 : "start can't be <0";
		assert start < array.length : "start can't be > array.length";
		assert length >= 0 : "length can't be <0";

		this._first = start;
		this._last = start + length - 1;
		System.out.println("_last=" + _last);
		System.out.println("array.length=" + array.length);

		assert _last < array.length : "last index can't go beyond array.length ";

	}

	public ArrayIterator(Object[] array) {
		this._array = array;
		this._start = 0;
		this._end = array.length;
		assert array != null : "array can't be null";

		this._first = 0;
		this._last = array.length - 1;

	}

	public void first() {
		_current = _first;

	}

	public void last() {
		_current = _last;
	}

	public boolean isDone() {
		return _current < _first || _current > _last;
	}

	public void next() {
		++_current;

	}

	public void previous() {
		--_current;

	}

	public Object current() throws IteratorOutOfBoundsException {
		if (isDone()) {
			throw new IteratorOutOfBoundsException();
		}
		return _array[_current];
	}

}
