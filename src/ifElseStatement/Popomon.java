package ifElseStatement;

import java.util.Scanner;

public class Popomon {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        float a = input.nextFloat();

        if (8.00 <= a && a<= 23.00) {
            System.out.println("Class is OPEN ");
        }
        else if(0>a && a < 8)  {
            System.out.println( " Class is CLOSED");
        }
        else if (23 > a && a < 24){
            System.out.println("Class is CLOSED");
        }
         else {System.out.println("Invalid hour entered") ;}

    }
}
