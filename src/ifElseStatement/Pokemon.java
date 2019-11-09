package ifElseStatement;

import java.util.Scanner;

public class Pokemon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int passCode = input.nextInt();
        int userCode = 3241;
        if ( passCode < 0){
            System.out.println("Please no negative number");}
        else if (passCode > 9999 ){
            System.out.println("not more than 4 digit ");
        }
        else if (passCode < 1000){
            System.out.println("please put more digit");
        }
        else if (passCode== userCode) {
            System.out.println("welcome to iPhone");
        }
        else {
            System.out.println("Who the F are you?");
        }
    }
}
