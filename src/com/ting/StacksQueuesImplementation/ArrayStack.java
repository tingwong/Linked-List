package com.ting.StacksQueuesImplementation;

public class ArrayStack {

    public static void main(String[] args) {

        ArrayStack stack = new ArrayStack(10);

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

    public ArrayStack(int n) {
        stack = new Integer[n];
    }

    private Integer[] stack;

    public void push(int n) {

        if (stack[0] == null) {
            stack[0] = n;
            return;
        }

        int i = 0;

        while (stack[i] != null) {
            i++;
        }

        stack[i] = n;

    }

    public int pop() {

        if (stack[0] == null) {
            return -1;
        }

        int i = 0;

        while (stack[i + 1] != null) {
            i++;
        }

        int data = stack[i];
        stack[i] = null;

        return data;

    }

    public boolean isEmpty() {

        if (stack[0] == null) {
            return true;
        }

        return false;
    }

    public int top() {

        if (stack[0] == null) {
            return -1;
        }

        int i = 0;

        while (stack[i + 1] != null) {
            i++;
        }

        int data = stack[i];

        return data;
    }

    public int size() {

        if (stack[0] == null) {
            return -1;
        }

        int i = 0;
        while (stack[i] != null) {
            i++;
        }

        return i;

    }

    public int max() {

        if (stack[0] == null) {
            return -1;
        }

        int max = stack[0];

        for (Integer element : stack) {

            if (element != null && element > max) {
                max = element;
            }

        }

        return max;

    }

    public int min() {

        if (stack[0] == null) {
            return -1;
        }

        int min = stack[0];

        for (Integer element : stack) {

            if (element != null && element < min) {
                min = element;
            }

        }

        return min;

    }

}
