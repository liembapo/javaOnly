package arrays;
import java.util.*;
public class RepeatedTwice {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(), input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};

        for(int i=0; i<7; i++){
            int count = 0;
            for(int j = 0 ; j<7 ;j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }
            if (count==1) {
                System.out.println(nums[i]);
            }
        }
    }
}
