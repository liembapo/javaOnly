package ifElseStatement;

import java.util.Scanner;

public class Wild{
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int digit3,digit2,digit1;

        digit3 = a%10;
        int remain = a/10;
        digit2=remain%10;
        digit1=a/100;

        System.out.println("total all digit is "+ (digit3+digit2+digit1));









    }

}