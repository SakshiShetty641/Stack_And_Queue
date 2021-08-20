package com.bridgelabz;
/**
 * Purpose - To create a Stack and push elements to the stack
 * Final sequence to be printed - 56 - 30 - 70
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

	}
}