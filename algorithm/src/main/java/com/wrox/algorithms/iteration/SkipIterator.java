package com.wrox.algorithms.iteration;

public class SkipIterator implements Iterator {

	public final Iterator _iterator;
	private final int _skip;

	public SkipIterator(Iterator iterator, int skip) {
		_iterator = iterator;
		_skip = skip;
	}

	public void first() {
		_iterator.first();
	}

	public void last() {
		_iterator.last();
	}

	public boolean isDone() {
		return _iterator.isDone();
	}

	public void next() {
		_iterator.next();
		skipForwards();

	}

	private void skipForwards() {

		for (int i = 0; i < _skip && !_iterator.isDone(); _iterator.next()) {
//			System.out.println("i=" + i);
			i++;
		}

	}

	public void previous() {
		_iterator.previous();
		skipBackwards();
	}

	private void skipBackwards() {
		for (int i = 0; i < _skip && !_iterator.isDone(); _iterator.previous()) {
//			System.out.println("i=" + i);
			i++;

		}
	}

	public Object current() throws IteratorOutOfBoundsException {
		return _iterator.current();
	}

}
