//Accept a String and print only unique characters in the String:
//
//        Input:
//        java
//        Output:
//        jav
//
//        Input:
//        aabcddee
//        Output:
//        abcde
package loops;

import java.util.Scanner;

public class Cubic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word = input.nextLine();

        String name = " ";
        String helper = " ";
        for(int i = 0 ; i<word.length();i++){
            helper = word.substring(i,i+1);
            if (!name.contains(helper)) {
                name += helper;
            }
        }
        System.out.println(name);

    }
}
