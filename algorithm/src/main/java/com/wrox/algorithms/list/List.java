package com.wrox.algorithms.list;

import com.wrox.algorithms.iteration.Iterable;

public interface List extends Iterable {

	public void insert(int index, Object value) // core
			throws IndexOutOfBoundsException;

	public void add(Object value);// core

	public Object delete(int index) throws IndexOutOfBoundsException; // core

	public boolean delete(Object value); // core

	public void clear();

	public void set(int index, Object value) throws IndexOutOfBoundsException;

	public Object get(int index) throws IndexOutOfBoundsException; // core

	public int indexOf(Object value);

	public boolean contains(Object value);

	public int size(); // core

	public boolean isEmpty();

}
