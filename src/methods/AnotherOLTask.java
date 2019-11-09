package methods;

import java.util.Arrays;

public class AnotherOLTask {
    public static void main(String[] args) {
        int[] arr = AnotherNonVoid.randomArrays(5,100);
        System.out.println(arraysSum(1, 2, 3, 4, 5, 6, 77, 25, 33, 65, 15));
        arraysSum(5,arr);
        System.out.println();
    }

    public static int arraysSum(int ... arr) {

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 10 != 5) {
                sum += arr[i];
            }
        }
        return sum;
    }

    public static void arraysSum( int a,int [] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 10 != a) {
                sum += arr[i];
            }
        }
        System.out.println(sum);
    }
}