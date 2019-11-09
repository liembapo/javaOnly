package string;

import java.util.*;

public class Quiz2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your words : ");
        String word = input.nextLine();

        int spc = word.indexOf(" ");
        String firstWord = word.substring(0,spc);

        String remainWord = word.substring(spc + 1);

        System.out.println(remainWord + " " + firstWord );

    }
}

