//Write a program that will ask user to enter 5 names. Take each name and store all the names into an array.
// Print the array

package arrays;
import java.util.Arrays;
import java.util.Scanner;
public class StoresNameIntoArrays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many times do you want enter");
        int size = input.nextInt();
        input.nextLine();
        String [] names = new String[size];
        for(int i=0; i < names.length; i++) {
            System.out.println("Enter name " + (i+1));
            names[i] = input.nextLine();
        }
        System.out.println(Arrays.toString(names));


    }
}

