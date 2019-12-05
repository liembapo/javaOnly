package arraylistBro;

import java.util.ArrayList;

public class Speaker {
    public static void main(String[] args) {

//        ArrayList<String> name = new ArrayList<>();
//        name.add("jason");      //automatically drop this String on the last index; unless u use ready method.
//        name.add("bobby");
//        name.add(1,"john");
//        System.out.println(name);
//
        System.gc();
        ArrayList<Cat>catsForSale = new ArrayList<>();  // new arraylist and empty

        Cat cat1 = new Cat();
        cat1.color = "White";
        cat1.age = 3;
        catsForSale.add(cat1);

        Cat cat2 = new Cat();
        cat2.color = "Orange";
        cat2.age = 2;
        catsForSale.add(cat2);

        for(int i =0 ; i<catsForSale.size();i++){
            System.out.println("\ncolor of cat no "+ (i+1) + " is " + catsForSale.get(i).color);
            System.out.println(("the age of cat no "+ (i+1) + " is " + catsForSale.get(i).age + " years old" ));

        }
    }
}
