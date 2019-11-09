package ifElseStatement;

import java.sql.SQLOutput;
import java.util.Scanner;

public class UtiilSiKutil {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);



        int age , age2 ;
        double hasil ;

        System.out.print("put number:" );
        age = input.nextInt();


        System.out.print("and square:");
        age2 = input.nextInt();

        hasil = Math.pow(age, age2);
        System.out.println(hasil);


        double inch ;
//        double hasil ;

        System.out.print("put inch: ");
        inch = input.nextDouble();

        System.out.println("in meter is : " + inch * 0.0254 + " meter" );





    }

}
