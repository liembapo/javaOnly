package loops;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        String matchPass = "secret478";
        for (int a = 0;;a++) {

            if (a == 3){
                System.out.println("try again after 5 hours");
                break;
            }
            System.out.print("Please enter your password : ");
            String userInput = input.nextLine();


            if (userInput.equals(matchPass)) {
                System.out.println("welcome to profile");
                break;
            }else {
                System.out.println("wrong password");

            }

            }


    }
}