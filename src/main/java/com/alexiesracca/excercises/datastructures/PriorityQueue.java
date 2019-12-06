package com.alexiesracca.excercises.datastructures;

import java.util.Arrays;
/**
 * Alexies Racca
 * Max Heap Implementation
 */
public class PriorityQueue {

    static int arrayCapacity = 8;
    static int heapPosition = 0;
    static int [] heap = new int[arrayCapacity];  

    public static void main(String[] args) { test(); }

    public static void test(){
        System.out.println("\n===[Priority Queue - Binary Heap Implementation using Array]===");
        System.out.println("Initial Array > " + Arrays.toString(heap));

        int [] dataset = {1,2,3,4,5,6,7,8,9,10};

        for(int data : dataset){
            push(data);
            System.out.println("Push "+ data+ "  > " + Arrays.toString(heap));
        }

        while(heapPosition > 0){
            pop();
            System.out.println("Pop Top  > " + Arrays.toString(heap));
        }
    }

    public static void push(int value){
        checkArrayCapacity();
        heap[heapPosition] = value;
        bubbleUp();
        heapPosition++;
    }

    public static void pop(){
        if(heapPosition == 0) return;
        if(heapPosition == 1){
            heap[0] = 0;
            heapPosition--;
            return;
        } 
        heap[0] = heap[heapPosition-1];
        heap[heapPosition-1] = 0;
        bubbleDown();
        heapPosition--;
    }

    private static void bubbleUp(){
        int position = heapPosition;
        while(heap[position] > heap[position/2]){
            swap(position/2, position);
            position/=2;
        }
    }

    private static void bubbleDown(){
        int position = 0;
        while(heap[position] < heap[position*2+1] || heap[position] < heap[position*2+2] ){
            //swap with larger child
            if(heap[position*2+1] > heap[position*2+2] ){
                swap(position, position*2+1);
                position = position*2+1;
            }
            else{
                swap(position, position*2+2);
                position = position*2+2;
            }
        }
    }


    private static void swap(int parent, int position){
        int tmp = heap[parent];
        heap[parent] = heap[position];
        heap[position] = tmp;
    }

    /**
     * if capacity is almost full, increase heap size
     */
    private static void checkArrayCapacity(){
        if(heapPosition >= arrayCapacity){
            arrayCapacity *= 2;
            int[] newArray = new int[arrayCapacity];
            newArray = Arrays.copyOf(heap, arrayCapacity);
            heap = newArray;
            newArray = null;
        }
    }


}