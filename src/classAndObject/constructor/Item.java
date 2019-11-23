package arrays.multiDimention;

import java.util.Scanner;

public class Item {

    String nameOf ;
    double price;

    public Item(String na , double pri){
        nameOf = na;
        price = pri;
    }

    public void printItem(){
        System.out.println("Name is " + nameOf);
        System.out.println("Price is " + price);
    }
}
