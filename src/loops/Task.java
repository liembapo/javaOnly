//3) Ask user to enter their number (Take it as a String). A number can only be valid if it is
//        10 characters long or is 12 characters with the “(“ and “)” characters in the 1st or 5th characters.
//        Then make sure the number provided contains only numbers and not any other characters.
//        If the number meets the length requirements and has all valid characters print “Valid phone number”
//        If the length requirement is not met or the number contains invalid characters then print
//        “Invalid phone number”

package loops;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter your phone number : ");
        String phoneNum = input.nextLine();
        boolean validLength = false;

        if (phoneNum.length()==10 ){
        validLength = true;
        }else if (phoneNum.length()==12){
            if( phoneNum.charAt(0)=='(' && phoneNum.charAt(4)==')'){
                phoneNum = phoneNum.replace("(","").replace(")","");
                validLength = true;
            }

        }
        int count = 0;
        if (validLength){
            for (int i =0 ; i <=9;i++){
                char check = phoneNum.charAt(i);
                if(check >='0' && check <='9' ){
                    count++;
                }

            }if (count == phoneNum.length()){
                System.out.println("valid phone number");
            }else {
                System.out.println("invalid phone number");
            }


        }else {
            System.out.println("invalid phone number");
        }

    }
}
