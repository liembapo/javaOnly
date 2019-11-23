package arrays.multiDimention;

import java.util.Arrays;

public class MultiMulti {
    public static void main(String[] args) {
//        Create a 2D int array that has 3 inner arrays with some initial values. Print out the length of each inner array.
//> Given int array of [[4,2,3], [3232,11,13, 4, 2], [23,13]]
//        Length of row 1: 3
//        Length of row 2: 5
//        Length of row 3: 2
        int [][] arr = {{4,2,3}, {3232,11,13, 4, 2}, {23,13}};
        for (int i = 0 ; i <arr.length;i++){
            System.out.println("Length of row "+ (i+1) + " = " + arr[i].length);
        }

        String [][] nu = new String [3][];
        String nunu[]= {"bobby", "andrew", "hans", "nash"};
        String nununu[] = {"adam","noah"};
        String nunununu[]={"lily","dania","kelly"};

        nu[0] = nunu;
        nu[1] = nununu;
        nu[2] = nunununu;
        System.out.println(Arrays.deepToString(nu));
    }
}
