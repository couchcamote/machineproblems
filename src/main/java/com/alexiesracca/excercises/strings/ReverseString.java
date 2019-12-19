package com.alexiesracca.excercises.strings;

public class ReverseString {

    public static void main(String[] args) {
        test();
    }

    public static void test(){
        System.out.println("\n\n===[Reverse a String]===");
       System.out.println("\n Alexies > " + reverseString("Alexies") );
    System.out.println("Lorem Ipsum > "+ reverseString("Lorem Ipsum"));
    }

    public static String reverseString(String s){

        if(s!=null && !s.isEmpty() && s.length() > 2){
            
            char [] charsValue = s.toCharArray();

            int start = 0;
            int end = charsValue.length - 1;
    
            char tmp;
    
            while(start < end){
                tmp =  charsValue[end];
                charsValue[end--] = charsValue[start];
                charsValue[start++] = tmp;
            }   
    
    
            return new String(charsValue);
        }
        return s;
    }

}