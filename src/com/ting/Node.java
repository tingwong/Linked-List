package com.ting;

public class Node {

    private Node next;
    private int data;

    // Constructor to create a Node
    public Node(int data) {
        this.next = null;
        this.data = data;
    }

    // Constructor to create a Node
    public Node(int data, Node next) {
        this.next = next;
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public int getData() {
        return data;
    }

}
