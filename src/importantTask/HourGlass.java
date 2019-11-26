package importantTask;

import arrays.multiDimention.CreatingSomething;

import java.util.Arrays;

public class HourGlass {
    public static void main(String[] args) {
        int [][] nums = new int [6][6];

        int []nu = {1,1,1,0,0,0};
        int []nunu={0,1,0,0,0,0};
        int []nununu= {1,1,1,0,0,0};
        int [] la = {0 ,9 ,2 ,-4 ,-4 ,0};
        int []lala = {0,0,0,-2,0,0};
        int []lalala={0, 0, -1, -2, -4, 0};
        nums[0] = nu;
        nums[1]=nunu;
        nums[2]=nununu;
        nums[3]=la;
        nums[4]=lala;
        nums[5]=lalala;
        CreatingSomething.printIt(nums);
        int sum = 0;
        int max = Integer.MIN_VALUE;
        System.out.println(max);
        for(int k =0 ;k<nums.length-2;k++){
            for(int l =0;l<nums[k].length-2;l++){
                sum = nums[k][l]+nums[k][l+1]+nums[k][l+2]+nums[k+1][l+1]+nums[k+2][l]+nums[k                 +2][l+1]+nums[k+2][l+2];
                if(sum>max){
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
