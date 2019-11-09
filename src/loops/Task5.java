package loops;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("Enter number shud be more than 0: ");
        int num = input.nextInt();
        int a = 0;



        while (a<num){
            a++;
            System.out.println(a);
        }

    }
}
