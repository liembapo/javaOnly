//Task 2
// Given a String, str2 , (str2 may contain characters, numbers and special characters) perform the following conditional actions:
// Check if str2 has 3 or more characters, if less than 3 or bigger than 100 character, print only Invalid enter
// Get only numbers from str2 and make one string then print (Hint: use charAt(), ASCII table to verify specific character is number or not number)
//
//        Input: av$5yit8
//        Output: 58
//
//        Input: abc23fd5hk7
//        Output: 2357

        package projectTask;

import java.util.Scanner;

public class ProjectStrainTheNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        String word = " ";

        if (str.length() >= 3 && str.length() < 100) {
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) >= '1' && str.charAt(i) <= '9') {
                    word += str.charAt(i);
                }
            }
            System.out.println(word);
        } else {
            System.out.println("invalid enter");
        }
    }
}