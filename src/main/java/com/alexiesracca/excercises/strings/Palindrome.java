package com.alexiesracca.excercises.strings;

public class Palindrome {

    public static void main(String[] args) {
        test();
    }

    public static void test() {
        System.out.println("\n==[Palindrome Strings]==");
        String[] strSet = { "nakakapagtaka", "tororot", "101010101", "anutforajaroftuna","alexies" };
        for (String str : strSet) {
            System.out.println(str + " =>  " + isPalindrome(str));
        }
    }

    public static boolean isPalindrome(String str) {

        int start = 0;
        int end = str.length() - 1;

        while (start < end) {
            if (str.charAt(start) == str.charAt(end)) {
                start++;
                end--;
            } else {
                return false;
            }
        }

        return true;
    }

}