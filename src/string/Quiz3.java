package string;

import java.util.Scanner;
class Quiz3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //==============================================
        // Task 1
        int price = 0;
        int quarter = 0;
        int dime = 0;
        int nickle = 0;
        System.out.println("Enter price in cents:");
        price = input.nextInt();
        // your code here. (DO NOT change existing code)
        //----------------------------------------------
        int change = 100 - price;
        quarter = change / 25;
        dime = (change % 25) / 10;
        nickle = (change - (quarter * 25) - (dime * 10)) / 5;
        if (price >= 25 && price <= 100 && (price % 5 == 0)) {
            System.out.println("your change is " + change);
            System.out.println("Your change is " + quarter + " quaters, " + dime + " dimes, and " + nickle + " nickels");
        } else {
            System.out.println("Wrong price");
        }
    }
}
