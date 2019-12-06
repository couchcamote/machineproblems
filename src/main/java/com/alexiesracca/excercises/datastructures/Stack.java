package com.alexiesracca.excercises.datastructures;

/**
 * Stack implementation using Linked list
 */
public class Stack {

static Node head = null;

public static void main(String[] args) {
    test();
}

public static void test(){
    System.out.println("\n\n===[Stack Implementation using Linked List]===");
    int [] dataset = {1,2,3,4,5,6,7,8,9,10};
    for(int data : dataset){
        System.out.print("[Push "+ data +" and Traverse] [ ");
        push(data);
        traverse(head);
        System.out.println("]");
    }

    while(head!=null){
        System.out.print("[Pop and Traverse] [ ");
        pop();
        traverse(head);
        System.out.println("]");
    }
}

public static void push(int data){
    if(head == null){
        head = new Node(data);
        return;
    }
    Node newNode = new Node(data);
    newNode.next = head;
    head = newNode;
}

public static void pop(){
    head = head.next;
}

public static void traverse(Node node){
    if(node == null) return;
    System.out.print(node.data+ " ");
    traverse(node.next);
}    


}

class Node {
    int data;
    Node next ;

    Node(int data){
        this.data = data;
        next = null;
    }


}