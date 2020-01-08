package com.alexiesracca.excercises.numbers;

import java.io.*;
import java.util.*;

/**
 * 
    Sock Merchant
    https://www.hackerrank.com/challenges/sock-merchant/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=warmup
 */
public class SocksCount {

    // Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) {
        int ret = 0;
        
        Set<String> socksMap = new <String>HashSet();

        for(int i : ar){
            //System.out.print(i+" ");
            //has pair
            String iStr = ""+i;
            if(socksMap.remove(iStr)){
                ret++;
            }else{
                //no pair
                socksMap.add(iStr);
            }
        }
    return ret;
    }
    
    public static void main(String[] args) throws IOException {       
        test();
    }

    public static void test(){
        int n = 9;
        int [] ar = {10, 20, 20, 10, 10, 30, 50, 10, 20};
       // Arrays.stream(ar).forEach(i -> System.out.print(i+ " "));
        System.out.println(Arrays.toString(ar));
        int result = sockMerchant(n, ar);
        System.out.println("\n"+result);
    }
}
