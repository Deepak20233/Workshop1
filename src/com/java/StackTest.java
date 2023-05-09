package com.java;

public class StackTest {

	public static void main(String[] args) {
		Stack stack =new Stack();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.printstack();
		
		stack.pop();
		stack.printstack();

	}

}
