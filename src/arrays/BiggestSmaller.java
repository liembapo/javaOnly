//3) Given an array with the value of: 31, 20, 25, 20, 3, 48, 26, 12
//        Print out the biggest and smallest values in the array
//        package arrays;
package arrays;
import java.util.Arrays;

 public class BiggestSmaller {
     public static void main(String[] args) {

         int [] nums = {31, 20, 25, 54, 54, 48, 51, 12};
         Arrays.sort(nums);
         System.out.println("biggest number " + nums[nums.length-1]);
         System.out.println("smallest number " + nums[0]);
     }
 }
