package com.linkedlist;

import static org.junit.Assert.*;

import org.junit.Test;

public class SingleLinkedListTest {
	
	@Test
	public void test() {
		SingleLinkedList list = new SingleLinkedList();
		assertTrue(true);
	}
	
	@Test
	public void sizeTest() {
		SingleLinkedList list;
		
		//case 0: size method exists
		list = new SingleLinkedList();
		try {
			assertTrue(list.getClass().getMethod("size") != null);
		} catch (NoSuchMethodException e) {
			fail("method does not exist");
		} catch (SecurityException e) {
			fail("cannot execute");
		}
		
		//case 1: size 0
		list = new SingleLinkedList();
		assertEquals(list.size(),0);
		
		//case 2: size 1
		list = new SingleLinkedList();
		list.addLast(new Object());
		assertEquals(list.size(),1);
		
		//case 3: size 9
		list = new SingleLinkedList();
		for (int i = 0; i < 9; i++) {list.addLast(new Object());}
		assertEquals(list.size(),9);
		
		//case 4: size 10
		list = new SingleLinkedList();
		for (int i = 0; i < 10; i++) {list.addLast(new Object());}
		assertEquals(list.size(),10);
		
		//case 5: size 16
		list = new SingleLinkedList();
		for (int i = 0; i < 10; i++) {list.addLast(new Object());}
		assertEquals(list.size(),16);
	}
	
	@Test
	public void getTest() {
		SingleLinkedList list;
		
		//case 0: method exists
		list = new SingleLinkedList();
		try {
			assertTrue(list.getClass().getMethod("get",int.class) != null);
		} catch (NoSuchMethodException e) {
			fail("method does not exist");
		} catch (SecurityException e) {
			fail("cannot execute");
		}
		
		//case 1: happy path
		
		//case 2: get index 0 from empty list
		
		//case 3: get from negative index
		
	}
	
	

}
