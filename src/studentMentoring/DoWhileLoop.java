package studentMentoring;

import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int smallCounter = 0;
        int upperCounter = 0;
        int specialChar = 0;
        int digit = 0;

        do {
            System.out.println("Please enter your password");
            String pass = input.nextLine();
            if (pass.length() < 8) {
                System.out.println("at least 8 character");

            } else {

                for (int i = 0; i < pass.length(); i++) {
                    char a = pass.charAt(i);
                    if (a >= 'a' && a <= 'z') {
                        smallCounter++;
                    }
                    if (a >= 'A' && a <= 'Z') {
                        upperCounter++;
                    }
                    if (a >= '!' && a <= '.') {
                        specialChar++;
                    }
                    if (a >= '0' && a <= '9') {
                        digit++;
                    }
                }
                if (smallCounter == 0) {
                    System.out.println("at least 1 small letter");
                    continue;
                }
                if (upperCounter == 0) {
                    System.out.println("at least 1 upper letter");
                    continue;
                }
                if (specialChar == 0) {
                    System.out.println("at least 1 special letter");
                    continue;
                }
                if (digit == 0) {
                    System.out.println("at least 1 digit");

                }
            }

        }
        while (smallCounter == 0 || upperCounter == 0 || specialChar == 0 || digit == 0) ;
        System.out.println("password accepted");
    }
}
