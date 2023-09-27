package org.example;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        // built-in implementation of LinkedList
        LinkedList<String> linkedList = new LinkedList<>();

        // Add elements to the linked list
        linkedList.add("Element 1");
        linkedList.add("Element 2");
        linkedList.add("Element 3");

        // Print the linked list
        System.out.println(linkedList);

        // My implementation of Node
        Node head = new Node(7);
        Node node2 = new Node(5);
        Node node3 = new Node(3);

        head.next = node2;
        node2.next = node3;

        Node current = head;

        while (current != null) {
            System.out.println(current.val);
            current = current.next;
        }
    }
}