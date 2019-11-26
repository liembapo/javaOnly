package studentMentoring;

import java.util.Arrays;

public class ForEach {
    public static void main(String[] args) {
        int[] marks = { 125, 132, 95, 116, 110 };

        for (int a: marks) {

            if(a%2==0){
                System.out.println(" show "+ a);
            }

            a+=4;
        }

        System.out.println(Arrays.toString(marks));

//        int [][] num =  {    {1,2,3,4},
//                             {5,6,7,8},
//                             {9,8,7,6},
//                             {5,4,3,2},
//        };
//
//        for(int [] a: num){
//            for(int b : a){
//
//                System.out.print(b + " ");
//            }
//        }
    }
}
