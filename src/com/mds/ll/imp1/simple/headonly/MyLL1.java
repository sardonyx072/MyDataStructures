package com.mds.ll.imp1.simple.headonly;

import com.mds.ll.imp1.simple.MyLLNode;

public class MyLL1<T> {
	protected class Node implements MyLLNode<T> {
		private T element;
		private Node next;
		
		public Node(T element, Node next) {
			this.element = element;
			this.next = next;
		}
		@Override
		public boolean hasElement() {return this.element != null;}
		@Override
		public T getElement() {return this.element;}
		@Override
		public void setElement(T element) {this.element = element;}
		@Override
		public boolean hasNext() {return this.next != null;}
		@Override
		public Node getNext() {return this.next;}
		@Override
		public void setNext(Node next) {this.next = next;}
		@Override
		public boolean hasPrev() {return false;}
		@Override
		public Node getPrev() {return null;}
		@Override
		public String toString() {return "(" + this.element + ")";}
	}
}
