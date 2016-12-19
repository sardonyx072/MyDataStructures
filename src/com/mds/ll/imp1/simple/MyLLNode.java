package com.mds.ll.imp1.simple;

public interface MyLLNode<T> {
	public boolean hasElement();
	
	public T getElement();
	
	public void setElement(T element);
	
	public boolean hasPrev();
	
	public MyLLNode<T> getPrev();
	
	public void setPrev(MyLLNode<T> prev);
	
	public boolean hasNext();
	
	public MyLLNode<T> getNext();
	
	public void setNext(MyLLNode<T> next);
}
