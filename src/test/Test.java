package test;

import java.util.LinkedList;

import com.mydatastructures.linkedlist.implementation1.simple.headonly.*;

public class Test {
	private class A {
		public int test() {return 1;}
	}
	private class B extends A {
		public int test() {return 2;}
		public int test2() {return 3;}
	}
	
	public static void main(String[] args) {
		MyLinkedList1<Integer> sll = new MyLinkedList1<Integer>();
		System.out.println(sll);
		sll.addFirst(7);
		sll.addLast(8);
		System.out.println(sll);
		
		System.out.println();
		
		MyLinkedList2<Integer> dll = new MyLinkedList2<Integer>();
		System.out.println(dll);
		dll.addFirst(9);
		dll.addLast(1);
		System.out.println(dll);
		
		LinkedList<Integer> ll = new LinkedList<Integer>();
		Test t = new Test();
		A test = t.new B();
		((B)test).test2();
	}
}
