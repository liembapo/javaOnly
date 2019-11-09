package ifElseStatement;

import java.util.Scanner;

public class Yayaya {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double radius,lenght ;
        System.out.print("pls put the radius = ");
        radius = input.nextDouble();

        double pi = 3.14;
        System.out.println("the area is = "+ (radius*radius*pi)+ "meterSquare");

        System.out.println("put the lenght =  ");
        lenght = input.nextDouble();
        System.out.println("the volume is = " + (radius*radius*pi)*lenght+ "meterCubic");




    }
}
