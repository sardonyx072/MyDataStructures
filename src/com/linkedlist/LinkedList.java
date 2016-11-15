package com.linkedlist;

import java.util.NoSuchElementException;

public interface LinkedList {
	public abstract int size();
	public abstract Object get(int index) throws IndexOutOfBoundsException;
	public abstract Object getFirst() throws NoSuchElementException;
	public abstract Object getLast() throws NoSuchElementException;
	public abstract void addFirst(Object element);
	public abstract void addLast(Object element);
	public abstract void addAfter(Object element, Object after) throws NoSuchElementException;
	public abstract Object removeFirst() throws NoSuchElementException;
	public abstract Object removeLast() throws NoSuchElementException;
}
