package arrays.multiDimention;

public class ReturnBiggestNum {
    public static void main(String[] args) {
//        Create a method that will return the biggest numbers from a 2D array
    int [][] nums = {{3,5,2,342,4,23},{43,32,4032,32,430000},{400000,43,23,23}};
        System.out.println(maxNum(nums));
        System.out.println(biggestIndex(nums));
    }

   public static int maxNum(int [][] nums) {
        int max = 0;
        for (int [] element : nums) {
            for (int awoo : element) {
                if (awoo > max) {
                    max = awoo;
                }
            }
        }
        return max;
    }

    public static int  biggestIndex(int [][] nums){
        int max = 0;
        int element = 0 ;
        for (int i = 0; i < nums.length; i++) {
            int sum =0;
            for (int j = 0; j < nums[i].length; j++) {
                sum += nums[i][j];
                if (sum > max) {
                    max = nums[i][j];
                    element = i;
                }
            }
        }
        return element;
    }
}

