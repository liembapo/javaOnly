package importantTask;

//import java.util.Arrays;

import java.util.Arrays;
import java.util.Scanner;

import static methods.VoidMethod.sayHi;

public class Binaryyyy {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("please input number : ");
        int decimal = input.nextInt();
        int[] binary = new int[8];

        for(int i = 0, j = 128; i <8 ; i++ ,j/=2 ){

            if(decimal-j >=0){
                binary[i]=1;
                decimal-=j;

            }else {
                    binary[i]=0;
            }

        }
        System.out.println(Arrays.toString(binary));

    }
}
