//3) Write a program that asks the user to enter a word. Print out how many
// times a character is in the given word.
//        > input: apple
//        > output:
//        apple has 1 a
//        apple has 2 p
//        apple has 1 l
//        apple has 1 e
package importantTask;

import java.util.Arrays;
import java.util.Scanner;

public class Apple {
    public static void main(String[] args) {
    int [] arr = {1,9,19,99,999};
        System.out.println(Arrays.toString(deleteR(arr,19)));
    }
    public static int[] deleteR(int[] arr,int element) {
        int [] nu=new int [arr.length-1];
        int a=0 ;
        for (int i = 0;i<arr.length;i++){
            if(arr[i] == element){
                a=i;
            }
        }

        for (int i = 0;i<a;i++){
            nu[i]=arr[i];
        }

        for(int i = a+1 ; i<arr.length;i++){
            nu[i-1]=arr[i];
        }
        return nu;
    }
}
