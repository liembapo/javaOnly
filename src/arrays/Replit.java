package arrays;


import java.util.Scanner;

public class Replit {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        String[] words = new String[5];
        for(int i = 0; i < 5;  i++) {
            words[i] = input.nextLine();
        }
        String empty = "";
        for(int i =0 ; i < 5 ; i++){
            if ( words[i].length()> empty.length()){
                empty= words[i];
            }

        }
        System.out.println(empty);
    }
}
