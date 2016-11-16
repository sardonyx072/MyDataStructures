package com.mydatastructures.linkedlist.singlelinked;

import java.util.NoSuchElementException;

import com.mydatastructures.linkedlist.LinkedList;

public class SingleLinkedListWithHeadSentinel<T> implements LinkedList<T> {
	
	protected SingleLinkedNode<T> first;
	
	public SingleLinkedListWithHeadSentinel () {
		this.first = null;
	}
	
	@Override
	public boolean isEmpty() {
		return this.first == null;
	}
	
	@Override
	public T getFirst() throws NoSuchElementException {
		if (this.isEmpty())
			throw new NoSuchElementException();
		else
			return this.first.getElement();
	}
	
	@Override
	public T getLast() {
		if (this.isEmpty())
			throw new NoSuchElementException();
		else {
			SingleLinkedNode<T> temp = this.first;
			while (temp.hasNext())
				temp = temp.getNext();
			return temp.getElement();
		}
	}
	
	@Override
	public T removeFirst() {
		if (this.isEmpty())
			throw new NoSuchElementException();
		else {
			T element = this.getFirst();
			this.first = this.first.getNext();
			return element;
		}
	}
	
	@Override
	public T removeLast() {
		if (this.isEmpty())
			throw new NoSuchElementException();
		else {
			T element;
			SingleLinkedNode<T> prior = null;
			SingleLinkedNode<T> temp = this.first;
			while (temp.hasNext()) {
				prior = temp;
				temp = temp.getNext();
			}
			element = temp.getElement();
			if (prior != null)
				prior.setNext(null);
			return element;
		}
	}
	
	@Override
	public void addFirst(T element) {
		this.first = new SingleLinkedNode<T>(element,this.first);
	}
	
	@Override
	public void addLast(T element) {
		SingleLinkedNode<T> temp = this.first;
		if (temp == null)
			this.first = new SingleLinkedNode<T>(element,null);
		else {
			while (temp.hasNext())
				temp = temp.getNext();
			temp.setNext(new SingleLinkedNode<T>(element,null));
		}
	}
	
	@Override
	public void addBefore(T before, T element) {
		//what if there are multiple instances?
		if (this.isEmpty())
			throw new NoSuchElementException();
		else if (this.first.getElement().equals(before))
			this.first = new SingleLinkedNode<T>(element,this.first);
		else {
			SingleLinkedNode<T> temp = this.first;
			while (temp.hasNext()) {
				if (temp.getNext().getElement().equals(before)) {
					temp.setNext(new SingleLinkedNode<T>(element,temp.getNext()));
					break;
				}
				temp = temp.getNext();
			}
		}
	}
	
	@Override
	public void addAfter(T after, T element) {
		//what if there are multiple instances?
		if (this.isEmpty())
			throw new NoSuchElementException();
		else {
			SingleLinkedNode<T> temp = this.first;
			while (temp != null) {
				if (temp.getElement().equals(element)) {
					temp.setNext(new SingleLinkedNode<T>(element,temp.getNext()));
					break;
				}
				temp = temp.getNext();
			}
		}
	}
}
