package collections;

import java.util.*;

public class SetColl {
    public static void main(String[] args) {
        Set<String> cars = new HashSet<>();

        cars.add("BMW");                        // warrant for duplicated value
        cars.add("Toyota");
        cars.add("Lexus");
        cars.add("BMW");                        // warrant for duplicated value
        System.out.println(cars);

        for (String a : cars) {
            System.out.println(a);
        }

        System.out.println("\n");


        List<String> names = new ArrayList<>();

        names.add("james");
        names.add("sara");
        names.add("adams");
        names.add("ben");

        Iterator <String > it = names.iterator();
            while (it.hasNext()) {
                System.out.println(it.next());
                if (it.equals("ben")) {
                    it.remove();
                }
            }
        System.out.println(names);


    }
}
