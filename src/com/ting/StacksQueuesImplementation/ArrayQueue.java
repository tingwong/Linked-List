package com.ting.StacksQueuesImplementation;

public class ArrayQueue {

    public static void main(String[] args) {

        ArrayQueue queue = new ArrayQueue(10);

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

    private Integer[] queue;

    public ArrayQueue(int n) {
         queue = new Integer[n];
    }

    public void enqueue(int n) {
        if (queue[0] == null) {
            queue[0] = n;
            return;
        }

        int i = 0;

        while (queue[i] != null) {
            i++;
        }

        queue[i] = n;

    }

    public int dequeue() {

        int data = queue[0];

        for (int i = 1; i < queue.length; i++) {
            queue[i-1] = queue[i];
        }

        queue[queue.length - 1] = null;

        return data;

    }

    public boolean isEmpty() {

        if (queue[0] == null) {
            return true;
        }

        return false;

    }

    public int front() {

        return queue[0];

    }

    public int size() {

        if (queue[0] == null) {
            return 0;
        }

        int i = 0;

        while (queue[i] != null) {
            i++;
        }

        return i;

    }

    public int max() {

        if (queue[0] == null) {
            return -1;
        }

        int max = queue[0];
        int i = 0;

        while (queue[i] != null) {
            if (queue[i] > max) {
                max = queue[i];
            }
            i++;
        }

        return max;

    }

    public int min() {

        if (queue[0] == null) {
            return -1;
        }

        int min
                = queue[0];
        int i = 0;

        while (queue[i] != null) {
            if (queue[i] < min) {
                min = queue[i];
            }
            i++;
        }

        return min;
    }
}
