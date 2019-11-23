package arrays.multiDimention;

import classAndObject.constructor.Book;

import java.util.Scanner;

public class UsingTheBookClass {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("how many are the books? ");
        int numOfbook = in.nextInt();
        in.nextLine();

        Book[] allBooks = new Book[numOfbook];
        for( int i = 0 ; i< allBooks.length ; i++){
            System.out.println("please enter the title , author and the pages of book no "+(i+1));
            allBooks[i] = new Book(in.nextLine(),in.nextLine(),in.nextInt());
            in.nextLine();
        }

        for( Book book : allBooks){
            book.info();
        }

    }
}
