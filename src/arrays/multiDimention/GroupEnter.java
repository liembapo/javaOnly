package arrays.multiDimention;

import java.util.Arrays;
import java.util.Scanner;

public class GroupEnter {
    public static void main(String[] args) {

        Scanner scan = new Scanner((System.in));
        System.out.print("please enter how many group : ");
        int a = scan.nextInt();
        scan.nextLine();
        String [][] class1 = new String[a][];
        for(int i = 0 ; i<a ;i++ ){
            System.out.print("please enter how many student each group " + (i+1) + " : ");
            int b = scan.nextInt();
            scan.nextLine();
            String [] group = new String [b];
            for(int j=0;j<b;j++){
                System.out.print("enter student "+(j+1)+ " : ");
                group[j] = scan.nextLine();
            }
            class1[i] = group;
        }
        System.out.println(Arrays.deepToString(class1));
    }

}
