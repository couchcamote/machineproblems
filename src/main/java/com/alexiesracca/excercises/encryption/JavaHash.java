package com.alexiesracca.excercises.encryption;

import java.security.*;

public class JavaHash {

    public static void main(String[] args) {
        String message = "Alexies";


        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte[] hash = md.digest(message.getBytes());
            for (byte b : hash) {
                System.out.printf("%02x", b);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}

