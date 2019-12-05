package works;

public class Check {
    public static void main(String[] args) {


        System.out.println("iNPUT THE WAY IT'S SUPPOSED TO BE! i'M NOT KIDDING MM/DD/YYYy");
        int y = 2011;
        int m = 10;
        int d = 29;

        int y1 = 1910;
        int m1= 5;
        int d1 = 12;

        //String z =

        int LOL = y*10000 + m*100 + d;
        System.out.println(LOL);
        int LMAO = y1*10000 + m1*100 + d;
        System.out.println(LMAO);

        int result = LOL - LMAO;
        System.out.println(result);

        if (result > 0) {
            System.out.println(1);
        } else if (result < 0) {
            System.out.println(-1);
        } else {
            System.out.println(0);
        }
    }
}
