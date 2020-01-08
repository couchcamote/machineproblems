package com.alexiesracca.excercises.numbers;

public class FlipBinaryValue {

    public static void main(String[] args) {
        test();
    }

    public static void test(){
        System.out.println(flip(100));
        System.out.println(flip(900000));
    }

    public static long flip(long l){

        String lbin = Long.toBinaryString(l);
        String bin1_32bit = "11111111111111111111111111111111";
        System.out.print(lbin +" XOR " + bin1_32bit + " => ");
        long xOrTo = (long) Long.parseLong(bin1_32bit, 2);
        return l ^ xOrTo;
    }

}