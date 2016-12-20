package com.mds.tree.imp1;

public interface MyTree<T> {
	public boolean search(T element);
	public boolean insert(T element);
	public boolean delete(T element);
	public void inorder();
	public void preorder();
	public void postorder();
	public int getSize();
	public boolean isEmpty();
	public void clear();
}
