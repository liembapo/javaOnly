package loops;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        for (String matchPass = "secret478";true;){
            System.out.print("Please enter your password : ");
            String userInput = input.nextLine();
            if (userInput.equals(matchPass)){
                System.out.println("welcome to profile");
                break;
            }else {
                System.out.println("wrong password");}
            continue;

        }

    }
}
