package importantTask;

import java.util.Scanner;

public class SquareDynamic {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.print("how big is the square : ");
        int big = input.nextInt();

        for (int i =0 ; i < big; i++){

            for (int j = 0 ; j <big ; j++){
                System.out.print("# ");
            }
            System.out.println();
        }
    }
}
