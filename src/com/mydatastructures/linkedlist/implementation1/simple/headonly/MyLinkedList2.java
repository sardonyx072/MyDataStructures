package com.mydatastructures.linkedlist.implementation1.simple.headonly;

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
	
	public MyLinkedList2() {
		this.first = null;
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
		else {
			Node it = this.first;
			while(it.getNext() != null) {it = it.getNext();}
			return it.getElement();
		}
	}

	@Override
	public void addFirst(T element) {
		this.first = new Node(element,null,this.first);
		if(this.first.getNext() != null) {this.first.getNext().setPrev(this.first);}
	}

	@Override
	public void addLast(T element) {
		if(this.isEmpty()) {this.first = new Node(element,null,null);}
		else {
			Node it = this.first;
			while(it.getNext() != null) {it = it.getNext();}
			it.setNext(new Node(element,it,null));
		}
		
	}

	@Override
	public T removeFirst() {
		if(this.isEmpty()) {throw new NoSuchElementException();}
		else {
			Node drop = this.first;
			this.first = drop.getNext();
			drop.setNext(null);
			if(this.first != null) {this.first.setPrev(null);}
			return drop.getElement();
		}
	}

	@Override
	public T removeLast() {
		if(this.isEmpty()) {throw new NoSuchElementException();}
		else {
			Node prior = null;
			Node it = this.first;
			while(it.getNext() != null) {
				prior = it;
				it = it.getNext();
			}
			if(prior != null) {prior.setNext(null);}
			it.setPrev(null);
			return it.getElement();
		}
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		String monopointer = "-->";
		String bipointer = "<->";
		builder.append("{first}" + monopointer);
		Node it = this.first;
		while(it != null) {
			builder.append(it + (it.getNext() != null ? bipointer : monopointer));
			it = it.getNext();
		}
		builder.append("{null}");
		return builder.toString();
	}
}
