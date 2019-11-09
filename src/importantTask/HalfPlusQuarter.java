package importantTask;

import java.util.Scanner;

public class HalfPlusQuarter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        float total = 0;

        for ( int i = 1 ; i <=n ; i++){
            total += 1f/i;
        }
        System.out.print(total);
    }
}
