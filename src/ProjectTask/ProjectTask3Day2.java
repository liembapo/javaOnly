//Task 3
//        Write a program to prompt the user to enter the numbers till the user wants
//        (by asking user if he wants to continue) and at the end it should display the count of positive,
//        negative and zeros entered. (Hint: use do while loop)
//        Example:
//        Input:
//        Enter the number: 9
//        Do you want to continue y/n? y
//        Enter the number: -5
//        Do you want to continue y/n? y
//        Enter the number: 0
//        Do you want to continue y/n? y
//        Enter the number: 66
//        Do you want to continue y/n? n
//
//        Output:
//        Positive numbers: 2
//        Negative numbers: 1
//        Zero numbers:
package projectTask;

import java.util.Scanner;

public class ProjectTask3Day2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String answer = " ";
        int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;

        do {
            System.out.println("Enter your number");
            int num = input.nextInt();
            if (num > 0) {
                positiveCount++;
            } else if (num < 0) {
                negativeCount++;
            } else if (num == 0) {
                zeroCount++;
            }

            input.nextLine();

            System.out.print("Do you want to continue y/n : ");
            answer = input.nextLine();

            if (answer.equals("n")) {
                System.out.println("bye");

            }else if (!answer.equals("y")){
                System.out.println("invalid answer");
            }

        } while (answer.equals("y"));

        System.out.println("Positive number " +positiveCount + " times");
        System.out.println("negative number " +negativeCount + " times");
        System.out.println("zero number " +zeroCount + " times");
    }
}
