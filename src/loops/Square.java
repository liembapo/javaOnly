package loops;

public class Square {
    public static void main(String[] args) {


        for (int i = 0 ; i<7;i++){
            for (int j = 0;j<7;j++){
                if( j == i){
                    break;
                }
                System.out.print("* ");

            }

            System.out.println();
        }



    }
}
