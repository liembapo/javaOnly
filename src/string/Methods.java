package string;

import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a message ");
        String word = input.nextLine();

        if(word.isEmpty()){
            System.out.println("Messege is empty");}
        else if (word.length()>=10) {
            System.out.println("Messege is good");
        }
        else {
            System.out.println("Messege is too short");}
    }
}
