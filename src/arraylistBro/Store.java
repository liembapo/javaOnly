package arraylistBro;

import classAndObject.constructor.Item;

import java.util.ArrayList;
import java.util.Scanner;

public class Store {
    String name ;
    String address;
    ArrayList<Item> itemss = new ArrayList<>() ;
    int numOfItem ;

    public Store(String nam,String addr){
        name = nam;
        address = addr;
    }

    public  void addItem(){
        Scanner in = new Scanner(System.in);
        System.out.print("please enter amount of item ");
        int a = in.nextInt();
        in.nextLine();
        for(int i = 0;i<a ;i++){

        }
    }

    public void addItem(Item itemssssss){
        numOfItem++;
        itemss.add(itemssssss);
    }


    public void seeInventory(){

        for( int i = 0;i<itemss.size();i++){
            System.out.println("\nItem no " + (i +1));
            itemss.get(i).printItem();
            /* or with for each loop
            for(Item item : itemss){
            itemss.printItem();
             */
        }
    }
}
