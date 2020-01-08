package com.alexiesracca.excercises.numbers;

import java.util.Arrays;

public class SieveOfEratosthenes{

public static void main(String[] args) {
    test();
}

public static void test(){
    boolean []flags = getAllPrimes(9999);
    displayPrime(flags);
}

public static boolean[] getAllPrimes(int n){
    boolean flags[] = new boolean[n + 1];
    Arrays.fill(flags, true);
    flags[0] = false;
    flags[1] = false;
   // System.out.println(Arrays.toString(flags));

    int prime = 2;

    while(prime <= Math.sqrt(n)){
        crossOf(flags, prime);
        prime = getNextPrime(flags, prime);
    }
    return flags;
}

public static void crossOf(boolean[] flags, int prime){

    for(int i = prime * prime; i < flags.length; i += prime){
        flags[i] = false;
    }

}

private static int getNextPrime(boolean [] flags, int prime){
    int next = prime + 1;
    while(next < flags.length && !flags[next]){
        next++;
    }
    return next;
}

public static void displayPrime(boolean [] flags){
    for (int i=2; i < flags.length; i++){
        if(flags[i]){
            System.out.print(i+" ");
        }
    }

}


}