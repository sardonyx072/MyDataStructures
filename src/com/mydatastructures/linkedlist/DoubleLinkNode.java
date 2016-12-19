package com.mydatastructures.linkedlist;

public class DoubleLinkNode<T> extends SingleLinkNode<T>{
	private DoubleLinkNode<T> prev;
	
	public DoubleLinkNode(T element, DoubleLinkNode<T> prev, DoubleLinkNode<T> next) {
		super(element,next);
		this.prev = prev;
	}
	public DoubleLinkNode<T> getPrev() {return this.prev;}
	public void setPrev(DoubleLinkNode<T> prev) {this.prev = prev;}
}
