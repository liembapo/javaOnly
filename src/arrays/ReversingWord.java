package arrays;

import java.util.Arrays;

public class ReversingWord {
    public static void main(String[] args) {
        String words = "It started to snow in Chicago";         // reverse it
        String [] snow = words.split(" ");
        String helper = "";

        for (String word : snow){
            String reverse = "";
            for(int j =word.length()-1 ; j >=0;j--){
                reverse += word.charAt(j)+"";

            }
            helper += reverse + " ";
        }
        System.out.println(helper);
    }
}
