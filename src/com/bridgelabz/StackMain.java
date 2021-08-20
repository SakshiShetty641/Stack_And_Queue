package com.bridgelabz;
/**
 * Purpose - To create a Stack and perform peak and pop operations
 * @author - Sakshi Shetty
 * @version - 16.0
 * @since - 2021-08-20
 */
public class StackMain {
	public static void main(String[] args) {
		MyStack stack = new MyStack();
		stack.push(70);
		stack.push(30);
		stack.push(56);
		stack.display();
		//To perform peak and pop till the list is empty
		stack.peak();
		stack.pop();
		stack.display();
		stack.peak();
		stack.pop();
		stack.display();
		stack.peak();
		stack.pop();
		stack.display();

	}
}