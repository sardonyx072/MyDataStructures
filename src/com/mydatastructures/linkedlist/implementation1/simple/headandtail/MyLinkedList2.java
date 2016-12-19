package com.mydatastructures.linkedlist.implementation1.simple.headandtail;

import java.util.NoSuchElementException;

import com.mydatastructures.linkedlist.implementation1.simple.MyLinkedList;

public class MyLinkedList2<T> implements MyLinkedList<T> {
	protected class Node {
		private T element;
		private Node prev;
		private Node next;
		
		public Node(T element, Node prev, Node next) {
			this.element = element;
			this.prev = prev;
			this.next = next;
		}
		public T getElement() {return this.element;}
		public void setElement(T element) {this.element = element;}
		public Node getPrev() {return this.prev;}
		public void setPrev(Node prev) {this.prev = prev;}
		public Node getNext() {return this.next;}
		public void setNext(Node next) {this.next = next;}
		public String toString() {return "(" + this.element + ")";}
	}
	
	protected Node first;
	protected Node last;
	
	public MyLinkedList2() {
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
		if(this.isEmpty()) {
			this.first = new Node(element,null,null);
			this.last = this.first;
		}
		else {
			this.first.setPrev(new Node(element,null,this.first));
			this.first = this.first.getPrev();
		}
	}

	@Override
	public void addLast(T element) {
		if(this.isEmpty()) {
			this.last = new Node(element,null,null);
			this.first = this.last;
		}
		else {
			this.last.setNext(new Node(element,this.last,null));
			this.last = this.last.getNext();
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
			this.first.setPrev(null);
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
			Node drop = this.last;
			this.last = drop.getPrev();
			this.last.setNext(null);
			drop.setPrev(null);
			return drop.getElement();
		}
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		String monopointer_right = "-->";
		String monopointer_left = "<--";
		String bipointer = "<->";
		builder.append("{first}" + monopointer_right);
		if(this.isEmpty()) {
			builder.append("{null}");
		}
		else {
			Node it = this.first;
			while(it != null) {
				builder.append(it);
				it = it.getNext();
				if(it != null) {builder.append(bipointer);}
			}
		}
		builder.append(monopointer_left + "{last}");
		return builder.toString();
	}
}
