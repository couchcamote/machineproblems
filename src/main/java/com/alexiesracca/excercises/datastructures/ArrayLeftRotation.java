package com.alexiesracca.excercises.datastructures;

import java.util.Arrays;

/**
 * Shift rotate contents of array to d positions
 */
public class ArrayLeftRotation {

    public static void main(String[] args) {
        test();
    }

    public static void test(){
        int[] aItems = {1,2,3,4,5,6,7};
        int d = 3;
        int[] a = arrayLeftRotation(aItems, d);
        System.out.println(Arrays.toString(a));
    }


    public static int[] arrayLeftRotation(int [] aItems, int d) {

        int n = aItems.length;

        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            int index = 0; 
            if(i + d >= n){
                index = (i + d) - n;
            }
            else{
              index  = i + d;
            }
            int aItem = aItems[index];
            a[i] = aItem;
         }

        return a;
    }

}
