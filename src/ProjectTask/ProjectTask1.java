//Task 1
//        Write a program that determines the change to be dispensed from a vending
//        machine. An item in the machine can cost between 25 cents and 1 dollar, in 5-cent
//        increments (25, 30, 35, . . . , 90, 95, or 100), and the machine accepts only a single
//        dollar bill to pay for the item.
//
//        See the example output as shown below:
//        Input:
//        Enter price in cents: 95↵
//
package projectTask;

import java.util.Scanner;

public class ProjectTask1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int price=0;
        int quarter=0;
        int dime = 0;
        int nickle=0;
        System.out.print("Enter price in cents:");
        price = input.nextInt();
        System.out.println("\n");
        int dollarInserted = 100; // this is one dollar inserted by someone and converted to cent $1 = 100 cents
        int change = 100-price;
        System.out.println("change is "+ change + " cents,will convert to ");

        quarter = change/25;
        dime    = (change%25)/10;
        nickle  = (change%25%10)/5;

        if ((price >= 25 && price <= 100) && (price % 5 == 0)){
            System.out.println("Your change is " + quarter + " quaters, " + dime + " dimes, and " + nickle + " nickels");
        }else {
            System.out.println("Wrong price");}
    }
}
