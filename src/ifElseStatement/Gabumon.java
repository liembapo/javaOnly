package ifElseStatement;

import java.util.Scanner;

public class Gabumon {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("PLEASE PUT YOUR USERNAME AND PASSWORD ");

        System.out.print("Username : ");
        String userName = input.nextLine();

        System.out.print("Password : ");
        int password = input.nextInt();

        String matchUserName = "bobby81";
        int matchPassword = 12345 ;

        if (userName.equals(matchUserName)){

            if (password==matchPassword) {
                System.out.println("Login successfull ");
            }
            else {
                System.out.println("Password doesnt match");
            }
        }

        else {
            System.out.println("Username and password doesnt match");}

    }
}
