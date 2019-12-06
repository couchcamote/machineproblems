package com.alexiesracca.excercises.datastructures;

import java.util.Arrays;

public class BinaryTree {

    public static void main(String [] args){
        test();
    }

    public static void test(){

        System.out.println("\n==[Start Binary Search Tree Test]==");

        BinaryTree bt = new BinaryTree();
        Node root = null;

        char [] charset = {'A','X','Z','1','Y','B'};
    
        System.out.println("Insert "+ Arrays.toString(charset));
        for(char c : charset ){
            root = bt.insert(root, c);
        }

        System.out.println("\n[Traverse Tree - PreOrder]");
        bt.preOrder(root);
        System.out.println("\n[Traverse Tree - In Order]");
        bt.traverseInOrder(root);
        System.out.println("\n[Traverse Tree - PostOrder]");
        bt.postOrder(root);

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


    public void preOrder(Node node){
        if(node == null ) return;
        System.out.print(node.data + " ");
        preOrder(node.left);
        preOrder(node.right);
    }

    public void traverseInOrder(Node node){
        if(node == null ) return;
        traverseInOrder(node.left);
        System.out.print(node.data + " ");
        traverseInOrder(node.right);
    }

    public void postOrder(Node node){
        if(node == null ) return;
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.data + " ");
    }

class Node<T extends Comparable<T>>{
    Node left;
    Node right;   
    T data;

    public Node(T data){
        this.data = data;
        this.left = null;
        this.right = null;
    }

}


}



