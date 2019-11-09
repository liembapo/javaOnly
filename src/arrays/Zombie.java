package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Zombie {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] inhabitants = new int[8];
        for(int i=0; i<inhabitants.length; i++) {
            inhabitants[i] = input.nextInt();
        }

        int sum = -1;
        int countDays = 0;

        while(sum != 0){

            sum = 0;
            System.out.println(" Day"  + countDays + " " + Arrays.toString(inhabitants));
            countDays++;
            for(int j = 0; j < inhabitants.length; j++){
                sum += inhabitants[j];
            }
            for(int i = 0; i < inhabitants.length-1; i++){

                if(inhabitants[i+1] == 0){
                    inhabitants[i] /= 2;

                    continue;
                }
                if(inhabitants[i] == 0){
                    inhabitants[i+1]/=2;
                    i++;
                }
            }
        }

        System.out.println("---- EXTINCT ----");
    }


}

