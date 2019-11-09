//2) [IQ] Palindrome: A word that is the same read forwards and backwards. User takes a word from the console.
// Print true if the word is a palindrome. Print false if the word is not palindrome.
//        > input: civiv
//        > output: true
package importantTask;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
//        public static void main(String[] args) {
            Scanner input =  new Scanner(System.in);
        System.out.print("Please enter the word : ");
            String word = input.nextLine();
            String back = "";
            for(int i = word.length()-1; i >= 0; i--) {
                back += word.charAt(i);
            }
            System.out.println(word);
            System.out.println(back);
            if(word.equals(back)) {
                System.out.println("Palindrome");
            } else {
                System.out.println("Not Palindrome");
            }
        }
    }



