package string;

import java.util.Scanner;

public class Quiz8 {
    public static void main(String[] args) {
        Scanner input = new Scanner((System.in));
        System.out.print("please insert first name : ");
        String firstName = input.nextLine();
        System.out.print("please insert second name : ");
        String secondname = input.nextLine();

        int a = firstName.lastIndexOf(" ");
        int b = secondname.lastIndexOf(" ");

        String lastName1 = firstName.substring(a+1);
        String lastname2 = secondname.substring(b+1);

        System.out.println("the first last name  is " + lastName1);
        System.out.println("The second last name is " + lastname2);

        int compare = lastName1.compareTo(lastname2);

        if (compare<0 || compare>0){
            System.out.println("they are not brother");}
        else {
            System.out.println("they are brother");}


    }
}
