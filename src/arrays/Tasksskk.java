//print to 0 if u find the negative number
package arrays;

import java.util.Arrays;

public class Tasksskk {
    public static void main(String[] args) {
        int []numbers = {4,-2,5,-2,-20,30};
        for (int i =0 ; i<6 ;i++){
            if (numbers[i]<0)  {
                numbers[i]=0;
            }
        }
        System.out.println(Arrays.toString(numbers));
    }
}
