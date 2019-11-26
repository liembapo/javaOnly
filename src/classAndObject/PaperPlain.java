package classAndObject;

public class PaperPlain {
    public static void main(String[] args) {

        Flag f3 = new Flag();
        f3.material = "plastic";
        f3.color = "red";
        f3.size  = 5;
        f3.country = "Iraq";
//        f3.info();

        System.out.println();
        Flag f4 = new Flag();

        f4.material = f3.material;
        f4.color = f3.color;
        f4.size  = f3.size;
        f4.country = f3.country;
//        f4.info();

        System.out.println();
        f3.material = "a";
        f3.color = "a";
        f3.size  = 0;
        f3.country = "a";

        f3.info();
        f4.info();

        f3.material = "gold";
        f3.size = 255;
        f3.info();

        Cars car = new Cars();
        car.make = "Ford";
        car.year = 2010;
        car.milage = 5000;
        car.drive();
        System.out.println(car.milage);
        car.drive("Hongkong");
        System.out.println(car.milage);
        car.drive(2000);
    }
}
