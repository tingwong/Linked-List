package com.ting.StacksQueuesImplementation;

import com.ting.LinkedList;
import com.ting.Node;

public class LinkedListStack {

    public static void main(String[] args) {

        LinkedListStack stack = new LinkedListStack();

        System.out.println("Expecting True:");
        System.out.println(stack.isEmpty());
        System.out.println("================");
        stack.push(5);
        System.out.println("Expecting False:");
        System.out.println(stack.isEmpty());
        System.out.println("================");
        stack.push(10);
        stack.push(-100);
        stack.push(6);
        System.out.println("Expecting 6:");
        System.out.println(stack.pop());
        System.out.println("================");
        System.out.println("Expecting -100:");
        System.out.println(stack.top());
        System.out.println("================");
        System.out.println("Expecting 3:");
        System.out.println(stack.size());
        stack.push(-555);
        stack.push(10000);
        System.out.println("================");
        System.out.println("Expecting 10000:");
        System.out.println(stack.max());
        System.out.println("================");
        System.out.println("Expecting -555:");
        System.out.println(stack.min());
    }

    private LinkedList stack = new LinkedList();

    public void push(int n) {
        Node newNode = new Node(n);
        Node currentNode = stack.getHead();

        if (stack.getHead() == null) {
            stack.setHead(newNode);
            return;
        }

        while (currentNode.getNext() != null) {
            currentNode = currentNode.getNext();
        }

        currentNode.setNext(newNode);

    }

    public int pop() {

        Node currentNode = stack.getHead();
        Node previousNode = null;

        if (stack.getHead() == null) {
            return -1;
        }

        while (currentNode.getNext() != null) {
            previousNode = currentNode;
            currentNode = currentNode.getNext();
        }

        previousNode.setNext(null);
        return currentNode.getData();

    }

    public boolean isEmpty() {
        if (stack.getHead() == null) {
            return true;
        }

        return false;

    }

    public int size() {

        int size = 1;
        Node currentNode = stack.getHead();

        if (currentNode == null) {
            return 0;
        }

        while (currentNode.getNext() != null) {
            size++;
            currentNode = currentNode.getNext();
        }

        return size;

    }

    public int top() {

        Node currentNode = stack.getHead();

        if (stack.getHead() == null) {
            return -1;
        }

        while (currentNode.getNext() != null) {
            currentNode = currentNode.getNext();
        }

        return currentNode.getData();

    }

    public int max() {

        Node currentNode = stack.getHead();
        int max = currentNode.getData();

        if (currentNode == null) {
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

        Node currentNode = stack.getHead();
        int min = currentNode.getData();

        if (currentNode == null) {
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
