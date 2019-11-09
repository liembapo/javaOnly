//Create a method that accepts String and int.
//        Check if string length is same as given integer.
//        Print "Equal" if they are equal. Print "Not equal" if string length and given integer are not equal.
package methods;

import works.A;

import java.util.Arrays;

public class ExampleMethods {
    public static void main(String[] args) {
        int [] numbers = {1,-2,-3,-4,5,7,8};
        String numberssss = "123456";
//        negativePrintOut(numbers);
////        replaceNegative(numbers,9);
        intToArrays(numbers);
//        equalString("bobby",5);
        addOneFromString(numberssss,100);
        hoursBoolean(11,34,true);

    }
    public static void equalString(String word, int num){
        if (word.length() == num){
            System.out.println("equal");
        }else {
            System.out.println("not equal");
        }
    }
    public static void negativePrintOut(int[] num){

        for(int arr : num){
            if (arr<0){
                System.out.println(arr);
            }
        }

    }
    public static void replaceNegative(int[] num,int given) {

        for (int i=0 ; i <num.length;i++) {
            if (num[i] < 0) {
                num[i] = given;
            }
        }
        System.out.println(Arrays.toString(num));
    }

    public static void intToArrays(int[] arr){
        String format = "";
        for(int array : arr ){
            format += array + ", ";
            }

        format = format.substring(0,format.length()-2);
        System.out.println("[" + format + "]");
        }
//  {1,2,3,4,5,6}
        public static void addOneFromString(String word , int plus){
            String [] number = word.trim().split("");
            int [] value = new int [number.length];
            for(int i = 0 ; i<number.length;i++){
                value[i] = Integer.valueOf(number[i]);
                value[i] = value[i]+plus;
        }
            System.out.println(Arrays.toString(value));
        }

/* Write a method that will take three arguments: the hour, the minutes, and a boolean ( AM will be true, PM will be false) Use the given information to print out the time in this format:
Hours : minutes amOrPM
— Hours should be in the range 1-12, minutes should be in the range from 1 to 59.
 If either of those information provided is not valid, do not continue your program,
 just print “Invalid time information given
input: 4, 39, true
Output: 4 : 39 AM*/

    public static void hoursBoolean(int hour,int min,boolean amOrPm){
        if(hour<12 && hour>=0 && min>0 && min <60 &&  amOrPm == true){
            System.out.println(hour + " : " + min + "  AM");
        }else if (hour<12 && hour>=0 && min>0 && min <60&&  amOrPm == true){
            System.out.println(hour + " : " + min + "  PM");
        }else {
            System.out.println("invalid time");
        }
    }
}
