package com.bridgelabz.practiceproblem.queue;

import java.util.LinkedList;
import java.util.Stack;

public class MainQueue {
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();
		list.addLast(56);
		list.addLast(30);
		list.addLast(70);
		System.out.println(list);
		System.out.println("Top of the list is " + list.peek());
		list.removeFirst();
		System.out.println(list);
	}
}
