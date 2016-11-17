package com.mydatastructures.linkedlist.doublelinked;

public class DoubleLinkedNode<T> {
	protected T element;
	protected DoubleLinkedNode<T> prev;
	protected DoubleLinkedNode<T> next;
	
	public DoubleLinkedNode (T element, DoubleLinkedNode<T> prev, DoubleLinkedNode<T> next) {
		this.setElement(element);
		this.setPrev(prev);
		this.setNext(next);
	}

	/**
	 * @return the element
	 */
	public T getElement() {
		return element;
	}

	/**
	 * @param element the element to set
	 */
	public void setElement(T element) {
		this.element = element;
	}
	
	public boolean hasPrev() {
		return this.prev != null;
	}

	/**
	 * @return the prev
	 */
	public DoubleLinkedNode<T> getPrev() {
		return prev;
	}

	/**
	 * @param prev the prev to set
	 */
	public void setPrev(DoubleLinkedNode<T> prev) {
		this.prev = prev;
	}
	
	public boolean hasNext() {
		return this.next != null;
	}

	/**
	 * @return the next
	 */
	public DoubleLinkedNode<T> getNext() {
		return next;
	}

	/**
	 * @param next the next to set
	 */
	public void setNext(DoubleLinkedNode<T> next) {
		this.next = next;
	}
}
