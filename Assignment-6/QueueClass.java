package com.aaslin.java.assignments.assignment6;
import java.util.*;

class QueueClass {
    int front, rear;
    int items[] = new int[5];

    QueueClass() {
        front = -1;
        rear = -1;
    }

    boolean isFull() {
        return (front == 0 && rear == items.length - 1) || (front == rear + 1);
    }

    boolean isEmpty() {
        return front == -1;
    }

    void enQueue(int element) {
        if (isFull()) {
            System.out.println("Queue is full");
            return;
        }
        if (isEmpty()) {
            front = 0;
        }
        rear = (rear + 1) % items.length;
        items[rear] = element;
        System.out.println("Inserted " + element);
    }

    int deQueue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }

        int element = items[front];
        if (front == rear) {
            front = -1;
            rear = -1;
        } else {
            front = (front + 1) % items.length;
        }
        System.out.println("Deleted " + element);
        return element;
    }

    void show() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }

        System.out.println("Queue elements:");
        int i = front;
        while (true) {
            System.out.print(items[i] + " ");
            if (i == rear)  
                break;
            i = (i + 1) % items.length;
        }
        System.out.println();
        System.out.println("Front = " + front + ", Rear = " + rear);
    }

    public static void main(String[] args) {
        QueueClass queue = new QueueClass();
        queue.enQueue(1);
        queue.enQueue(2);
        queue.enQueue(3);
        queue.enQueue(4);
        queue.enQueue(5);
        queue.show();
        queue.deQueue();
        queue.deQueue();
        queue.deQueue();
        queue.show();
        queue.enQueue(6);
        queue.enQueue(7);
        queue.show();
    }
}