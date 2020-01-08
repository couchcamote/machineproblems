package com.alexiesracca.excercises.numbers;

public class PrimeNumber {


    public static void main(String[] args) {
        test();
    }

    public static void test(){
        System.out.println(isPrime(1));
        System.out.println(isPrime(9));
        System.out.println(isPrime(27));
        System.out.println(isPrime(23));
        System.out.println(isPrime(11));
        System.out.println(isPrime(997));
        System.out.println(isPrime(9929));
    }

    public static boolean isPrime(long l){
        
        if(l < 2) return false;

        int sqr = (int)Math.sqrt(l);

        for (int i = 2 ; i <= sqr; i++){
            if(l % i == 0){
                return false;
            }
        }

        return true;
    }

}