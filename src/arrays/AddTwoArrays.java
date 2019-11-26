//0.7) Given you have two arrays with values of:
//        3,2,6,43,7,20      and
//        2,7,-10,10,-5,2
//        Write a program that adds each element and stores them into a new array. Print the final array
package arrays;

import java.util.Arrays;

public class AddTwoArrays {
    public static void main(String[] args) {

//        int[] arrayOne = {3, 2, 6, 43, 7, 20};
        int[] arr = {-9, 7, -10, 10, -5, 2,9,1,800};

        int temp;
        for (int i = 0; i <= arr.length - 1; i++) {
            for (int j = 1; j <= arr.length - 1; j++) {
                if (arr[j] < arr[j - 1]) {
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }

            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
