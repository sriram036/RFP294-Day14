package com.bridgelabz.practiceproblem.linkedlist;

import java.util.LinkedList;

public class MainLinkedList {
	
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();
		list.addLast(56);
		list.addLast(70);
		list.add(1, 30);
		System.out.println(list);
		list.add(2, 40);
		System.out.println(list);
		list.remove(2);
		System.out.println(list);
	}

}
