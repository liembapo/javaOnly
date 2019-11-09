//4) Create String array for students. Initialize with students below: James, John, Adam, Elize, Jamie, Benzema
//        Loop through each elements of students. - print first character of each name on each line.
//        - Part II * Modify the loop and print the player names whose name ends with "s";
//        - Part III * Modify and print the player if it contains "s"
//        Part IV * Read the String from the user using Scanner and print out the players
//        that contains the entered String keyword by user


package arrays;
//import java.util.Arrays;
import java.util.Scanner;
public class StudentsName {
    public static void main(String[] args) {
        String [] students = {"James", "Sam", "Adam", "Elize", "Jamie", "Benzema", "Sandy" };
        for(int i = 0; i < students.length; i++) {
            int last = students[i].length()-1;
            System.out.println(students[i].charAt(last));
        }
        System.out.println();
        for(int i=0; i < students.length; i++) {
            if(students[i].toLowerCase().endsWith("s")) {
                System.out.println(students[i]);
            }
        }
        System.out.println();
        for(int i=0; i < students.length; i++) {
            if(students[i].toLowerCase().contains("s")) {
                System.out.println(students[i]);
            }
        }
        System.out.println();
        System.out.println("Enter a string");
        Scanner input = new Scanner(System.in);
        String user = input.nextLine();
        for(int i=0; i < students.length; i++) {
            if(students[i].toLowerCase().contains(user)) {
                System.out.println(students[i]);
            }
        }
    }
}
