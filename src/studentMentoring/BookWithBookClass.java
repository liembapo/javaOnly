package studentMentoring;

import works.B;

import java.util.Arrays;

public class BookWithBookClass {
    public static void main(String[] args) {

        Book [] newBooks = new Book[3];
        newBooks[0] = new Book("Harry Potter", "J.K.Rowling", 210);
        newBooks[1] = new Book("Lord Of The Ring" , "J.R.R.Tolkien",300);
        newBooks[2] = new Book("The Hunger Games", "Suzzane Collins",450);

//        System.out.println(Arrays.toString(newBooks));
        int i = 0;
        for (Book book : newBooks){
            i++;
            System.out.println("Book # " + (i));
            System.out.println("Name of Book is " +book.name );
            System.out.println(("Author of book is "+ book.author));
            System.out.println(("Pages of book are " + book.pages + " pages"));
        }
    }
}
