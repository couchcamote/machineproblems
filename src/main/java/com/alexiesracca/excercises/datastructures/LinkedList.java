package com.alexiesracca.excercises.datastructures;

public class LinkedList {

    static Node head = null;

    public static void main (String []args) {
        test();
    }

    public static void test(){
        System.out.println("\n===[Linked List Tests]===");
        System.out.println("[Insert and Traverse]");
        head = insert(null, 1);
        insert(head, 2);
        insert(head, 3);
        insert(head, 4);
        insert(head, 5);
        insert(head, 6);
        insert(head, 7);
        insert(head, 8);
        insert(head, 9);
        insert(head, 10);
        traverse(head);

        System.out.println("\n[Remove 4]");
        head = remove(head,4);
        traverse(head);
        System.out.println("\n[Remove 2]");
        head = remove(head,2);
        traverse(head);
        System.out.println("\n[Remove 1]");
        head = remove(head,1);
        traverse(head);
        System.out.println("\n[Remove 3]");
        head = remove(head,3);
        traverse(head);
        System.out.println("\n[Remove 8]");
        head = remove(head,8);
        traverse(head);

    }

    public static Node insert(Node node, int data){
        if (node == null){
            node = new Node(data);
        }else{
            if(node.next == null){
                node.next = new Node(data);
            }
            else{
                node.next = insert(node.next, data);
            }
        }
        return node;
    }

    public static Node remove(Node node, int data){
        if(node ==null) return null;
        if(node.data == data){
            node = node.next;
            return node;
        }
        if(node.next.data == data){
            node.next = node.next.next;     
            return node;
        }
        remove(node.next, data);
        return node;
    }

    public static void traverse(Node node){
        if(node == null) return;
        System.out.print(node.data+ " ");
        traverse(node.next);
    }

}

class Node{
    int data;
    Node next;
    public Node(int data){
        this.data = data;
        next = null;
    }

}