package string;

import java.util.Scanner;

public class Quiz9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("please enter first word : ");
        String word1 = input.nextLine().trim();
        System.out.print("please enter second word : ");
        String word2 = input.nextLine().trim();

        boolean a = (word1.length() >= 6) && (word2.length() >= 6);

        int lastword = word2.length();
        String email = " ";
//        String b = word1.substring(0,4);
//        String c = word2.substring(lastword-3);

        if (a){
            email = word1.substring(0,4);
            email += word2.substring(lastword-3);
            email += "@cybertek.com";
            System.out.println(email);
        }else {
            System.out.println( "Invalid data");}

    }
}
