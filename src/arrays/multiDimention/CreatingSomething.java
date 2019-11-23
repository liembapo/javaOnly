package arrays.multiDimention;

import javax.xml.namespace.QName;
import java.util.Arrays;
import java.util.Random;

public class CreatingSomething {
    public static void main(String[] args) {
        int [][]nums= createArray(4,4);
       printIt(nums);
        System.out.println(diag(nums));
        System.out.println(sumDiag(nums));
        System.out.println(differenceOfSum(nums));
//        System.out.println(Arrays.deepToString();
    }

    public static int[] [] createArray(int a,int b ){
        int []  [] name = new int [a][b];
        Random rand = new Random();
        for ( int i = 0 ; i< name.length ; i++){
            for ( int j = 0 ; j < name.length; j++){
                name[i][j] = rand.nextInt(10);
            }
        }
        return name;
    }
//    Create a method that will take 2d array and return the difference between
//    the sum of the diagonals
    public static int diag(int[][] num){
        int sumLeft = 0;
        int sumRight = 0;
        for ( int i = 0 ; i < num.length; i++){
            for( int j = 0 ; j < num[i].length;j++){
                if(i==j){
                    sumLeft += num[i][j];
                }
                if(i+j==num[i].length-1){
                    sumRight+= num[i][j];
                }
            }
        }
        return sumLeft-sumRight;
    }
    public static void  printIt(int[][]nums){
        for (int  i =0;i<nums.length;i++){
            System.out.println(Arrays.toString(nums[i]));
        }
    }
    public static int sumDiag(int[][]nums){
        int sumOne=0;
        int sumTwo=0;
        for(int i = 0,j=nums.length-1; i<nums.length;i++,j--){
            sumOne+=nums[i][i];
            sumTwo+=nums[j][i];
        }
        return Math.abs(sumOne-sumTwo);
    }

    public static int differenceOfSum(int [][] arr)  {
        int sumOne = 0;
        int sumTwo = 0;
        for(int i=0 , j = arr.length-1; i < arr.length; i++, j--) {
            sumOne += arr[i][i];
            sumTwo += arr[j][i]; //arr[arr.length-1-i][i]
        }
        return Math.abs(sumOne - sumTwo);
    }
}
