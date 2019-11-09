package loops;

public class Task3 {
    public static void main(String[] args) {

        for(int a = 0 ; a<=50;a++){
            if (a%10==3){
                continue;
            }System.out.println("loop no. " + a);
        }
        System.out.println();
    }
}
