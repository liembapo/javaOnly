package studentMentoring;

import java.util.Arrays;

public class BookWithTwoD {
    public static void main(String[] args) {
        String  [][] newBooks = new String [3][3];
        String [] HP = {"Harry Potter", "J.K.Rowling", "210"};
        String [] LOR = {"Lord Of The Ring" , "J.R.R.Tolkien","300"};
        String [] THG = {"The Hunger Games", "Suzzane Collins","450"};

        newBooks[0] = HP;
        newBooks[1] = LOR;
        newBooks[2]  = THG;

        System.out.println(Arrays.toString(newBooks));
        System.out.println();

        for (int i = 0; i < newBooks.length; i++) {

            System.out.println("\nBook # \t" + (i+1));
            System.out.println("Name of Book is \t" + "\" " +newBooks[i][0] +" \" ");
            System.out.println(("Author of book is \t"+ newBooks[i][1]));
            System.out.println(("Pages of book are \t" + newBooks[i][2] + " pages"));
}
    }
}
