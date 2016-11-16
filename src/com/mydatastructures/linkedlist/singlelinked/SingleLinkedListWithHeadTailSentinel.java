package com.mydatastructures.linkedlist.singlelinked;

import java.util.NoSuchElementException;

public class SingleLinkedListWithHeadTailSentinel<T> extends SingleLinkedListWithHeadSentinel<T> {
	protected SingleLinkedNode<T> last;
	
	public SingleLinkedListWithHeadTailSentinel () {
		this.first = null;
		this.last = null;
	}
	
	@Override
	public boolean isEmpty() {
		if ((this.first == null || this.last == null) && !(this.first == null && this.last == null))
			throw new IllegalStateException();
		else
			return this.first == null;
	}
	
	@Override
	public T getFirst() {
		if (this.isEmpty())
			throw new NoSuchElementException();
		else
			return this.first.getElement();
	}
	
	@Override
	public T getLast() {
		if (this.isEmpty())
			throw new NoSuchElementException();
		else
			return this.last.getElement();
	}
	
	@Override
	public T removeFirst() {
		if (this.isEmpty())
			throw new NoSuchElementException();
		else {
			T element = this.first.getElement();
			this.first.setNext(null);
			this.first = this.first.getNext();
			if (this.first == null)
				this.last = null;
			return element;
		}
	}
	
	@Override
	public T removeLast() {
		if (this.isEmpty())
			throw new NoSuchElementException();
		else {
			T element = this.last.getElement();
			if (this.first == this.last) {
				this.first = null;
				this.last = null;
			}
			else {
				SingleLinkedNode<T> temp = this.first;
				while (temp.getNext() != this.last)
					temp = temp.getNext();
				temp.setNext(null);
			}
			return element;
		}
	}
	
	@Override
	public void addFirst(T element) {
		this.first = new SingleLinkedNode<T>(element,this.first);
		if (this.last == null)
			this.last = this.first;
	}
	
	@Override
	public void addLast(T element) {
		if (this.isEmpty()) {
			this.first = new SingleLinkedNode<T>(element,null);
			this.last = this.first;
		}
		else {
			this.last.setNext(new SingleLinkedNode<T>(element,null));
			this.last = this.last.getNext();
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
					if (temp.getNext().getNext() == null)
						this.last = temp.getNext();
					break;
				}
				temp = temp.getNext();
			}
		}
	}
}
