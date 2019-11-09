package works;

import java.util.Arrays;
import java.util.Scanner;

public class BInary {
    public static void main(String[] args) {
        Scanner input = new Scanner((System.in));
        int num = input.nextInt();
        int[]arr = new int [8];

        for (int i = 0 ,j=128 ; i <arr.length ; i++,j/=2) {
            if(num-j>=0){
                arr[i]=1;
                num = num - j;
            }else if(num-j < 0) {
                arr[i]=0;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
