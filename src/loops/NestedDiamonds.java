package loops;

public class NestedDiamonds {
    public static void main(String[] args) {
        int x = 4;

        for (int i = 0; i< x ;i++){
            for (int j = 0; j < 7-i-x  ;j++){
                System.out.print("1");}
            for (int k=0; k < (2*i+1);k++){
                System.out.print("*");}


            System.out.println();
        }
        for (int i = 0; i<x-1 ;i++) {
            for (int j = 0; j < i +1  ; j++){
                System.out.print("1");}
            for (int k = 0; k <5-(i*2) ; k++){
                System.out.print("*");}
            System.out.println();
        }

    }
}
