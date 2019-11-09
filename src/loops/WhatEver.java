package loops;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class WhatEver {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word = input.nextLine();
        int smallCounter = 0;
        int upperCounter = 0;
        int specialChar = 0;
        int digit = 0;

        char a = '0';
        if (word.length() >= 8) {
            for (int i = 0; i < word.length(); i++) {
                a = word.charAt(i);
                if (a >= 'A' && a <= 'Z') {
                    upperCounter++;
                } else if (a >= 'a' && a <= 'z') {
                    smallCounter++;
                } else if (a >= 33 && a <= 47 ) {
                    specialChar++;
                } else if (a >= '0' && a <= '9') {
                    digit++;
                }
            }
            if (upperCounter == 0) {
                System.out.println("Contain at least one uppercase letter (A-Z) ");
            } else if (smallCounter == 0) {

                System.out.println("Contain at least one lowercase letter (a-z) ");
            } else if (specialChar == 0) {
                System.out.println("Password should contain at least 1 of these special characters: ~`!@#$%^&*()+=_-{}[]\"" +
                        "|:;”’?/<>,.");
            } else if (digit == 0) {
                System.out.println("Contain at least one digit (0-1-2-3-4-5-6-7-8-9)");
            } else {
                System.out.println("Password accepted");
            }
        } else {
            System.out.println("Be a minimum of eight (8) characters in length ");
        }
    }
}
