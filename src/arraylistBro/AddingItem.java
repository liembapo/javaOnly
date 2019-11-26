package arraylistBro;

import classAndObject.constructor.Item;

public class AddingItem {
    public static void main(String[] args) {
            Store shell = new Store("myStore","6620 west belmont");
            Item item1 = new Item("cigar", 15.00);
            Item item2 = new Item("cigarete", 20.0);
            Item item3 = new Item("gum",1.0);
            shell.addItem(item1);
        shell.addItem(item2);
        shell.addItem(item3);


        shell.seeInventory();
        System.out.println("\n" +shell.numOfItem);

    }
}
