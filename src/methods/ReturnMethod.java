package methods;
public class ReturnMethod {
    public static void main(String[] args) {

        System.out.println(getThree(5));

    }


    public static boolean getThree(int a) {
        boolean valid = false;
        if (a == 3) {
            valid = true;
        }
        return valid;

    }
}
