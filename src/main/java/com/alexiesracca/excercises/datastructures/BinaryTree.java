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

    public Node findAndremove(Node root, int data){
        //find the data
        boolean found = findThis(data);
        if(found){
            remove(root, data);
        }
        return root;
    }

    public boolean find(){

    }

    public Node remove (Node node, int data){
        if(node == null) return null;
        if(node.data.compareTo(data) > 0){
            node.left = remove(node.left, data);
        }else if(node.data.compareTo(data) < 0){
            node.right = remove(node.right, data);
        }else{
            //scenarios
            if(node.left == null){
                Node rightChild = node.right;
                node.data = null;
                node = null;
                return rightChild;
            }else if(node.right == null){
                Node leftChild = node.left;
                node.data = null;
                node = null;
                return leftChild;
            }else{
                //smallest value in right sub tree 
                //or biggest value in left subtree
                Node min = findMin(node.right);
                //copy value
                node.data = min.data;

                //remove orig node
                node.right = remove(node.right, data);
            }
        }

        return node;
    }

    private Node findMin(Node node){
        while(node.left !=null){
            node = node.left;
        }
        return node;
    }

    private Node findMax(Node node){
        while(node.right!=null){
            node = node.right;
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
            if(enqueued.left!=null) queue.add(enqueued.left);
            if(enqueued.right!=null) queue.add(enqueued.right);
            System.out.print(enqueued.data+ " ");
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



