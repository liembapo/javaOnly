package introductionJava;

import java.util.*;

public class BobbyYea {
    public static void main(String[] args) {

//        Scanner input = new Scanner(System.in);
//         int age1 =input.nextInt();
//         int age2 = input.nextInt();
//         int age3 = input.nextInt();
//
//         int sum = age1 + age2 + age3 ;
//         int avg = sum/3;
//
//        System.out.println(avg);

        Scanner input = new Scanner(System.in);
        int apple ;
        int mApp = 30*45 ;
        int fApp = 70*85 ;
        int sApp = mApp + fApp;
        System.out.print( "put 5 digit of apple = ");
        apple = input.nextInt();

        System.out.println("apple for staff is "+  (apple - sApp));




    }
}
