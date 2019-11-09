//Ask user to enter a word. If the work contains starts with x, print the word without x.
//
//
//        Input:
//        xcode
//
//        Output:
//        code
package ifElseStatement;

import java.util.Scanner;

public class Method {
        public static void main(String[] args) {
                Scanner input = new Scanner(System.in);
                String word = input.nextLine();

                if(word.startsWith("x")){
                        word = word.substring(1);
                        System.out.println(word);
                }else{
                        System.out.println(word);}

        }
}
