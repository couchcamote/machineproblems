package com.alexiesracca.excercises.datastructures;

/**
 * https://www.hackerrank.com/challenges/2d-array/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=arrays
 */

public class HourGlass {

    // Complete the hourglassSum function below.
    static int hourglassSum(int[][] arr) {
        int sum = 0;
         int max = -100;
        for(int row = 0; row < arr[0].length  - 2; row++){
            for(int col = 0; col < arr.length  - 2; col++){
               // System.out.println(row +" "+ col + " " + arr[row][col]);
                sum=arr[row][col]+arr[row][col+1]+arr[row][col+2]+
                                  arr[row+1][col+1]+
                    arr[row+2][col]+arr[row+2][col+1]+arr[row+2][col+2];
                    if(sum > max) max = sum;
            }
        }

       return max; 
    }

    public static void test(){

        int [][] matrix =  
        {
            {1, 1, 1, 0, 0, 0},
            {0, 1, 0, 0, 0, 0},
            {1, 1, 1, 0, 0, 0},
            {0, 0, 2, 4, 4, 0},
            {0, 0, 0, 2, 0, 0},
            {0, 0, 1, 2, 4, 0}
        };

        int result = hourglassSum(matrix);
        System.out.println(result);

    }

    public static void main(String[] args)  {
       test();
    }
}
