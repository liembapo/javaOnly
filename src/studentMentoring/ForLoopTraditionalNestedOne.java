package studentMentoring;

import java.util.Arrays;

public class ForLoopTraditionalNestedOne {
    public static void main(String[] args) {
        //first example
        //buble sort

        int [] array = {1,-2,3,-4};

        int temp;
        for (int i = 0; i < array.length ; i++) {
            for (int j = 0; j < array.length ; j++) {
                if (i == 2 ) {

                    break;
                }
                System.out.println("your name is doka");
            }
            System.out.println("my name is bobby");
        }
        System.out.println(Arrays.toString(array));


        //second example SUM OF DIAGONAL,,
    }
}
