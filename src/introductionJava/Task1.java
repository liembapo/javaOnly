package introductionJava;

import java.util.Scanner;

public class Task1 {
    public static void main(String s[]) {
        Scanner input = new Scanner(System.in);
        System.out.println(" put ur number  0 to 1000 : ");
        int a = input.nextInt();

        int last1 = a%10;
        int remain = a/10;
        int last2 = remain%10;
        remain = last2/10;
        int last3 = remain%10;
        int last4  = a/1000;


        System.out.println("total all digit is "+ (last1 + last2+last3+ last4) );









    }
}
