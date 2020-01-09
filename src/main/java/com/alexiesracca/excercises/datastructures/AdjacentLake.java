package com.alexiesracca.excercises.datastructures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AdjacentLake {

public static void main(String[] args) {
    test();
}

public static void test(){ 
    int [][] land = {
            {0,2,1,0},
            {0,1,0,1},
            {1,1,0,1},
            {0,1,0,1}
    };

    List adjacentLakeSizes = getAdjacentLakeSize(land);
    System.out.println(adjacentLakeSizes);
}

public static List getAdjacentLakeSize(int[][] land) {
    List pondSizes = new ArrayList();
    boolean [][] visited = new boolean[land.length][land[0].length];

    for(int row = 0; row < land.length; row++){
        for(int col = 0; col < land[0].length; col++){
            int size = computeSize(land, visited, row, col);
            if(size > 0){
                pondSizes.add(size);
            }
        }
    }

    return pondSizes;
}

public static int computeSize(int[][] land, boolean [][] visited, int row, int col){
    int size = 1;
    if(row < 0 || col < 0 || col >= land.length || row >= land[0].length ||
        land[row][col]!=0  || visited[row][col])
    {
        return 0;
    }

    visited[row][col] = true;

    for(int adjacentrow = -1; adjacentrow <=1; adjacentrow++){
        for(int adjacentcol = -1; adjacentcol <=1; adjacentcol++){
            size+=computeSize(land, visited, row+adjacentrow, col+adjacentcol);
        }
    }


    return size;
}


}