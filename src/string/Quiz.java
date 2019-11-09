package string;

import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please input your username :");
        String userInput = input.nextLine();
        System.out.println("Your username : "+ userInput);
//        System.out.print("Please input your  : ");
//        String userPass = input.nextLine();
//        System.out.println("Your password :"+ userPass);

        String username = "test";
        String password = "test123";

        if (userInput.equals(username)) {
            System.out.print("Please input your  password : ");
            String userPass = input.nextLine();

             if (userPass.equals(password)) {
                System.out.println("Welcome");
             }else {
                 System.out.println("Invalid password");}

        }else {
            System.out.println("Invalid username");}

    }
}
