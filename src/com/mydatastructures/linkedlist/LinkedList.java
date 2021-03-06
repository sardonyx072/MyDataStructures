package com.mydatastructures.linkedlist;

public interface LinkedList<T> {
	
	public abstract boolean isEmpty();
	
	public abstract T getFirst();
	
	public abstract T getLast();
	
	public abstract void addFirst(T element);
	
	public abstract void addLast(T element);
	
	public abstract T removeFirst();
	
	public abstract T removeLast();
}
