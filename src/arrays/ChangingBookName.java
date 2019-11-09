package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ChangingBookName {
    public static void main(String[] args) {
      String [] book = {"Harry Potter", "Cinderella", "Anabelle","Aladin","Lord of the rings"};
        int a = 0;
        Scanner input = new Scanner(System.in);
        do{System.out.print("please enter name of the book you're looking for : ");
            String bookName = input.nextLine();
            Arrays.sort(book);
             a = Arrays.binarySearch(book, bookName);

            if (a>=0){
                System.out.print("which book you'd like to change : ");
                bookName = input.nextLine();

                book[a]=bookName;
                System.out.println(Arrays.toString(book));
            }else {
                System.out.println("book doesnt exist");
            }
        }while (a<0);

    }
}
