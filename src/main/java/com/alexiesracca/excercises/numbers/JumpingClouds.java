package com.alexiesracca.excercises.numbers;

import java.io.*;

public class JumpingClouds {

    // Complete the jumpingOnClouds function below.
    static int jumpingOnClouds(int[] c) {

        int jump = 0;
        int position = 0;
        
        while(position < c.length - 1){
            if(position + 2 < c.length && c[position + 2] == 0){
                position+=2;
                jump++;
            }else if(position + 1 < c.length && c[position + 1] == 0){
                position+=1;
                jump++;
            }
        }

        return jump;
    }


    public static void main(String[] args) throws IOException {
        test();
    }

    public static void test(){
        int [] c = {0, 0, 0, 0, 1, 0};
        int result = jumpingOnClouds(c);
        System.out.println(result);
    }
}
