package com.alexiesracca.excercises.datastructures;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;


public class DepthFirstTraversal {

    public static void main(String[] args) {
        test();
    }

    public static void test(){

        System.out.println("\n===[Depth First Traversal]===");

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

        DepthFirstTraversal dfsInstance = new DepthFirstTraversal();

        System.out.println("\n[Depth First Traversal - using Recursion]");
        dfsInstance.dfs(node40);
        System.out.println("\n[Depth First Traversal - using Stack]");
        dfsInstance.resetNode(allNodes);
        dfsInstance.dfsWithStack(node40);
       
    }

    private void resetNode(BFNode[] nodes){
        
        for(BFNode node : nodes){
            node.visited = false;
        }        
    }   

    public void dfs(BFNode node){
        if(node == null) return;

        System.out.print(node.data + " ");
        node.visited = true;

        for(BFNode neighbor : node.getNeighbors()){
            if(!neighbor.visited){
                dfs(neighbor);
            }
        }
    }

    public void dfsWithStack(BFNode node){

        if(node == null) return;

        Stack <BFNode> stack = new Stack<BFNode>();

        stack.push(node);

        while(!stack.empty()){
            BFNode current = stack.pop();

            if(!current.visited){
                System.out.print(current.data + " ");
                current.visited = true;
            }

            List<BFNode> neighbors = current.getNeighbors();

            for(BFNode neighbor : neighbors){
                if(!neighbor.visited){
                    stack.push(neighbor);
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
}
