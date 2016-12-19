package com.mydatastructures.linkedlist.implementation1.simple.headandtail;

import java.util.NoSuchElementException;

import com.mydatastructures.linkedlist.implementation1.simple.MyLinkedList;

public class MyLinkedList1<T> implements MyLinkedList<T> {
	protected class Node {
		private T element;
		private Node next;
		
		public Node(T element, Node next) {
			this.element = element;
			this.next = next;
		}
		public T getElement() {return this.element;}
		public void setElement(T element) {this.element = element;}
		public Node getNext() {return this.next;}
		public void setNext(Node next) {this.next = next;}
		public String toString() {return "(" + this.element + ")";}
	}
	
	protected Node first;
	protected Node last;
	
	public MyLinkedList1() {
		this.first = null;
		this.last = null;
	}

	@Override
	public boolean isEmpty() {
		return this.first == null;
	}

	@Override
	public T getFirst() {
		if(this.isEmpty()) {throw new NoSuchElementException();}
		else {return this.first.getElement();}
	}

	@Override
	public T getLast() {
		if(this.isEmpty()) {throw new NoSuchElementException();}
		else {return this.last.getElement();}
	}

	@Override
	public void addFirst(T element) {
		this.first = new Node(element,this.first);
		if(this.last == null) {
			this.last = this.first;
		}
	}

	@Override
	public void addLast(T element) {
		if(this.isEmpty()) {
			this.last = new Node(element,null);
			this.first = this.last;
		}
		else {
			this.last.setNext(new Node(element,null));
		}
	}

	@Override
	public T removeFirst() {
		if(this.isEmpty()) {throw new NoSuchElementException();}
		else if(this.first == this.last) {
			T element = this.first.getElement();
			this.first = null;
			this.last = null;
			return element;
		}
		else {
			Node drop = this.first;
			this.first = drop.getNext();
			drop.setNext(null);
			return drop.getElement();
		}
	}

	@Override
	public T removeLast() {
		if(this.isEmpty()) {throw new NoSuchElementException();}
		else if(this.first == this.last) {
			T element = this.last.getElement();
			this.first = null;
			this.last = null;
			return element;
		}
		else {
			Node prior = null;
			Node it = this.first;
			while(it.getNext() != null) {
				prior = it;
				it = it.getNext();
			}
			prior.setNext(null);
			this.last = prior;
			return it.getElement();
		}
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		String pointer_right = "-->";
		String pointer_left = "<--";
		builder.append("{first}" + pointer_right);
		Node it = this.first;
		while(it != null) {
			builder.append(it);
			it = it.getNext();
			if(it != null) {builder.append(pointer_right);}
		}
		builder.append(pointer_left + "{last}");
		return builder.toString();
	}
}
