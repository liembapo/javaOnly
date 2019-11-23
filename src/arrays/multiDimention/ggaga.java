package arrays.multiDimention;

import java.util.Arrays;

public class ggaga {
    public static void main(String[] args) {
        int [] r = {3,4,5,2};   // we want to add 2 into the last element
        int[]new_r = {0,0,0,0,0};
        for(int i = 0; i< new_r.length ; i++){
            if(i == new_r.length-1){
                new_r[i]= 2;
            }else {
                new_r[i] = r[i];
            }
        }
        System.out.println(Arrays.toString(new_r));
    }
}
