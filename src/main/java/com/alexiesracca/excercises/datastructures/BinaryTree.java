package com.alexiesracca.excercises.datastructures;

import java.util.Arrays;
import java.util.Queue; 
import java.util.LinkedList;

public class BinaryTree {

    public static void main(String [] args){
        test();
    }

    public static void test(){

        System.out.println("\n==[Start Binary Search Tree Test]==");

        BinaryTree bt = new BinaryTree();
        Node root = null;

        //char [] charset = {'A','X','Z','1','Y','B','G','J','P','E'};
        char [] charset = {'0','9','8','7','6','5','4','3','2','1'};
    
        System.out.println("Insert "+ Arrays.toString(charset));
        for(char c : charset ){
            root = bt.insert(root, c);
        }

        System.out.println("\n[Traverse Tree - PreOrder]");
        bt.traversePreOrder(root);
        System.out.println("\n[Traverse Tree - In Order]");
        bt.traverseInOrder(root);
        System.out.println("\n[Traverse Tree - PostOrder]");
        bt.traversePostOrder(root);
        System.out.println("\n[Traverse Tree - InOrder Reverse]");
        bt.traverseInOrderReverse(root);
        System.out.println("\n[Traverse Tree - Level Order]");
        bt.traverseLevelOrder(root);

    }

    public Node insert(Node node, Comparable data){
        if(node == null){
            node = new Node(data);
        }else if(node.data.compareTo(data) > 0){
            node.left = insert(node.left, data);
        }else{
            node.right = insert(node.right, data);
        }
        return node;
    }


    public void traversePreOrder(Node node){
        if(node == null ) return;
        System.out.print(node.data + " ");
        traversePreOrder(node.left);
        traversePreOrder(node.right);
    }

    public void traverseInOrder(Node node){
        if(node == null ) return;
        traverseInOrder(node.left);
        System.out.print(node.data + " ");
        traverseInOrder(node.right);
    }

    public void traversePostOrder(Node node){
        if(node == null ) return;
        traversePostOrder(node.left);
        traversePostOrder(node.right);
        System.out.print(node.data + " ");
    }

    public void traverseInOrderReverse(Node node){
        if(node == null ) return;
        traverseInOrderReverse(node.right);
        System.out.print(node.data + " ");
        traverseInOrderReverse(node.left);        

    }

    public void traverseLevelOrder(Node node){

        Queue<Node> queue = new LinkedList<>();
        
        queue.add(node);

        while(queue.size() > 0){
            Node enqueued = queue.remove();
            System.out.print(enqueued.data+ " ");
            if(enqueued.left!=null) queue.add(enqueued.left);
            if(enqueued.right!=null) queue.add(enqueued.right);
        }


    }

class Node<T extends Comparable<T>>{
    Node left, right;
    T data;

    public Node(T data){
        this.data = data;
        this.left = null;
        this.right = null;
    }

}


}



