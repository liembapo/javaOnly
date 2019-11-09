package importantTask;

import java.util.Scanner;

public class TreeDynamic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("how big is your tree =  ");
        int x = input.nextInt();

        for (int i=0;i<x;i++){
            for(int j = 0 ; j <x-i; j++)
                System.out.print(" ");
            for(int k = 0; k<(2*i+1);k++)
                    System.out.print("8");
            System.out.println();
        }
    }
}
