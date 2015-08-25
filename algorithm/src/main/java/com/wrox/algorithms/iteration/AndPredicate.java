package com.wrox.algorithms.iteration;

public class AndPredicate implements Predicate {
	private final Predicate _left;
	private final Predicate _right;

	public AndPredicate(Predicate left, Predicate right) {
		assert left != null : "left predicate can't be null";
		assert right != null : "right predicate can't be null";
		_left = left;
		_right = right;
	}

	public boolean evaluate(Object object) {
		return _left.equals(object) && _right.evaluate(object);
	}

}
