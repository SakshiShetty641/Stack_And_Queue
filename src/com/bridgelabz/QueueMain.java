package com.bridgelabz;
/**
 * Purpose - To create a Queue and perform enqueue operation
 * Final sequence to be printed - 56 - 30 - 70
 * @author - Sakshi Shetty
 * @version - 16.0
 * @since - 2021-08-20
 */

public class QueueMain {
    public static void main(String[] args) {
        MyQueue queue = new MyQueue();
        queue.enqueue(56);
        queue.enqueue(30);
        queue.enqueue(70);
        queue.display();

    }
}
