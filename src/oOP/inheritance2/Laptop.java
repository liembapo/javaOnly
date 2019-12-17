package oOP.inheritance2;

import java.util.Arrays;
import java.util.HashMap;

public class Laptop {
    String color ;
    int memory;
    String model;

    public Laptop(){
        model = "good";
    }

    public void turnOn(){
        System.out.println("laptop is turning on");
    }

    public static void main(String[] args) {
        Laptop bobby = new Laptop();
        System.out.println(bobby.model );

        Laptop bob = new Laptop();
        System.out.println(bob.model);


        String [] ab= {"asdsadsa","asdasdsadsa","asdasdsadsad"};

        String []a = Arrays.copyOfRange(ab,0,1);
        System.out.println(Arrays.toString(a));
        boolean abs = true;

        HashMap <String,Integer> ray = new HashMap<>();
    }
}
