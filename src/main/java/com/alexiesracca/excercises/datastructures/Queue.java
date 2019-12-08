package com.alexiesracca.excercises.datastructures;

/**
 * Queue using linked list
 */
public class Queue {

    public static void main(String[] args) {
        test();
    }

    public static void test(){
        System.out.println("\n\n===[Queue - Implementation Using Double Linked List]===");

        int[] dataSet = {1,2,3,4,5,6};
        Queue q = new Queue();

        for(int data : dataSet){
            q.enqueue(data);
            System.out.print("\n[Enqueue "+data+" size="+q.qSize+"] => ") ;
            q.traverse(q.tail);
        }
        
       

        while(q.qSize > 0){
            q.dequeue();
            System.out.print("\n[Dequeue size="+q.qSize+" ]=> ") ;
            q.traverse(q.tail);
        }
           
    }

    DoubleLinkedListNode head = null;
    DoubleLinkedListNode tail = null;
    int qSize = 0;

    public DoubleLinkedListNode enqueue(int data){
        if(head == null){
            head = new DoubleLinkedListNode(data);
            tail = head;
        }else{
            DoubleLinkedListNode newNode = new DoubleLinkedListNode(data);
            DoubleLinkedListNode lastHead = head;
            lastHead.next = newNode;
            newNode.previous = lastHead;
            head = newNode;
            newNode = null;
            lastHead = null;
        }
        qSize++;
        return head;
    }

    public DoubleLinkedListNode dequeue(){
        if(tail != null){
            DoubleLinkedListNode oldTail = tail;
            DoubleLinkedListNode newtail;
            
            if(oldTail.next != null){
                newtail = oldTail.next;
                newtail.previous = null;
                tail = newtail;
            }
            else{
                tail = null;
                head =null;
            }
            
            oldTail.next = null;
            oldTail.previous = null; 
            oldTail = null;
            qSize--;
        }
        return tail;
    }

    public void traverse(DoubleLinkedListNode node){
         if(node == null) return;
        System.out.print(String.valueOf(node.data) + " ");
        traverse(node.next);
    }

    class DoubleLinkedListNode{

        DoubleLinkedListNode next;
        DoubleLinkedListNode previous;
        int data;
    
        DoubleLinkedListNode(int data){
            this.data = data;
        }
    
    }

}


