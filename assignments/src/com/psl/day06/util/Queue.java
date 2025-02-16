package com.psl.day06.util;

import java.util.LinkedList;

public class Queue<T> {
private LinkedList<T> queue;
    
    public Queue() {
        this.queue = new LinkedList<>();
    }
    
    public void enqueue(T element) {
        queue.addLast(element);  
    }
    
    public T dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return null; 
        }
        return queue.removeFirst(); 
    }
    public T peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return null;
        }
        return queue.getFirst();  
    }
    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public int size() {
        return queue.size();
    }
    
    public void printQueue() {
        System.out.println(queue);
    }
}
