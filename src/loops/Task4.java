package loops;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please insert the word = ");
        String word = input.nextLine();
        String rev = " ";

        for (int a= word.length()-1;a>=0;a--){

//            rev = word.charAt(a)+"";      (gonna print vertically 1 by 1)
//            System.out.println(rev);
            rev += word.charAt(a);


        }System.out.println(rev);
    }
}
