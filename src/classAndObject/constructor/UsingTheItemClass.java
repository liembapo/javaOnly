package arrays.multiDimention;

import classAndObject.constructor.Item;

import java.util.Scanner;

public class UsingTheItemClass {
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        System.out.print("enter how many item you desire : ");
        int num = in.nextInt();
        in.nextLine();
        Item[] itemZZ = new Item[num] ;

        for (int i = 0; i < itemZZ.length ; i++) {
            System.out.print("please enter the item no " + (i+1) + " ");
            String nameOf = in.nextLine();
            System.out.print("Please enter the price ");
            double price = in.nextDouble();
            in.nextLine();
            itemZZ[i] = new Item(nameOf,price);

        }

        for(Item it : itemZZ){
            it.printItem();
        }

    }
}
