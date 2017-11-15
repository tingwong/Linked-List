package com.ting;

public class LinkedList {

    private Node head;

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    // Inserting a value in the beginning of the Linked List
    public void insertNode(int value) {
        // Create a new Node
        Node newNode = new Node(value);

        // Set newNode.next as the head
        newNode.setNext(getHead());
        setHead(newNode);
    }

    // Print out all nodes
    public void visitList() {

        // If there is no head, there is no list to visit
        if (getHead() == null) {
            System.out.println("No List to Visit");
        }

        // Set current to head
        Node current = getHead();

        // Iterate through list to print out values
        while (current != null) {
            System.out.print(current.getData() + " ");
            current = current.getNext();
        }
    }

    public void delete(int value) {
        // If Linked List is empty, nothing to delete
        if (getHead() == null) {
            System.out.println("Nothing to delete.");

        }

        // If first value is to be deleted
        if (getHead().getData() == value) {
            setHead(getHead().getNext());
        }

        Node current = getHead().getNext();
        Node previous = getHead();

        // Iterate through the whole linked list, but not considering the last entry
        while (current.getNext() != null) {
            if (current.getData() == value) {
                previous.setNext(current.getNext());
            } else {
                previous = current;
                current = current.getNext();
            }
        }

        if (current.getData() == value) {
            previous.setNext(null);
        }

    }

    public boolean searchValue(int value) {
        if (getHead() == null) {
            return false;
        }

        Node currentNode = getHead();

        while (currentNode != null) {
            if (currentNode.getData() == value) {
                return true;
            } else {
                currentNode = currentNode.getNext();
            }
        }

        return false;

    }

    public int findMax() {
        if (getHead() == null) {
            return 0;
        }

        Node currentNode = getHead();
        int maxValue = 0;

        while (currentNode != null) {
            if (currentNode.getData() > maxValue) {
                maxValue = currentNode.getData();
            } else {
                currentNode = currentNode.getNext();
            }
        }

        return maxValue;

    }

    public int findMin() {
        if (getHead() == null) {
            return 0;
        }

        Node currentNode = getHead();
        int minValue = 0;

        while (currentNode != null) {
            if (currentNode.getData() < minValue) {
                minValue = currentNode.getData();
            } else {
                currentNode = currentNode.getNext();
            }
        }

        return minValue;

    }

    public int findLength() {
        if (getHead() == null) {
            return 0;
        }

        Node currentNode = getHead();
        int counter = 0;

        while (currentNode != null) {
            counter += 1;
            currentNode = currentNode.getNext();
        }

        return counter;

    }

    public int findNthBeginning(int n) {

        if (getHead() == null) {
            return 0;
        }

        if ((findLength() - 1) < n) {
            return 0;
        }

        Node currentNode = getHead();
        int counter = 0;

        while (currentNode != null) {
            if (counter == n) {
                return currentNode.getData();
            } else {
                currentNode = currentNode.getNext();
                counter += 1;
            }
        }

        return 0;

    }

    public void insertAscending(int value) {

        Node newNode = new Node(value);

        if (getHead() == null) {
            setHead(newNode);
            return;
        }

        if (getHead().getData() > newNode.getData()) {
            newNode.setNext(getHead());
            setHead(newNode);
            return;
        }

        Node currentNode = getHead();

        while (currentNode.getNext() != null) {
            if (currentNode.getNext().getData() > newNode.getData()) {
                newNode.setNext(currentNode.getNext());
                currentNode.setNext(newNode);
                return;
            } else {
                currentNode = currentNode.getNext();
            }
        }

        currentNode.setNext(newNode);
    }

    public void reverse(){
        if (getHead() == null) {
            return;
        }

        Node currentNode = getHead();
        Node nextNode = currentNode.getNext();
        Node previousNode = null;

        while (currentNode.getNext() != null) {
            currentNode.setNext(previousNode);
            previousNode = currentNode;
            currentNode = nextNode;
            nextNode = currentNode.getNext();
        }

        currentNode.setNext(previousNode);
        setHead(currentNode);

    }

    public int findMiddleValue() {

        if (getHead() == null) {
            return 0;
        }

        Node fastPointer = getHead();
        Node slowPointer = getHead();

        while (fastPointer.getNext() != null) {
            slowPointer = slowPointer.getNext();
            fastPointer = fastPointer.getNext();

            if (fastPointer.getNext() != null) {
                fastPointer = fastPointer.getNext();
            }
        }

        return slowPointer.getData();

    }

    public int findNthFromEnd(int n) {

        Node fastPointer = getHead();
        Node slowPointer = getHead();
        int counter = 0;

        if (getHead() == null) {
            return 0;
        }

        while (fastPointer.getNext() != null) {
            if (counter >= n) {
                slowPointer = slowPointer.getNext();
            }
            fastPointer = fastPointer.getNext();
            counter += 1;
        }

        return slowPointer.getData();

    }

    public boolean hasCycle() {

        Node fastPointer = getHead();
        Node slowPointer = getHead();

        if (getHead() == null) {
            return false;
        }

        while (fastPointer != null) {
            fastPointer = fastPointer.getNext();
            slowPointer = slowPointer.getNext();

            if (fastPointer != null) {
                fastPointer = fastPointer.getNext();
            }

            if (fastPointer == slowPointer) {
                return true;
            }
        }

        return false;

    }

    public void createCycle() {

        if (getHead() == null) {
            return;
        }

        Node currentNode = getHead();

        while (currentNode.getNext() != null) {
            currentNode = currentNode.getNext();
        }

        currentNode.setNext(getHead());

    }

}

