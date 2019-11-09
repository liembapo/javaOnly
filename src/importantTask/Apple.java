//3) Write a program that asks the user to enter a word. Print out how many
// times a character is in the given word.
//        > input: apple
//        > output:
//        apple has 1 a
//        apple has 2 p
//        apple has 1 l
//        apple has 1 e
package importantTask;

import java.util.Scanner;

public class Apple {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("please enter the word  : ");
        String word = input.nextLine();
        String checked= " ";
        for (int i = 0; i < word.length(); i++) {
            char b = word.charAt(i);

            int count = 0;
            if(!checked.contains(b + "")) {
                for (int j = 0; j < word.length(); j++) {
                    if (b == word.charAt(j)) {
                        count++;
                    }
                }
                checked += word.charAt(i) + " ";
//                System.out.println(checked);
                System.out.println("the " + b + " coming for " + count + " times");
            }
        }
    }
}
