//Ask user to enter a new password. If the password does not match any of the requirements below, print a message based on what requirement it is breaking. If it does not break any requirement, print ‘Password accepted’.
//        Password requirements:
//        Be a minimum of eight (8) characters in length
//        Contain at least one uppercase letter (A-Z)
//        Contain at least one lowercase letter (a-z)
//        Contain at least one digit (0-1-2-3-4-5-6-7-8-9)
//        Contain at least one special character (~`!@#$%^&*()+=_-{}[]\|:;”’?/<>,.)
//Input:
//oxidex
//Output:
//Password should contain minimum 8 characters
//Input:
//abcdefghi
//Output:
//Password should contain at least 1 uppercase number
//Input:
//ABCDEFGHI
//Output:
//Password should contain at least 1 lowercase number
//Input:
//Abcdefghi
//Output:
//Password should contain at least 1 digit
//Input:
//Abcdefghi1
//Output:
//Password should contain at least 1 of these special characters: ~`!@#$%^&*()+=_-{}[]\|:;”’?/<>,.
//
//        Input:
//        Abcdefghi1$
//        Output:
//        Your password is accepted
package loops;

import java.util.*;
public class PasswordValidation {
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
