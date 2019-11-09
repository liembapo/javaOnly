//User is asked to enter an account number. You will check if these account numbers are valid.
//        > If the account number begins with a “2” the account number should be 7 characters long
//        > If the account number begins with a “5” the account number should be 10 characters long
//        —> If the account number does not begin with a 2 or a 5 OR the account number lengths,
//        do not meet the expected results print “ Invalid account number”

package string;

import java.util.Scanner;

public class Quiz11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your number : ");
        String numberAcc = input.nextLine();
        char firstNum = numberAcc.charAt(0);

        boolean condition1 = firstNum=='2'&& numberAcc.length()==7;
        boolean condition2 = firstNum == '5' && numberAcc.length()==10;
        boolean condition3 = firstNum == '2'|| firstNum=='5';
        String word = " ";
        boolean valid = true;
        if (condition3){
            if (condition1){word = "your number begining from 2 and has 7 digit";}
            else if (condition2){word = "your number begining from 5 and has 10 digits";}
            else{
                System.out.println("please put 7 digit or 10 digit number");}
        }else {
            valid= false;}

        if (valid){
            System.out.println(word);}
        else {System.out.println("Invalid account number");}
    }
}
