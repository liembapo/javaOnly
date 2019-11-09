package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class TaskCar {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println( "how many car u have?: ");
        int size = input.nextInt();
        input.nextLine();
        String [] garage = new String[size];
        for (int i = 0 ; i <size ; i++){
            System.out.println("please input the car");
            String cars = input.nextLine();

             garage[i] = cars;
        }
        System.out.println(Arrays.toString(garage));
    }
}
