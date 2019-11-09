package string;

import java.util.Scanner;

public class Quiz5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("please put your first word :");
        String name1 = input.nextLine();
        System.out.print("please put your second word : ");
        String name2 = input.nextLine();

        int a = name1.compareTo(name2);

        if (a > 0){
            System.out.println(name2 + " is coming first");
        }else if ( a == 0){
            System.out.println("both name are same");}
        else {
            System.out.println(name1 + " is coming first");}
    }
}
