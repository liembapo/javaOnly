package oOP.inheritance;


import oOP.accessModifier.Person;
import oOP.encapsulation.App;

import java.util.Arrays;
import java.util.HashMap;

public class CodingBootCamp extends App {
    public static void main(String[] args) {
//        CodingBootCamp shcool1 = new CodingBootCamp();
//        shcool1.name = "Cybertek";
//        shcool1.hostEvent("1 Jan 2020\n");
//        shcool1.giveHW();
//
//        int [] white = {255,255,255};
//        int [] gray = {2,23,0};
//
//        int [][] col = {white,gray};
//        int [] choosen = new int[0];
//        choosen = gray;

      HashMap <String,Integer> abc = new HashMap<>();

      String  a = "BoBby";
      String [] b = a.split("");

        for (int i = 0; i < b.length;  i++) {
            if(!abc.containsKey(b[i]))  {
                abc.put(b[i],1);
                continue;
            }

            abc.put(b[i],abc.get(b[i])+1);
            }

        System.out.println(abc);
int count =0;
        for (int i = 0; i < abc.size(); i++) {
//            if(abc.get(i)){
                count++;
//            }
        }
        System.out.println(count);

    }
}
