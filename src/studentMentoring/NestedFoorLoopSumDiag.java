package studentMentoring;

import static arrays.multiDimention.CreatingSomething.printIt;

public class NestedFoorLoopSumDiag {
    public static void main(String[] args) {

        int [][] num = { {1,2,3,4},
                         {5,6,7,8},
                         {9,8,7,6},
                         {5,4,3,2},
        };

        printIt(num);


        int sumLeft = 0;
        int sumRight = 0;
        for ( int i = 0 ; i < num.length; i++){
            for( int j = 0 ; j < num[i].length;j++){
                if(i==j){
                    sumLeft += num[i][j];
                }
                if(i+j==num[i].length-1){
                    sumRight+= num[i][j];
                }
            }
        }
        System.out.println("\n" +  sumLeft);
        System.out.println(sumRight);
        System.out.println(sumLeft-sumRight);
    }
}
