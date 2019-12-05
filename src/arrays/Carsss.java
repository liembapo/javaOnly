package arrays;

import java.util.Arrays;

public class Carsss {
    public static void main(String[] args) {
        String [] carsBrand = { "mercedes","BMW","toyota","Ferrari"};

        for (String car: carsBrand) {
            if(car.equalsIgnoreCase("mercedes")){
                System.out.println(car + ": Luxury Brand");
            }else if(car.equalsIgnoreCase("BMW")){
                System.out.println(car+": Luxury Sport");
            }else if(car.equalsIgnoreCase("toyota")){
                System.out.println(car +": Reliable-Cheap");
            }else if(car.equalsIgnoreCase("ferrari")){
                System.out.println(car+": alskjfda;lsjfd");
            }

        }


        int []arr ={123,2,13,32,32,45,23,1,325,500,123,233};
//        Arrays.sort(arr);
        int minVal = Integer.MAX_VALUE;  //1
        int maxVal = Integer.MIN_VALUE;
                for (int i = 0; i < arr.length; i++) {
            if(arr[i]<minVal){
                minVal = arr[i];
            }
            if(arr[i]>maxVal){
                maxVal = arr[i];
            }
        }
        System.out.println();
        System.out.println(minVal);
        System.out.println(maxVal);
        System.out.println(Integer.MAX_VALUE);


        System.out.println("\nMin Grade = " + arr[0]);
        System.out.println("Max Grade = " + arr[arr.length-1]);
    }
}
