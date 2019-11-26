package introductionJava;

import java.util.Scanner;

public class Main {

    public static void main(String[] ar) {
        Scanner input = new Scanner(System.in);
        int a ;
        boolean c ;

        System.out.println( "pls put number between 0 to 101 : ");
        a = input.nextInt();
        c =  (0 < a) && (a < 101);
        System.out.println(c);

    }
}
