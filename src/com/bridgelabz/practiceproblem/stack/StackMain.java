package com.bridgelabz.practiceproblem.stack;

import java.util.Stack;

public class StackMain {
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack();
		
		stack.push(56);
		stack.push(30);
		stack.push(70);
		
		System.out.println(stack);
		
		System.out.println(stack.peek());
		
		for(int i = 0; i <= stack.size(); i++) {
			stack.pop();
		}
		stack.pop();
		System.out.println(stack);
		
	}
}
