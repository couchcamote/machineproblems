package com.alexiesracca.excercises.datastructures;

public class BinaryTree{

    public static void main(String [] args){
        test();
    }

    public static void test(){

        System.out.println("Start Binary Search Tree Test");

        BinaryTree bt = new BinaryTree();
        Node root = null;
        System.out.println("Insert data");
        root = bt.insert(root, 'A');
        root = bt.insert(root, 'Z');
        root = bt.insert(root, 'X');
        root = bt.insert(root, 'S');
        root = bt.insert(root, '1');
        root = bt.insert(root, '6');
        root = bt.insert(root, 'F');
        root = bt.insert(root, 'C');

        System.out.println("Traverse Tree");
        System.out.println("In Order");
        bt.traverseInOrder(root);

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

    public void traverseInOrder(Node node){
        if(node == null ) return;
        traverseInOrder(node.left);
        System.out.print(node.data + " ");
        traverseInOrder(node.right);
    }

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


