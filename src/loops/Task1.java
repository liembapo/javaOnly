package loops;

import java.util.*;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        for (String matchPass = "secret478";true;){
//            System.out.print("Please enter your password : ");
//            String userInput = input.nextLine();
//            if (userInput.equals(matchPass)){
//                System.out.println("welcome to profile");
//                break;
//            }else {
//                System.out.println("wrong password");}
//        }
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        int [] nums = { 1,2,3,4,5,6,7,};
        int songNum;


        for(;;){
            songNum = random.nextInt(nums.length);
            System.out.println("playing song number " + (songNum+1));
        }
//        System.out.println(Arrays.toString(nums));
    }
}
