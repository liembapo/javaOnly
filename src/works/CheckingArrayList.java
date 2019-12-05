package works;

import classAndObject.constructor.Item;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class CheckingArrayList {

    public static void main(String[] args) {
        ArrayList<String> word = new ArrayList<>();
//        String [] v = {"kka","oke","kkas"};
//        String [] x = {"adsd","asdas","jadshfj"};
//
//        Item kl = new Item("lala",90);
//        Item lk = new Item("ahaha",82);
//
//        word.add(kl);
//        word.add(lk);
//        System.out.println();
//
//        ArrayList <Item > bob = new ArrayList<>(word);
//
//        System.out.println(bob.size());
        String a = "bobby";
        String b = "bob";

        word.add(a);
        word.add(b);

        System.out.println(word.get(1));
    }
}
