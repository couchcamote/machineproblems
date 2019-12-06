package com.alexiesracca.excercises.datastructures;

import java.util.Arrays;

/**
 * Stack Implementation using Array
 */
public class StackUsingArray {

static int stackArraySize = 8;
static int[] stackArray = new int[stackArraySize];
static int stackHeadIndex = -1;


public static void main(String[] args) {
    test();
}

public static void test(){
    System.out.println("\n\n===[Stack Implementation Using Array]===");
    int [] dataset = {1,2,3,4,5,6,7,8,9,10,11,12};
    for(int data : dataset){
        push(data);
        System.out.println("[Push "+ data +" and Traverse] [ " + Arrays.toString(stackArray)+ "] Head > "+ stackHeadIndex);
    }

    while(stackHeadIndex > 0){
        pop();
        System.out.println("[Pop Top and Traverse] [ " + Arrays.toString(stackArray)+ "] Head > "+ stackHeadIndex);
    }

}

public static void push(int data){
    stackHeadIndex++;
    checkArrayCapacity();
    stackArray[stackHeadIndex] = data;
}

public static void pop(){
    stackArray[stackHeadIndex] = 0;
    stackHeadIndex--;
}

private static void checkArrayCapacity(){
    if(stackHeadIndex >= stackArraySize){
        stackArraySize *= 2;
        int[] newArray = Arrays.copyOf(stackArray, stackArraySize);
        stackArray = newArray;
        newArray = null;
    }
}

}