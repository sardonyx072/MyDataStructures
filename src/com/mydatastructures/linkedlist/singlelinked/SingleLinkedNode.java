package com.mydatastructures.linkedlist.singlelinked;

public class SingleLinkedNode<T> {
	
	protected T element;
	
	protected SingleLinkedNode<T> next;
	
	public SingleLinkedNode (T element, SingleLinkedNode<T> next) {
		this.setElement(element);
		this.setNext(next);
	}
	
	public T getElement() {
		return this.element;
	}
	
	public void setElement(T element) {
		this.element = element;
	}
	
	public boolean hasNext() {
		return this.getNext() != null;
	}
	
	public SingleLinkedNode<T> getNext() {
		return this.next;
	}
	
	public void setNext(SingleLinkedNode<T> next) {
		this.next = next; 
	}
}
