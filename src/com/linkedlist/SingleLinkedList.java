package com.linkedlist;

import java.util.NoSuchElementException;

public class SingleLinkedList implements LinkedList {
	
	private Node first;
	
	private Node last;
	
	public SingleLinkedList () {
		this.first = null;
		this.last = null;
	}

	@Override
	public int size() {
		int i = 0;
		Node temp = this.first;
		while (temp != null) {
			i++;
			temp = temp.getNext();
		}
		return i;
	}
	
	@Override
	public Object get(int index) throws IndexOutOfBoundsException {
		int i = 0;
		Node temp = this.first;
		while (i++ < index && temp != null);
		if (i == index && temp != null) {
			return temp.getElement();
		}
		else {
			throw new IndexOutOfBoundsException("Index cannot be found in list!");
		}
	}
	
	@Override
	public Object getFirst() {
		if (this.first == null) {
			throw new NoSuchElementException("Cannot get first in list because list is empty!");
		}
		return this.first.getElement();
	}

	@Override
	public Object getLast() {
		if (this.last == null) {
			throw new NoSuchElementException("Cannot get first in list because list is empty!");
		}
		return this.last.getElement();
	}

	@Override
	public void addFirst(Object element) {
		Node temp = new Node(element,this.first);
		this.first = temp;
	}

	@Override
	public void addLast(Object element) {
		Node temp = new Node(element,null);
		this.last.setNext(temp);
		this.last = temp;
	}
	
	@Override
	public void addAfter(Object element, Object after) {
		//TODO
	}

	@Override
	public Object removeFirst() {
		Object element = this.first.getElement();
		Node temp = this.first.getNext();
		this.first.setNext(null);
		this.first = temp;
		return element;
	}

	@Override
	public Object removeLast() {
		// gross with single linked lists
		Object element;
		Node temp = this.first;
		while (temp.getNext() != null && temp.getNext().getNext() != null) {
			temp = temp.getNext();
		}
		element = temp.getNext().getElement();
		temp.setNext(null);
		this.last = temp;
		return element;
	}
	
	private class Node {
		
		private Object element;
		
		private Node next;
		
		private Node (Object element, Node next) {
			this.setElement(element);
			this.setNext(next);
		}
		
		private Object getElement() {
			return this.element;
		}
		
		private void setElement(Object element) {
			this.element = element;
		}
		
		private Node getNext() {
			return this.next;
		}
		
		private void setNext(Node next) {
			this.next = next;
		}
	}
}
