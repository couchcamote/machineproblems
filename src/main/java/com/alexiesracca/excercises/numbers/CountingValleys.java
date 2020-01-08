package com.alexiesracca.excercises.numbers;

public class CountingValleys {


public static void main(String[] args) {
    test();
}

public static void test(){
    String s = "UDUDDUUUDUDUDUUDUUDDDDDUDUDDDDUUDDUDDUUUUDUUDUDDDDUDUDUUUDDDUUUDUDDUUDDDUUDDUDDDUDUUDUUDUUDUDDDUUUUU";
    int result = countingValleys(100, s);
    System.out.println("Result " + result);

}

static int countingValleys(int n, String s) {

    int ret = 0;
    int level = 0;

    char[] steps = s.toCharArray();

    for(char step : steps){
 
        if(step == 'U'){
            level++;

            if(level == 0 && step == 'U'){
                ret++;
            }
        }
        else{
            level--;
        }

      //  System.out.println(step + " level > "+ level+ " previousLevel>"+ previousLevel);

    }

    return ret;

}



}