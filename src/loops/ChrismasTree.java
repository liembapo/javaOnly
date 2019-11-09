package loops;

public class ChrismasTree {
    public static void main(String[] args) {
//        int high = 8;

        for (int i=0;i<8;i++){
            for(int j = 0 ; j <8-i; j++)
                System.out.print("1");
            for (int k = 0; k<(2*i+1);k++)
                System.out.print("8");
            System.out.println();

        }
    }
}
