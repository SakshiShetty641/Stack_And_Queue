package com.bridgelabz;
/**
 * Purpose - To remove elements from the queue
 * Final sequence to be printed - 30 - 70
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
        queue.dequeue();
        queue.display();

    }
}
