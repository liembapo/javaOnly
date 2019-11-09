//Task 2
//        Write a Java program CalculatePhoneBill to calculate the monthly telephone bills as per the following rule:
//        Ask user to enter number of calls.
//        Minimum $200 for up to 100 calls.
//        Plus $0.60 per call for next 50 calls.
//        Plus $0.50 per call for next 50 calls.
//        Plus $0.40 per call for any call beyond 200 calls.
//
//        Examples:
//        Enter number of calls: 88
//        Your bill is $200.0
//
//        Enter number of calls: 120
//        Your bill is $212.0
//
//        Enter number of calls: 185
//        Your bills is $247.5

package projectTask;

import java.util.Scanner;

public class ProjectTask2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numberOfCall;
        double bill =0.0;
        System.out.print("Enter number of calls:");
        numberOfCall = input.nextInt();
        double pricePerCall1 = 0.6;
        double pricePerCall2 = 0.5;
        double pricePerCall3 = 0.4;
        if(numberOfCall > 0 && numberOfCall <= 100){
        bill = 200;
        }else if ( numberOfCall > 100 && numberOfCall <= 150) {
        bill = 200 + pricePerCall1 * (numberOfCall - 100);
        } else if (numberOfCall >150 && numberOfCall <= 200) {
        bill = 200 + pricePerCall1 * 50 + pricePerCall2 * (numberOfCall - 150);
        } else if (numberOfCall >200) {
        bill = 200 + pricePerCall1 * 50 + pricePerCall2 * 50 + pricePerCall3 * (numberOfCall - 200);
        } else {
        System.out.println("Negative number of calls");
        }

        System.out.println("Your bill is $"+bill);

    }
}
