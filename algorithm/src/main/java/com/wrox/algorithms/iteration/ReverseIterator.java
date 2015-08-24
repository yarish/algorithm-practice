package com.wrox.algorithms.iteration;

public class ReverseIterator implements Iterator {

	private final Iterator _iterator;

	public ReverseIterator(Iterator iterator){
		assert iterator != null : "iterator can't be null";
		_iterator = iterator ;
	}

	public void first() {
		_iterator.last();

	}

	public void last() {
		_iterator.first();

	}

	public boolean isDone() {
		return _iterator.isDone();
	}

	public void next() {
		_iterator.previous();

	}

	public void previous() {
		_iterator.next();

	}

	public Object current() throws IteratorOutOfBoundsException {
		// TODO Auto-generated method stub
		return _iterator.current();
	}

}
