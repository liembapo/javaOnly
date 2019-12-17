package classAndObject.constructor;

import java.util.ArrayList;

public class Sky {
    public static void main(String[] args) {


    Book buk = new Book();
    Book bu = new Book(67,"lala","lalaaa",20);

    ArrayList<Book> no = new ArrayList<>();
    no.add(buk);
    no.add(bu);
    no.remove(0);
        System.out.println(Integer.toHexString(System.identityHashCode(bu)));

        System.out.println(no.get(0));

}}
