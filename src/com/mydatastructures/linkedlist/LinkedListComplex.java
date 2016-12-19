package com.mydatastructures.linkedlist;

public interface LinkedListComplex<T> extends LinkedList<T> {
	public int size();
	
	public int indexOf(T element);
	
	public boolean contains(T element);
	
	public T getAt(int index);
	
	public T getBefore(T element);
	
	public T getBefore(T element, int instance);
	
	public T getAfter(T element);
	
	public T getAfter(T element, int instance);
	
	public void addAt(T element, int index);
	
	public void addBefore(T element, T before);
	
	public void addBefore(T element, T before, int instance);
	
	public void addAfter(T element, T after);
	
	public void addAfter(T element, T after, int instance);
	
	public T removeAt(int index);
	
	public T removeBefore(T element);
	
	public T removeBefore(T element, int instance);
	
	public T removeAfter(T element);
	
	public T removeAfter(T element, int instance);
	
	public void clear();
	
	public LinkedList<T> subList(int startIndex, int stopIndex);
	
	public T[] toArray();
}
