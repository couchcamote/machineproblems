package com.alexiesracca.excercises.datastructures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Queue;
import java.util.LinkedList;

public class BreadthFirstTraversal {

    public static void main(String[] args) {
        test();
    }

    public static void test(){
        
        System.out.println("\n===[Breadth First Traversal]===");
        BFNode node40 =new BFNode(40);
		BFNode node10 =new BFNode(10);
		BFNode node20 =new BFNode(20);
		BFNode node30 =new BFNode(30);
		BFNode node60 =new BFNode(60);
		BFNode node50 =new BFNode(50);
        BFNode node70 =new BFNode(70);
        
        BFNode [] allNodes = {node40, node10, node20,  node30, node60, node50, node70};

        node40.addNeighbor(node10);
        node40.addNeighbor(node20);
		node10.addNeighbor(node30);
		node20.addNeighbor(node10);
		node20.addNeighbor(node30);
		node20.addNeighbor(node60);
		node20.addNeighbor(node50);
		node30.addNeighbor(node60);
		node60.addNeighbor(node70);
        node50.addNeighbor(node70);

        BreadthFirstTraversal bft = new BreadthFirstTraversal();
        System.out.println("\n[Depth First Traversal - using Queue]");

        bft.bfTraversal(node40);

    }

    public void bfTraversal(BFNode node){

        if(node == null) return;

        Queue <BFNode> queue = new LinkedList<BFNode>();
       // System.out.println("Que size "+ queue.size());

        queue.add(node);

        while(!queue.isEmpty()){
            BFNode currentNode = queue.remove();
          //  System.out.print("Que size " + queue.size());
            //System.out.println("Queue  " + queue);
            System.out.print(currentNode.toString() + " ");

            currentNode.visited = true;

            for (BFNode neighbor : currentNode.getNeighbors()){
                //System.out.println(neighbor.toString() + " "+ neighbor.visited);
                if(!neighbor.visited){
                    queue.add(neighbor);
                    neighbor.visited = true;
                }
            }
        }




    }




}

class BFNode{

    int data;
    boolean visited;
    List<BFNode> neighbors;

    public BFNode(int data){
        this.data = data;
        this.neighbors = new ArrayList<BFNode>();
    }

    public void addNeighbor(BFNode neighborNode){
        neighbors.add(neighborNode);
    }

    public void setNeighbors(List<BFNode> neighbors){
        this.neighbors = neighbors;
    }

    public List<BFNode> getNeighbors() {
        return neighbors;
    }

    public String toString(){
        return ""+data;
    }
}