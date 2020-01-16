package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class RemovesOddSet {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in    );
        System.out.println("please enter 5 number");

        Set<Integer> num = new HashSet<>();
        for (int i = 0; i < 5; i++) {
            int a = scan.nextInt();
            num.add(a);
        }


        Iterator <Integer> change = num.iterator(); {
            while (change.hasNext()) {
                if (change.next() % 2 == 1) {
                    change.remove();
                }
            }
        }

        System.out.println(num);
    }
}
