package com.alexiesracca.excercises.datastructures;

import java.util.Arrays;

public class PrimMinimumSpanningTree {

public static void main(String[] args) {
    test();
}

public static void test(){
    System.out.println("\n===[Minimum Spanning Tree - Prim]===");
    // 2D array of node links and weight
    int graph[][] = new int[][] { 
        { 0, 2, 0, 6, 0 }, 
        { 2, 0, 3, 8, 5 }, 
        { 0, 3, 0, 0, 7 }, 
        { 6, 8, 0, 0, 9 }, 
        { 0, 5, 7, 9, 0 } 
    };

        PrimMinimumSpanningTree prim = new PrimMinimumSpanningTree();
        prim.getMinimumSpanningTree(graph);
    }

    int NODE_COUNT = 0;
    int paths [][];
    int key[];
    int parent[];
    boolean nodeSet[];

    public void getMinimumSpanningTree(int [][] graph){
        paths = graph;
        NODE_COUNT = paths.length;
        key = new int[NODE_COUNT];
        parent = new int[NODE_COUNT];
        nodeSet = new boolean[NODE_COUNT];

        //Initialize visited and distance value
        for(int n = 0 ; n < NODE_COUNT ; n++){
            nodeSet[n] = false;
            key[n] = Integer.MAX_VALUE;
        }

        key[0] = 0;
        parent[0] = -1;


        //Jump to other nodes, minus self
        for(int step = 0 ; step < NODE_COUNT - 1 ; step++){

           System.out.println("Weight " +  Arrays.toString(key));

            int minNode = getNodeWithMinWeight();

            nodeSet[minNode] = true;
            
            System.out.println("Set " +  Arrays.toString(nodeSet));

            for(int node = 0 ; node < NODE_COUNT ; node++){

                if(!nodeSet[node] && paths[minNode][node] > 0 && key[minNode] != Integer.MAX_VALUE 
                            && key[minNode] + paths[minNode][node] < key[node]){
                    
                   // key[node] = key[minNode] + paths[minNode][node];

                    parent[node] = minNode;
                    key[node] = paths[minNode][node];
                }

            }
        }

        //show Shortest path
        showSpanningTree();
    }

    private int getNodeWithMinWeight(){
        int node = -1;
        int minKey = Integer.MAX_VALUE;
        
        for(int n = 0; n < NODE_COUNT ; n++){
            if(!nodeSet[n] && key[n] < minKey){
                minKey = key[n];
                node = n;
            }
        }

        return node;
    }

    private void showSpanningTree(){
        System.out.println("Edge \tWeight"); 
        for (int node = 1; node < NODE_COUNT; node++) {
            System.out.println(parent[node] + " - " + node + "\t" + paths[node][parent[node]]); 
        }
    }


}


