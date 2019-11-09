package string;

import java.util.Scanner;

public class Quiz7 {
    public static void main(String[] args) {

        Scanner input= new Scanner((System.in));

        System.out.println(" Please enter your messege to send : ");
        String messege = input.nextLine();

        String a = " " ;


        if (messege.contains("idiot")||messege.contains("dumb")||messege.contains("stupid")){
            System.out.println("your messege was change");
            a = messege.replace("idiot", "smart").replace("dumb", "smart").replace("stupid", "smart");
        }else {
            System.out.println("your messege was not change");}

        System.out.println(a);

//        if (messege.contains())


        System.out.println("Original Messege is : " + messege);
    }
}
