package arrays;

import java.util.Arrays;

public class Carsss {
    public static void main(String[] args) {
//        String [] carsBrand = { "mercedes","BMW","toyota","Ferrari"};
//
//        for (String car: carsBrand) {
//            if(car.equalsIgnoreCase("mercedes")){
//                System.out.println(car + ": Luxury Brand");
//            }else if(car.equalsIgnoreCase("BMW")){
//                System.out.println(car+": Luxury Sport");
//            }else if(car.equalsIgnoreCase("toyota")){
//                System.out.println(car +": Reliable-Cheap");
//            }else if(car.equalsIgnoreCase("ferrari")){
//                System.out.println(car+": alskjfda;lsjfd");
//            }
//
//        }
//
//
//        int []arr ={123,2,13,32,32,45,23,1,325,500,123,233};
////        Arrays.sort(arr);
//        int minVal = Integer.MAX_VALUE;  //1
//        int maxVal = Integer.MIN_VALUE;
//                for (int i = 0; i < arr.length; i++) {
//            if(arr[i]<minVal){
//                minVal = arr[i];
//            }
//            if(arr[i]>maxVal){
//                maxVal = arr[i];
//            }
//        }
//        System.out.println();
//        System.out.println(minVal);
//        System.out.println(maxVal);
//        System.out.println(Integer.MAX_VALUE);
//
//
//        System.out.println("\nMin Grade = " + arr[0]);
//        System.out.println("Max Grade = " + arr[arr.length-1]);

//        String word = "We went to picnic today";
//        String [] nuWord = word.split(" ");
//        System.out.println(Arrays.toString(nuWord));
////--------------------------------------------------------------------
//        String bobby ="";
//        for (int i = 0; i < nuWord.length; i++) {
//            String rev = "";
//            for (int j = nuWord[i].length()-1; j >=0 ; j--) {
//                rev += nuWord[i].charAt(j);
//            }
//          nuWord[i] = rev;
//            bobby+= nuWord[i]+  " ";
//        }
//        System.out.println(bobby);
//        System.out.println(Arrays.toString(nuWord));

        int [][] nums = {   {1,2,3,4,5},
                            {6,7,8,9,1},
                            {2,3,4,5,6},
                            {7,8,9,1,2},
        };

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {

                System.out.print(nums[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("\"kurry\"\n");
        for(int [] row : nums){
            for(int col : row){
                System.out.print(col + "\t");
            }
            System.out.println();
        }
    }

}
