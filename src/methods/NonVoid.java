package methods;

import java.util.Arrays;

public class NonVoid {
    public static void main(String[] args) {
        int [] arr = {3,2,3,5,-2,24,5,23,0};
        System.out.println(countEvenNumber(arr));

        String []word = {"what","the","heck","is","that"};
        System.out.println(Arrays.toString(increaseArrays(word,"apa")));
    }

    public static boolean isWeekday(String day) {
        day = day.toLowerCase();
        switch (day) {
            case "monday":
            case "tuesday":
            case "wednesday":
            case "thursday":
            case "friday":
                return true;
            case "saturday":
            case "sunday":
                return false;
            default:
                System.out.println("Invalid day provided");
                return false;
        }
    }
    public static int countEvenNumber(int [] num){
        int count =0;
        for (int i = 0 ; i < num.length;i++){
            if(num[i]%2==0){
                count++;
            }
        }
        return count;
    }
  //  Create a method that will take a String array and a String. Increase your array capacity and add the
    //  given String as the last element of the new array. Return the new array

    public static String[] increaseArrays(String []word,String woword){
        String [] words = Arrays.copyOf(word,word.length+1);
        words[words.length-1]= woword;
        return words;
    }
}