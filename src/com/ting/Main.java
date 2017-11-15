package com.ting;

import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;
import sun.awt.image.ImageWatched;

public class Main {

    public static void main(String[] args) {

        // Instantiate new Linked List
        LinkedList linkedList = new LinkedList();

        // Insert nodes into Linked List
        System.out.print("(Insert: Expecting 1 3 5)   ");
        linkedList.insertNode(5);
        linkedList.insertNode(3);
        linkedList.insertNode(1);
        linkedList.visitList();
        System.out.println();

        // Delete Node 5 to validate "Delete"
        System.out.print("(Delete: Expecting 1 3)   ");
        linkedList.delete(5);
        linkedList.visitList();
        System.out.println();

        // Validate Search
        System.out.print("(Search: Expecting True)   ");
        System.out.println(linkedList.searchValue(3));
        System.out.print("(Search: Expecting False)   ");
        System.out.println(linkedList.searchValue(100));

        // Validate findMax / findMin
        linkedList.insertNode(0);
        linkedList.insertNode(-2);
        System.out.print("(findMax: Expecting 100)   ");
        System.out.println(linkedList.findMax());
        System.out.print("(findMin: Expecting -2)   ");
        System.out.println(linkedList.findMin());

        // Validate length
        System.out.print("(Length: Expecting 4)   ");
        System.out.println(linkedList.findLength());

        // Validate Nth from Beginning
        System.out.print("(Nth from Beginning: Expecting 1)   ");
        System.out.println(linkedList.findNthBeginning(2));
        System.out.print("(Nth from Beginning: Expecting -2)   ");
        System.out.println(linkedList.findNthBeginning(0));

        // Validate insertAscending
        System.out.println("(Insert Ascending: Expecting -100 2 0 1 3)   ");
        linkedList.insertAscending(-100);
        linkedList.visitList();
        System.out.println();
        System.out.println("(Insert Ascending: Expecting -100 2 0 1 3 10)    ");
        linkedList.insertAscending(10);
        linkedList.visitList();
        System.out.println();
        System.out.println("(Insert Ascending: Expecting -100 2 0 1 3 8 10)    ");
        linkedList.insertAscending(8);
        linkedList.visitList();
        System.out.println();

        LinkedList newTest = new LinkedList();
        System.out.println("NEW LIST");
        newTest.insertAscending(-100);
        newTest.visitList();

        // Validate reverse
        System.out.println("(Reverse: Expecting 10 8 3 1 0 2 -100)");
        linkedList.reverse();
        linkedList.visitList();

        // Validate findMiddleValue
        System.out.println();
        System.out.println("(findMiddleValue: Expecting 1)");
        System.out.println(linkedList.findMiddleValue());

        // Validate findNthFromend
        System.out.println("(Find Nth from End: Expecting 0)");
        System.out.println(linkedList.findNthFromEnd(2));
        System.out.println("(Find Nth from End: Expecting -100)");
        System.out.println(linkedList.findNthFromEnd(0));
        System.out.println("(Find Nth from End: Expecting 10)");
        System.out.println(linkedList.findNthFromEnd(6));

        // Implement cycle
        System.out.println("(Has Cycle: Expecting False)");
        System.out.println(linkedList.hasCycle());

        linkedList.createCycle();
        System.out.println("(Has Cycle: Expecting True)");
        System.out.println(linkedList.hasCycle());
    }
}
