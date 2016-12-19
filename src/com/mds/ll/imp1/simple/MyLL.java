package com.mds.ll.imp1.simple;

public interface MyLL<T> {
	public boolean isEmpty();
	
	public void addFirst(T element);
	
	public void addLast(T element);
	
	public T getFirst();
	
	public T getLast();
	
	public T removeFirst();
	
	public T removeLast();
}
