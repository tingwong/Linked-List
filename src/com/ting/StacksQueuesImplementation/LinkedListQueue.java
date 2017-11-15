package com.ting.StacksQueuesImplementation;

import com.ting.LinkedList;
import com.ting.Node;

import java.util.List;

public class LinkedListQueue {

    public static void main(String[] args) {
        LinkedListQueue queue = new LinkedListQueue();

        System.out.println("Expecting True:");
        System.out.println(queue.isEmpty());
        System.out.println("================");
        queue.enqueue(5);
        System.out.println("Expecting False:");
        System.out.println(queue.isEmpty());
        System.out.println("================");
        queue.enqueue(10);
        queue.enqueue(-100);
        queue.enqueue(6);
        System.out.println("Expecting 5:");
        System.out.println(queue.dequeue());
        System.out.println("================");
        System.out.println("Expecting 10:");
        System.out.println(queue.front());
        System.out.println("================");
        System.out.println("Expecting 3:");
        System.out.println(queue.size());
        queue.enqueue(-555);
        queue.enqueue(10000);
        System.out.println("================");
        System.out.println("Expecting 10000:");
        System.out.println(queue.max());
        System.out.println("================");
        System.out.println("Expecting -555:");
        System.out.println(queue.min());
    }

    private LinkedList queue = new LinkedList();

    public void enqueue(int n) {
        Node newNode = new Node(n);
        Node currentNode = queue.getHead();

        if (queue.getHead() == null) {
            queue.setHead(newNode);
            return;
        }

        while (currentNode.getNext() != null) {
            currentNode = currentNode.getNext();
        }

        currentNode.setNext(newNode);

    }

    public int dequeue() {

        Node head = queue.getHead();

        if (queue.getHead() == null) {
            return -1;
        }

        int data = head.getData();

        queue.setHead(head.getNext());

        return data;


    }

    public boolean isEmpty() {

        if (queue.getHead() == null) {
            return true;
        }

        return false;
    }

    public int front() {

        if (queue.getHead() == null) {
            return -1;
        }

        return queue.getHead().getData();

    }

    public int size() {

        int size = 0;
        Node currentNode = queue.getHead();

        if (queue.getHead() == null) {
            return size;
        }

        while (currentNode != null) {
            size++;
            currentNode = currentNode.getNext();
        }

        return size;

    }

    public int max() {

        Node currentNode = queue.getHead();
        int max = queue.getHead().getData();

        if (queue.getHead() == null) {
            return -1;
        }

        while (currentNode != null) {
            if (currentNode.getData() > max) {
                max = currentNode.getData();
            }
            currentNode = currentNode.getNext();
        }

        return max;

    }

    public int min() {

        Node currentNode = queue.getHead();
        int min = queue.getHead().getData();

        if (queue.getHead() == null) {
            return -1;
        }

        while (currentNode != null) {
            if (currentNode.getData() < min) {
                min = currentNode.getData();
            }
            currentNode = currentNode.getNext();
        }

        return min;

    }

}
