package com.alexiesracca.excercises.numbers;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


/**
 * On an array of numbers, retain a list of numbers with odd count 
 *
 */

public class RetainOddCount{

    public static void main(String[] args) {
        test();
    }

    public static void test(){
        int num[] = {1,2,3,2,4,5,3,6,7,5,8,5,9,5,0};
        List <Integer> list = IntStream.of(num).boxed().collect(Collectors.toList());
        System.out.println(retainEventCount(list));
    }

    public static List<Integer> retainEventCount(List <Integer> list){

        List <Integer>oddCountList = new ArrayList<Integer>();

        for(Integer i : list){
           // System.out.println(i);
           if(oddCountList.indexOf(i) >= 0 ){
               oddCountList.remove(i);
           }else{
                oddCountList.add(i);
           }    

        }

    return oddCountList;

    }




}