package com.alexiesracca.excercises.datastructures;

import java.io.*;

public class LinkedListInsertAtPosition {

    static class SinglyLinkedListNode {
        public int data;
        public SinglyLinkedListNode next;

        public SinglyLinkedListNode(int nodeData) {
            this.data = nodeData;
            this.next = null;
        }
    }

    static class SinglyLinkedList {
        public SinglyLinkedListNode head;
        public SinglyLinkedListNode tail;

        public SinglyLinkedList() {
            this.head = null;
            this.tail = null;
        }

        public void insertNode(int nodeData) {
            SinglyLinkedListNode node = new SinglyLinkedListNode(nodeData);

            if (this.head == null) {
                this.head = node;
            } else {
                this.tail.next = node;
            }

            this.tail = node;
        }
    }

    public static void printSinglyLinkedList(SinglyLinkedListNode node) throws IOException {
        while (node != null) {
            System.out.println(node.data + " ");
            node = node.next;
        }
    }

    static SinglyLinkedListNode insertNodeAtPosition(SinglyLinkedListNode head, int data, int position) {
            if(head == null){
                return null;
            }
            SinglyLinkedListNode current = head;
            while(--position > 0){
                current = current.next;
            }
            SinglyLinkedListNode newNode = new SinglyLinkedListNode(data);
            newNode.next = current.next;
            current.next = newNode;
        return head;
    }

    public static void main(String[] args) throws IOException {

        SinglyLinkedList llist = new SinglyLinkedList();

        int llistCount = 3;
        int[] dataSet = {16,13,7};

        for (int data : dataSet) {
            llist.insertNode(data);
        }


        int position = 2;

        int addData = 1;

        SinglyLinkedListNode llist_head = insertNodeAtPosition(llist.head, addData, position);

        printSinglyLinkedList(llist_head);
        

    }
}
