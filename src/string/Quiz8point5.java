//User enters a sentence like this:
//        > “I am x years old”
//        We want to take their age and change it. Add 5 to their age and print: “In 5 years you will be: newAge years old”
//        > input: “I am 20 years old”
//        > output: In 5 years you will be 25 years old

        package string;

import java.util.Scanner;

public class Quiz8point5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("please put your age : ");
        String word = input.nextLine();

        int a = word.indexOf(" years old");

        word = word.substring(a-2,a);

        int num = Integer.valueOf(word);

        System.out.println("In 5 years you will be " + (num+5)+ " years old");

    }
}
