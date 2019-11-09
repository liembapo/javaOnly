//Ask user to enter a new password. If the password does not match any of the
// requirements below, print a message based on what requirement it is breaking.
// If it does not break any requirement, print ‘Password accepted’.
//        Password requirements:
//
//        Be a minimum of eight (8) characters in length
//
//        Contain at least one uppercase letter (A-Z)
//
//        Contain at least one lowercase letter (a-z)
//
//        Contain at least one digit (0-1-2-3-4-5-6-7-8-9)
//
//        Contain at least one special character (~`!@#$%^&*()+=_-{}[]\|:;”’?/<>,.)
//Input:
//oxidex
//Output:
//Password should contain minimum 8 characters
//
//Input:
//abcdefghi
//Output:
//Password should contain at least 1 uppercase number
//
//Input:
//ABCDEFGHI
//Output:
//Password should contain at least 1 lowercase number
//
//Input:
//Abcdefghi
//Output:
//Password should contain at least 1 digit
//
//Input:
//Abcdefghi1
//Output:
//Password should contain at least 1 of these special characters: ~`!@#$%^&*()+=_-{}[]\|:;”’?/<>,.
//
//        Input:
//        Abcdefghi1$
//        Output:
//        Your password is accepted
        package works;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("please enter the password : ");
        String n1 = input.nextLine();

        int upperCounter = 0;
        int lowerCounter =0;
        int specialCounter= 0;
        int digitCounter = 0;       // aaaaccc55%$

        if(n1.length()>=8){
            char a = '0';
            for(int i = 0 ; i <n1.length();i++){
                a = n1.charAt(i);
                if (a>='A' && a<= 'Z' ){
                    upperCounter++;
                }
                if (a>='a' && a<= 'z' ){
                    lowerCounter++;
                }
                if (a>='!' && a<= '.' ){
                    specialCounter++;
                }
                if (a>='0' && a<= '9' ){
                    digitCounter++;
                }

            }
            if(upperCounter==0){
                System.out.println("Password should contain at least 1 uppercase number ");
            }else if (lowerCounter==0) {
                System.out.println("Password should contain at least 1 lowercase number  ");
            }else if (specialCounter==0) {
                System.out.println(" Password should contain at least 1 of these special characters: ~`!@#$%^&*()+=_-{}[]:;”’?/<>,. ");
            }else if (digitCounter==0) {
                System.out.println("Password should contain at least 1 digit ");
            }else {
                System.out.println("password accepted");
            }


        }else {
            System.out.println("Password should contain minimum 8 characters ");
        }



    }
}