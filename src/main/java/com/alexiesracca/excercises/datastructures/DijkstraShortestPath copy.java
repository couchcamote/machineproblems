package com.alexiesracca.excercises.datastructures;

import java.util.Arrays;

public class DijkstraShortestPath {

public static void main(String[] args) {
    test();
}

public static void test(){
    System.out.println("\n===[Shorest Path - Dijkstra's Algorithm]===");
    // 2D array of node links and distance
    int graph[][] = new int[][] { 
            { 0, 4, 0, 0, 0, 0, 0, 8, 0 }, 
            { 4, 0, 8, 0, 0, 0, 0, 11, 0 }, 
            { 0, 8, 0, 7, 0, 4, 0, 0, 2 }, 
            { 0, 0, 7, 0, 9, 14, 0, 0, 0 }, 
            { 0, 0, 0, 9, 0, 10, 0, 0, 0 }, 
            { 0, 0, 4, 14, 10, 0, 2, 0, 0 }, 
            { 0, 0, 0, 0, 0, 2, 0, 1, 6 }, 
            { 8, 11, 0, 0, 0, 0, 1, 0, 7 }, 
            { 0, 0, 2, 0, 0, 0, 6, 7, 0 } 
        }; 

        DijkstraShortestPath dj = new DijkstraShortestPath();
        dj.getShortestPath(graph, 0);
    }

    int NODE_COUNT = 0;
    int paths [][];
    int distance[];
    boolean visited[];

    public void getShortestPath(int [][] graph, int sourceNode){
        paths = graph;
        NODE_COUNT = paths.length;
        distance = new int[NODE_COUNT];
        visited = new boolean[NODE_COUNT];

        //Initialize visited and distance value
        for(int n = 0 ; n < NODE_COUNT ; n++){
            visited[n] = false;
            distance[n] = Integer.MAX_VALUE;
        }

        distance[sourceNode] = 0;

        //Jump to other nodes, minus self
        for(int step = 0 ; step < NODE_COUNT - 1 ; step++){

           System.out.println("Distances " +  Arrays.toString(distance));

            int closestNode = getNodeWithMinDistance();

            visited[closestNode] = true;
            
            //System.out.println("Visited " +  Arrays.toString(visited));

            for(int node = 0 ; node < NODE_COUNT ; node++){

                if(!visited[node] && paths[closestNode][node] > 0 && distance[closestNode] != Integer.MAX_VALUE 
                            && distance[closestNode] + paths[closestNode][node] < distance[node]){
                    distance[node] = distance[closestNode] + paths[closestNode][node];
                }

            }
        }

        //show Shortest path
        showShortestPath();
    }

    private int getNodeWithMinDistance(){
        int node = -1;
        int minDistance = Integer.MAX_VALUE;
        
        for(int n = 0; n < NODE_COUNT ; n++){
            if(!visited[n] && distance[n] < minDistance){
                minDistance = distance[n];
                node = n;
            }
        }

        return node;
    }

    private void showShortestPath(){
        System.out.println("Path\tDistance");
        for(int n = 0 ; n < NODE_COUNT ; n++){
            System.out.println(n+"\t"+distance[n]);
        }
    }


}


