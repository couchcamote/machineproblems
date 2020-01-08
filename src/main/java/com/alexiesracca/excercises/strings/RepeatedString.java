package com.alexiesracca.excercises.strings;

public class RepeatedString {


    public static void main(String[] args) {
        test();
    }

    public static void test(){
        String s = "aba";
        long n = 10;
        long result = repeatedString(s, n);
        System.out.println(result);
    }

    static long repeatedString(String s, long n) {
        long count = countAs(s);
        count *= n / s.length();
        long end = n % s.length();
        int endInt = (int) end;
        count += countAs(s.substring(0, endInt));

        return count;
    }

    static long countAs(String s){
        long count = 0;
        for(char c : s.toCharArray()){
            if(c == 'a'){
                count++;
            }
        }
        return count;
    }



}