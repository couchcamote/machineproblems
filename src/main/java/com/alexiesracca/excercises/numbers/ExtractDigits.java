package com.alexiesracca.excercises.numbers;

public class ExtractDigits {

public static void main(String[] args) {
    test();
}

public static void test(){
int num = 1234567890;
System.out.println("\n==[Extract Digits of a number -> "+num+"]==");
extractDigits(num);

}

public static void extractDigits(int digits){
int num = digits;

    while(num > 0){
        System.out.print(num%10+" ");
        num /=10;
    }

}


}