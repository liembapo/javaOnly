package ifElseStatement;
import java.sql.SQLOutput;
import java.util.Scanner;
public class Tokemon {
    public static void main(String[] args) {

        Scanner input = new Scanner((System.in));
        System.out.print("input number = ");
        int num1 = input.nextInt();
        System.out.print("input number 2 = ");
        int num2 = input.nextInt();
        int result =0;
        input.nextLine();
        System.out.print("put operator = ");
        String o = input.nextLine();
        boolean valid = true;


        switch (o) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                result = num1 / num2;
                break;
            case "%":
                result = num1 % num2;
                break;
            default:
                valid = false;
        }
        if(valid) {
            System.out.println(num1 + o +  num2 + "= " + result);
        }
        else {System.out.println("Invalid operator");}
    }
}









