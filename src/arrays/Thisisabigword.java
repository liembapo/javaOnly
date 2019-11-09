package arrays;

import java.util.Arrays;

public class Thisisabigword {
    public static void main(String[] args) {


        String word = "Write a program that creates a group of given size thisisabigword";
        int biggestLength = 0;
        String[] newArr = word.split(" ");
        Arrays.sort(newArr);
        for (String arr : newArr) {
            if (arr.length() > biggestLength) ;
            biggestLength = arr.length();

        }

        for (String arr : newArr){
            if(biggestLength== arr.length()){
                System.out.println(arr);
            }



//        String words = "It started to snow in Chicago";         // reverse it
//        String[] snow = words.split(words);
//
//        for (int i = 0; i< snow.length-1;i++){
//            snow[i]
        }

    }
}
