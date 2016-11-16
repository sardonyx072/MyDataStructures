package com.mydatastructures.linkedlist;

import java.util.NoSuchElementException;

public interface LinkedList<T> {
	public abstract boolean isEmpty();
	public abstract T getFirst() throws NoSuchElementException;
	public abstract T getLast() throws NoSuchElementException;
	public abstract T removeFirst() throws NoSuchElementException;
	public abstract T removeLast() throws NoSuchElementException;
	public abstract void addFirst(T element);
	public abstract void addLast(T element);
	public abstract void addBefore(T before, T element) throws NoSuchElementException;
	public abstract void addAfter(T after, T element) throws NoSuchElementException;
}
