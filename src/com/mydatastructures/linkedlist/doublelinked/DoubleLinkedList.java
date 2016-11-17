package com.mydatastructures.linkedlist.doublelinked;

import java.util.NoSuchElementException;

import com.mydatastructures.linkedlist.LinkedList;

public class DoubleLinkedList<T> implements LinkedList<T> {
	
	protected DoubleLinkedNode<T> first;
	
	protected DoubleLinkedNode<T> last;
	
	public DoubleLinkedList () {
		this.first = null;
		this.last = null;
	}

	@Override
	public boolean isEmpty() throws IllegalStateException {
		if ((this.first == null || this.last == null) && !(this.first == null && this.last == null))
			throw new IllegalStateException();
		else
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
	public T getLast() throws NoSuchElementException {
		if (this.isEmpty())
			throw new NoSuchElementException();
		else
			return this.last.getElement();
	}

	@Override
	public T removeFirst() throws NoSuchElementException {
		if (this.isEmpty())
			throw new NoSuchElementException();
		else {
			T element = this.first.getElement();
			DoubleLinkedNode<T> temp = this.first.getNext();
			this.first.setNext(null);
			this.first = temp;
			if (temp == null)
				this.last = null;
			else
				temp.setPrev(null);
			return element;
		}
	}

	@Override
	public T removeLast() throws NoSuchElementException {
		if (this.isEmpty())
			throw new NoSuchElementException();
		else {
			T element = this.last.getElement();
			DoubleLinkedNode<T> temp = this.last.getPrev();
			this.last.setPrev(null);
			this.last = temp;
			if (temp == null)
				this.first = null;
			else
				temp.setNext(null);
			return element;
		}
	}

	@Override
	public void addFirst(T element) {
		this.first = new DoubleLinkedNode<T>(element,null,this.first);
		if (this.first.getNext() != null)
			this.first.getNext().setPrev(this.first);
		else
			this.last = this.first;
	}

	@Override
	public void addLast(T element) {
		this.last = new DoubleLinkedNode<T>(element,this.last,null);
		if (this.last.getPrev() != null)
			this.last.getPrev().setNext(this.last);
		else
			this.first = this.last;
	}

	@Override
	public void addBefore(T before, T element) throws NoSuchElementException {
		//what if there are multiple instances?
		if (this.isEmpty())
			throw new NoSuchElementException();
		else {
			DoubleLinkedNode<T> temp = this.last;
			while (temp != null) {
				if (temp.getElement().equals(before)) {
					DoubleLinkedNode<T> insert = new DoubleLinkedNode<T>(element,temp.getPrev(),temp);
					temp.setPrev(insert);
					if (insert.getPrev() != null)
						insert.getPrev().setNext(insert);
					else
						this.first = insert;
				}
				temp = temp.getPrev();
			}
		}
		// element was not found
		throw new NoSuchElementException();
	}

	@Override
	public void addAfter(T after, T element) throws NoSuchElementException {
		//what if there are multiple instances?
		if (this.isEmpty())
			throw new NoSuchElementException();
		else {
			DoubleLinkedNode<T> temp = this.first;
			while (temp != null) {
				if (temp.getElement().equals(after)) {
					DoubleLinkedNode<T> insert = new DoubleLinkedNode<T>(element,temp,temp.getNext());
					temp.setNext(insert);
					if (insert.getNext() != null)
						insert.getNext().setPrev(insert);
					else
						this.last = insert;
					return;
				}
				temp = temp.getNext();
			}
		}
		// element was not found
		throw new NoSuchElementException();
	}

	@Override
	public T removeBefore(T before, T element) throws NoSuchElementException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public T removeAfter(T after, T element) throws NoSuchElementException {
		// TODO Auto-generated method stub
		
	}

}
