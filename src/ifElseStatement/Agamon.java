package ifElseStatement;

import java.util.Scanner;

public class Agamon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("simple calculator");
        System.out.print("please put a  Double value =");
        double a = input.nextDouble();
        System.out.print("please put b Double value = ");
        double c = input.nextDouble();
        input.nextLine();

        System.out.print("please choose  nassim (-,+,* or /) = ");
        String nassim = input.nextLine();

        System.out.println( a + " " + nassim + " "+ c  + "=");

        if (nassim.equals("+"))  {
            System.out.println( "result is " + (a+c));
        }


        else if (nassim.equals("-")){
            System.out.println( "result is " + (a-c));
        }


        else if (nassim.equals("*")){
            System.out.println( "result is " + (a*c));
        }


        else if (nassim.equals("/" )){
            System.out.println( "result is " + (a/c));
        }

        else {
            System.out.println("Operator not found");
        }
    }
}


