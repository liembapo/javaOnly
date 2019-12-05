package studentMentoring;

import java.util.ArrayList;
import java.util.Arrays;

public class BookWithArrayList {
    public static void main(String[] args) {

        ArrayList <Book> newBooks = new ArrayList<>();

        newBooks.add(new Book("Harry Potter", "J.K.Rowling", 210));
        newBooks.add(new Book("Lord Of The Ring" , "J.R.R.Tolkien",300));
        newBooks.add(new Book("The Hunger Games", "Suzzane Collins",450));

        System.out.println(Arrays.toString(newBooks.toArray()));

        for (int i = 0; i < newBooks.size() ; i++) {
            System.out.println("\nBook # " + (i+1));
            System.out.println("Name of Book is " +newBooks.get(i).name);
            System.out.println(("Author of book is "+ newBooks.get(i).author));
            System.out.println(("Pages of book are " + newBooks.get(i).pages + " pages"));
        }
    }
}
