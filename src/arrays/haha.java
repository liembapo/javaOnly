package arrays;


import java.util.Arrays;

//import java.util.*;
public class haha {
    public static void main(String[] args) {
        int [] arr = { 1,2,43,10000,5,6,5,7};

        for(int i = 0; ; i++){
            int count = 0;
            for(int j = 0 ;j<arr.length ;j++){
                arr[j]/=2;
                if(arr[j]==0) {
                    count++;
                }
            }
            System.out.println("Day "+ i + Arrays.toString(arr));
            if(count==8){
                    break;
            }

        }
    }
}



