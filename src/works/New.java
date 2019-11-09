//Create and array of integer and store following
// numbers [5, 7, 8, 8, 11, 55, 23, 23, 23, 54, 7, 1, 2, 2]
//        Using a nested loop print only values that appear once(true meaning of unique):
//
//        Output: 5 11 55 54 1

package works;

import java.util.Scanner;

public class New {
    public static void main(String[] args) {
        int balance = 100;
        int limit = 3;
        Scanner in = new Scanner(System.in);
        int item = 0;
        int price;
        int cost = 0;
        do {
            System.out.print("insert the price");
            price = in.nextInt();
            if (price < balance && limit > 0 && balance >0) {
                balance -= price;
                limit--;
                item++;
                cost += price;
                if(limit !=0) {
                    System.out.println("you may buy up to " + limit + " item");
                }
            }else if ( balance == 0  ){
                System.out.println("You bought " + item + " spent " + cost + " and done shopping");
                return;
            }

            if(limit == 0){
                System.out.println("you bought "+ item + " item and spent " + cost + " and done shopping");
                return;
            }

        }while (balance>0);
        System.out.println("you spent " + price + "so far you may up buy to " + limit + "times");

    }
}
