package loops;

import java.util.Scanner;

public class SquareWithWhileLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner((System.in));
        int a = input.nextInt();
        int i = 0,j=0;
        while(i>=0 && i<=a){
            i++;
            while (j>=0 && j<=a){
                j++;
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
