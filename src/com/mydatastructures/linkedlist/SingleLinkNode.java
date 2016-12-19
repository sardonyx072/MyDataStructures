package com.mydatastructures.linkedlist;

public class SingleLinkNode<T> {
	private T element;
	private SingleLinkNode<T> next;
	
	public SingleLinkNode(T element, SingleLinkNode<T> next) {
		this.element = element;
		this.next = next;
	}
	public T getElement() {return this.element;}
	public void setElement(T element) {this.element = element;}
	public SingleLinkNode<T> getNext() {return this.next;}
	public void setNext(SingleLinkNode<T> next) {this.next = next;}
	public String toString() {return "(" + this.element + ")";}
}
