//Task 2
//        Given two strings of lowercase English letters, word1  and word2, perform the following operations:
//        Sum the lengths of word1 and word2 and print
//        Capitalize the first letter in word1 and word2 and print them on a single line, separated by a space.
//        Sample Input:
//        hello world
//
//        Sample Output:
//        10
//        Hello World
//
//
//        Sample Input:
//        java cool
//
//        Sample Output:
//        8
//        Java Cool
package projectTask;

import java.util.Scanner;

public class ProjectTask4 {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.print("Please enter 2 words : ");
        String word = input.nextLine();

        int a = word.indexOf(" ");
        String word1 = word.substring(0,a);
        String word2 = word.substring(a+1).trim();

        int wordCombine = (word1+word2).length();

        System.out.println(wordCombine);

        String wordNew1= word1.substring(0,1).toUpperCase() + word1.substring(1);

        String wordNew2=word2.substring(0,1).toUpperCase() + word2.substring(1) ;



        System.out.println( wordNew1 + " " + wordNew2);


    }
}
