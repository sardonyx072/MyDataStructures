package com.mydatastructures.linkedlist.implementation1.complex;

public interface MyLinkedList<T> {
	
	public abstract boolean isEmpty();
	
	public abstract T getFirst();
	
	public abstract T getLast();
	
	public abstract void addFirst(T element);
	
	public abstract void addLast(T element);
	
	public abstract T removeFirst();
	
	public abstract T removeLast();
	
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
	
	public T[] toArray();
}
