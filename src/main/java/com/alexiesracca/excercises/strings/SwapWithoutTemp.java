package com.alexiesracca.excercises.strings;

import java.util.Arrays;

public class SwapWithoutTemp {

    public static void main(String[] args) {
        test();
    }

    public static void test(){
        System.out.println("\n\n===[Swap Strings without using Temp variable");
        
        String [][]testData = new String [][]{
                {"Alexies Racca", "Leon Guerrero"},
                {"Crisostomo Ibarra", "Simuon"},
                {"Jack", "Jill"}
            };

        for(String[] s : testData){
            System.out.println(Arrays.toString(s) + " > " + Arrays.toString(swap(s)));
        }
    }

    public static String[] swap(String s[]){

        if(s!=null && s.length == 2 && s[0]!=null && s[1]!=null && s[0].length() > 0 && s[1].length() > 1){

            String a = s[0];
            String b = s[1];

            a = b.concat(a);
            b = a.substring(b.length(), a.length());
            a = a.substring(0, a.length() - b.length());

            s[0] = a;
            s[1] = b;


        }
        return s;
    }

}