package collections;

import java.util.ArrayList;
import java.util.List;

public class ListVsSet {
    public static void main(String[] args) {

       List<String> cars = new ArrayList<>();

        cars.add("BMW");
        cars.add("Toyota");
        cars.add("Lexus");
        cars.add("Honda");
        System.out.println(cars);
        System.out.println(cars.get(2));
    }

}
