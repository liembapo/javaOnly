package enumeration;

import works.A;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class UsingDaysEnum  {
    public static void explanation(Days day){
//        switch (day){
//            case MONDAY:
//                System.out.println("Mondays are bad");
//                break;
//            case FRIDAY:
//                System.out.println("Fridays are great");break;
//            case SATURDAY:case SUNDAY:
//                System.out.println("Weekends are great");break;
//            default:
//                System.out.println("Regular day");

        }

    public static void countWord(){
        Scanner scan = new Scanner(System.in);
        System.out.print("please input the sentence : ");
        String string = scan.nextLine();

        String [] word = string.split(" ");
        System.out.println("it has " + word.length + " words");
        System.out.println(Arrays.toString(word));
    }

    public static void main(String[] args) {

//        Scanner scan = new Scanner(System.in);
//        String a = scan.nextLine();
//
//        Days day = Days.valueOf(a);
//        explanation(day);


        countWord();
    }
}
