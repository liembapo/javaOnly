//Write a method that will tell you if it is the weekday or not. The method takes a String,
// Saturday and Sunday are the only weekend days
//Create a method that will count how many even numbers there is from the given array and return the value
package mentoring.tuesday;

public class haha {
    public static void main(String[] args) {

        System.out.println(checkWeekend("monday"));

    }

    public static boolean checkWeekend(String word){
        if(word.equalsIgnoreCase("saturday")|| word.equalsIgnoreCase("sunday")){
            return true;
        }
        else {
            return false;
        }
    }

}
