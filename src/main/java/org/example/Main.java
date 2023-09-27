package org.example;

import java.util.LinkedList;
import java.util.Random;

public class Main {
    static int linearSearch(int[] nums, int numberToFind) {
        for(int i = 0; i < nums.length; i++) {

            if(nums[i] == numberToFind) {
                return i;
            }
        }
        return -1;
    }

    static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // If the target is found at the middle, return its index
            if (arr[mid] == target) {
                return mid;
            }

            // If the target is greater, ignore the left half
            if (arr[mid] < target) {
                left = mid + 1;
            }

            // If the target is smaller, ignore the right half
            else {
                right = mid - 1;
            }
        }
        // If the target is not found in the array, return -1
        return -1;
    }

    static void bubbleSort(int arr[]) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if(arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j+1] = tmp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }

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
        node3.prev = node2;
        node2.prev = head;

        Node current = head;

        while (current != null) {
            System.out.println(current.val);
            current = current.next;
        }
        System.out.println("going backwards");
        current = node3;
        while (current != null) {
            System.out.println(current.val);
            current = current.prev;
        }

        int[] numbers = new int[100_000_000]; // Create an array to hold 1,000,000 numbers

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1; // Populate the array with numbers from 1 to 1,000,000
        }
        int target = 99_000_000;

        double start = System.nanoTime();
        int result = binarySearch(numbers, target);
        double end = (System.nanoTime() - start) / 1_000_000_000;

        System.out.println("Algorithm took " + end);
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found in the array.");
        }

        Random rand = new Random();
        int[] numbers2 = new int[10000000];

        for (int i = 0; i < numbers2.length; i++) {
            numbers2[i] = rand.nextInt(100000);
        }

        bubbleSort(numbers2);


    }
}