//9) Given a String of: "knife", "wooden spoons", "plates", "cups", "forks", "pan", "pot", "trash can”, “fridge”, “dish washer”
//        Go through the array and print the value if there is multiple words.
package arrays;

public class MultipleWords {
    public static void main(String[] args) {
        String[] given ={"knife", "wooden spoons", "plates", "cups", "forks", "pan", "pot", "trash can”, “fridge”, “dish washer"};

        for(int i =0 ; i > given.length ;i++){
            if (given[i].trim().contains(" ")){
                System.out.println(given[i]);
            }
        }
    }
}
