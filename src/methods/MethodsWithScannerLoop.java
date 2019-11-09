package methods;

import java.util.Scanner;

public class MethodsWithScannerLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String wordFirst ;
        String wordSecond ;
        do {
            System.out.print("enter first word : ");
            wordFirst = input.nextLine();
            System.out.print("enter second word : ");
            wordSecond = input.nextLine();
            containString(wordFirst, wordSecond);

        } while (!wordFirst.contains(wordSecond));
    }


    /*Write a method that takes two Strings. Check if the second String is found inside of the first String.
  If it does, remove that part from the String, but if the second String is not in the first
  String ask the user to enter another String to try again.*/

     public static void containString(String wordOne,String wordTwo ){
         if (wordOne.contains(wordTwo)){
             int a = wordOne.indexOf(wordTwo);
             wordOne= wordOne.substring(0,a)+ wordOne.substring(a+2);

             System.out.println(wordOne);
         }


    }
}
