package arrays.multiDimention;

import java.util.Arrays;

public class HourGlass {
    public static void main(String[] args) {
        int [][] nums = new int [6][6];

        int []nu = {1,1,1,9,9,9};
        int []nunu={0,1,0,0,9,0};
        int []nununu= {1,1,1,9,9,9};
        nums[0] = nu;
        nums[1]=nunu;
        nums[2]=nununu;
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
        String word = "bobby";
        String[]b = word.split("");
        char []c = word.toCharArray();
        System.out.println(Arrays.toString(b));
        String d ="";
        for(int i=b.length-1;i>=0;i--){
            d+= b[i];
        }
        System.out.println(d);

        int z = 10;
        int x = 20;


    }
}
