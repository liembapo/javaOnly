package studentMentoring;

import java.util.Arrays;

public class ForLoopTraditionalNestedOne {
    public static void main(String[] args) {
        //first example
        //buble sort

        int [] array = {1,-2,3,-4};

        int temp;
        for (int i = 0; i < array.length ; i++) {
            for (int j = 1; j < array.length ; j++) {
                if (array[j] < array[j - 1]) {
                    temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(array));


        //second example SUM OF DIAGONAL,,
    }
}
