package ifElseStatement;

import java.util.*;

public class Togemon {
    public static void main(String[] args) {
//
//        Random random = new Random();
//
//        int randomNum = random.nextInt(26);
//        randomNum +=  65;
//
//        char letter = (char)(randomNum);
//
//        System.out.println("your number is "+randomNum);
//        System.out.println("Your letter is " + letter);






        Scanner input = new Scanner(System.in);
        System.out.print("Put your age  please = ");
        int age = input.nextInt();


        if (age>=30) {
            System.out.println("Welcome to the building");}
        else if (age<=0 || age >100){
            System.out.println("Not valid age ");}
        else {
            System.out.println("Try again when you are 30");



        }

    }
}
