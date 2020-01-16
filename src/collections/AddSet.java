package collections;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class AddSet {
    public static void main(String[] args) {
        Set <String> nuSet1 = new HashSet<>(Arrays.asList(new String[]{"red", "green", "black", "white"}));
        Set <String> nuSet2 = new HashSet<>(Arrays.asList(new String[]{"red", "yellow", "white", "pink"}));


        Set <String> set3 =  new HashSet<>();

        for (String a: nuSet1) {
            if(nuSet2.contains(a)) set3.add(a);
        }

        System.out.println(set3);
    }
}
