package org.example;

public class Node {
    int val;
    public Node next;
    public Node prev;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.prev = null;
    }
}
