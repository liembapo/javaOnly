package classAndObject.constructor;

//im not importing the Item package,,because im on the same package.

import java.util.Scanner;

public class UsingTheItemClass {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("enter how many item you desire : ");
        int num = in.nextInt();
        in.nextLine();

        Item [] allItem = new Item[num] ;

        for (int i = 0; i < allItem.length ; i++) {
            System.out.print("please enter the item no " + (i+1) + " ");
            String nameOf = in.nextLine();
            System.out.print("Please enter the price ");
            double price = in.nextDouble();
            in.nextLine();
            allItem[i] = new Item(nameOf,price);

        }

        for(Item it : allItem){
            it.printItem();
        }

    }
}
