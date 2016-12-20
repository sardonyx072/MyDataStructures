package com.mds.tree.imp1;

public class MyBTree<T extends Comparable<T>> {
	protected class Node {
		private T element;
		private Node parent;
		private Node leftChild;
		private Node rightChild;
		
		public Node(T element, Node parent) {
			this.element = element;
			this.parent = parent;
			this.leftChild = null;
			this.rightChild = null;
		}
		public boolean hasElement() {return this.element != null;}
		public T getElement() {return this.element;}
		public void setElement(T element) {this.element = element;}
		public boolean hasParent() {return this.parent != null;}
		public Node getParent() {return this.parent;}
		public void setParent(Node parent) {this.parent = parent;}
		public boolean hasLeftChild() {return this.leftChild != null;}
		public Node getLeftChild() {return this.leftChild;}
		public void setLeftChild(Node leftChild) {this.leftChild = leftChild;}
		public boolean hasRightChild() {return this.rightChild != null;}
		public Node getRightChild() {return this.rightChild;}
		public void setRightChild(Node rightChild) {this.rightChild = rightChild;}
		public boolean isRoot() {return !this.hasParent();}
		public boolean isLeaf() {return !this.hasLeftChild() && !this.hasRightChild();}
		public int getDepth() {
			int i = 0;
			Node it = this;
			while(it.hasParent()) {
				i++;
				it = it.getParent();
			}
			return i;
		}
		public int getDegree() {
			return (this.hasLeftChild() ? this.getLeftChild().getDegree() : 0) + (this.hasRightChild() ? this.getRightChild().getDegree() : 0);
		}
		public Node getSuccessor() {
			Node it = this.getRightChild();
			while(it != null) {it = it.getLeftChild();}
			return it;
		}
		public Node getPredecessor() {
			Node it = this.getLeftChild();
			while(it != null) {it = it.getRightChild();}
			return it;
		}
	}
	
	private Node root;
	
	public MyBTree() {
		this.root = null;
	}
	
	public boolean isEmpty() {
		return this.root == null;
	}
	
	public void add(T element) {
		if(this.isEmpty()) {this.root = new Node(element,null);}
		else {
			Node prior = null;
			Node it = this.root;
			boolean right = false;
			while(it != null) {
				prior = it;
				right = element.compareTo(it.getElement()) > 0;
				it = (right ? it.getRightChild() : it.getLeftChild());
			}
			if(right) {prior.setRightChild(new Node(element,prior));}
			else {prior.setLeftChild(new Node(element,prior));}
		}
	}
	
	private void processNode(Node node) {
		System.out.println(node.getElement());
	}
	
	private void processInOrder(Node node) {
		if(node.hasLeftChild()) {this.processInOrder(node.getLeftChild());}
		this.processNode(node);
		if(node.hasRightChild()) {this.processInOrder(node.getRightChild());}
	}
	
	public void processInOrder() {
		this.processInOrder(this.root);
	}
	
	private void processPreOrder(Node node) {
		if(node.hasLeftChild()) {this.processPreOrder(node.getLeftChild());}
		if(node.hasRightChild()) {this.processPreOrder(node.getRightChild());}
		this.processNode(node);
	}
	
	public void processPreOrder() {
		this.processPreOrder(this.root);
	}
	
	private void processPostOrder(Node node) {
		this.processNode(node);
		if(node.hasLeftChild()) {this.processPostOrder(node.getLeftChild());}
		if(node.hasRightChild()) {this.processPostOrder(node.getRightChild());}
	}
	
	public void processPostOrder() {
		this.processPostOrder(this.root);
	}
}
