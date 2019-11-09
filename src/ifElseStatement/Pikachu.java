package ifElseStatement;

import java.util.Scanner;

public class Pikachu {
    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
        System.out.println("enter 3 integers number ");

    int a = input.nextInt();
    int b =input.nextInt();
    int c = input.nextInt();


    if (a>b && a>c ){
        System.out.println(a+" is the max");}
    else if (b>c && b>c){
        System.out.println(b+ " is the max");
    }
    else {
        System.out.println(c+" is the max ");
    }


    if (a== b && a==c){
        System.out.println("all number is equal");
    }
    else if (a==b){
        System.out.println(" first number is same amount with second number");
    }
    else if (a==c){
        System.out.println(" first number is same amount with third number");
    }
    else if (b==c){
        System.out.println(" second number is same amount with third number");
    }
        else {
            System.out.println("no number having same amount");}
    }
}
