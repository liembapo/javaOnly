package arrays;

import java.util.Arrays;

public class sad {
    public static void main(String[] args) {
        int[] arr = {50, 60, 0, 400, 30, 20, 70, 0};

        for(int i = 0 ; ;i++) {
            int count = 0;
            for (int j = 0; j < arr.length - 1; j++) {

                if (arr[j + 1] == 0) { //j3
                    arr[j] /= 2;
                    count++;
                    continue;
                }
                if (arr[j] == 0) {
                    arr[j + 1] /= 2;
                    j++;
                    count++;
                }
                if (arr[arr.length - 1] == 0) {
                    count++;
                }
            }
            System.out.println(Arrays.toString(arr));
            if (count == 8) {
                break;
            }
        }
    }
}

