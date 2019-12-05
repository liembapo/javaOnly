package staticClass;

import java.util.ArrayList;

public class DriveLexus {


    public static void main(String[] args) {
        Lexus car1 = new Lexus("x", 2017);
        car1.milage = 7780;

        Lexus.evaluateCar(car1);
        Lexus car2 = new Lexus("f",2000);
        Lexus car3 = new Lexus("k",2001);
        System.out.println(Lexus.totalNumOfLexus);
        car2.totalNumOfLexus = 7;
        System.out.println(Lexus.totalNumOfLexus);
        Lexus.totalNumOfLexus = 10;
        System.out.println(Lexus.totalNumOfLexus);

        ArrayList<Lexus> k = new ArrayList<>();
        k.add(car1);
        k.add(car2);
        k.add(car3);

        System.out.println(k);
    }
            }
