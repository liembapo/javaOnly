//Task 1
//        Write a program to print Fibonacci series of n terms where n is input by user : 0 1 1 2 3 5 8 13 24 .....
//
//        Example:
//        Input:
//        6
//        Output:
//        0 1 1 2 3 5
package importantTask;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int x = input.nextInt();
        int f2 = 0;
        int f1 = 1;
        int fn = 1;
        if(x==1){
            System.out.println(f2);
        }else {
        System.out.print(f2 +  " " + fn + " ");
        for (int i =2;i < x ; i++) {
            fn = f1 + f2;
            f2 = f1;
            f1 = fn;
            System.out.print(fn + " ");
        }
        }
    }
}
