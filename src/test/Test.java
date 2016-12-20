package test;

import java.util.LinkedList;

import com.mds.tree.imp1.MyBTree;
import com.mydatastructures.linkedlist.implementation1.simple.headonly.*;

public class Test {
	
	public static void main(String[] args) {
		MyBTree<Integer> t = new MyBTree<Integer>();
		t.add(6);
		t.add(4);
		t.add(10);
		t.processInOrder();
		t.processPreOrder();
		t.processPostOrder();
	}
}
