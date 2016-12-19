package com.mydatastructures.linkedlist.implementation1.simple.headonly;

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
	
	public MyLinkedList1() {
		this.first = null;
	}
	
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
		this.first = new Node(element,this.first);
	}
	
	@Override
	public void addLast(T element) {
		if(this.isEmpty()) {this.first = new Node(element,null);}
		else {
			Node it = this.first;
			while(it.getNext() != null) {it = it.getNext();}
			it.setNext(new Node(element,null));
		}
	}
	
	@Override
	public T removeFirst() {
		if(this.isEmpty()) {throw new NoSuchElementException();}
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
		else {
			Node prior = null;
			Node drop = this.first;
			while(drop.getNext() != null) {
				prior = drop;
				drop = drop.getNext();
			}
			if(prior != null) {prior.setNext(null);}
			return drop.getElement();
		}
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		String pointer = "-->";
		builder.append("{first}" + pointer);
		Node it = this.first;
		while(it != null) {
			builder.append(it + pointer);
			it = it.getNext();
		}
		builder.append("{null}");
		return builder.toString();
	}
}
