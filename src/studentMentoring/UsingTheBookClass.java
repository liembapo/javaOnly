package studentMentoring;

import classAndObject.constructor.Book;

import java.util.Scanner;

public class UsingTheBookClass {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("how many are the books? ");
        int numOfbook = in.nextInt();
        in.nextLine();

        Book [] allBooks = new Book[numOfbook];



        for( int i = 0 ; i< allBooks.length ; i++){
            System.out.println("please enter the title , author and the pages of book no "+(i+1));
//
            System.out.println("pls enter the name of book no " + (i+1));
            String name  = in.nextLine();
            System.out.println("please enter the author of book no "+ (i+1));
            String author = in.nextLine();
            System.out.println("please enter the pages of book no "+(i+1));
            int pages = in.nextInt();

            in.nextLine();

            allBooks[i] = new Book(name,author,pages);
        }

        for( Book book : allBooks){

            book.info();
        }

    }
}
