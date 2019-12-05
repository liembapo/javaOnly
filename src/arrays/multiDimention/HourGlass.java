package arrays.multiDimention;

import java.util.Arrays;

public class HourGlass {
    public static void main(String[] args) {
        int [][] nums = new int [6][6];

        int []nu = {0 ,-4 ,-6 ,0 ,-7 ,-6};
        int []nunu={-1 ,-2, -6 ,-8 ,-3 ,-1};
        int []nununu= {-8 ,-4, -2 ,-8 ,-8 ,-6};
        int []la = {-3 ,-1, -2, -5, -7, -4};
        int []lala = {-3 ,-5 ,-3 ,-6 ,-6 ,-6};
        int []lalala = {-3 ,-6, 0, -8, -6, -7};
        nums[0] = nu;
        nums[1]=nunu;
        nums[2]=nununu;
        nums[3]= la;
        nums[4]=lala;
        nums[5]=lalala;

        CreatingSomething.printIt(nums);
        int sum = 0;
        int max = 0;
        for(int i = 0 ; i < nums.length-2 ;i++) {
            for (int j = 0; j < nums.length - 2; j++) {
                sum = nums[i][j] + nums[i][j + 1] + nums[i][j + 2] + nums[i + 1][j + 1] + nums[i + 2][j] + nums[i + 2][j + 1] + nums[i + 2][j + 2];
                if (sum > max) {
                    max = sum;
                }
            }

        }
        System.out.println(max);
        System.gc();
    }
}
