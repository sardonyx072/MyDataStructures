package com.mydatastructures.linkedlist;

import java.util.NoSuchElementException;

public interface LinkedList<T> {
	
	public abstract boolean isEmpty() throws IllegalStateException;
	
	public abstract T getFirst() throws NoSuchElementException;
	
	public abstract T getLast() throws NoSuchElementException;
	
	public abstract T removeFirst() throws NoSuchElementException;
	
	public abstract T removeLast() throws NoSuchElementException;
	
	public abstract void addFirst(T element);
	
	public abstract void addLast(T element);
	
	public abstract void addBefore(T before, T element) throws NoSuchElementException;
	
	//TODO: add this
	//public abstract void addBefore(T before, int occurrence, T element) throws NoSuchElementException;
	
	public abstract void addAfter(T after, T element) throws NoSuchElementException;

	//TODO: add this
	//public abstract void addAfter(T after, int occurrence, T element) throws NoSuchElementException;
	
	public abstract T removeBefore(T before, T element) throws NoSuchElementException;

	//TODO: add this
	//public abstract T removeBefore(T before, int occurrence, T element) throws NoSuchElementException;
	
	public abstract T removeAfter(T after, T element) throws NoSuchElementException;

	//TODO: add this
	//public abstract T removeAfter(T after, int occurrence, T element) throws NoSuchElementException;
}
