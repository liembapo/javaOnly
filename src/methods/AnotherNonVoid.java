package methods;
import java.util.Arrays;
import java.util.Random;
public class AnotherNonVoid {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(randomArrays(10, 10)));
        String word ="About 293,329,202 results (0.78 seconds)";
        System.out.println(resultOf(word));
        System.out.println(timeOf(word));
//        System.out.println(timeOf("aaa","asdas"));
        timeOf("a","a");
    }
//    Create a method that will generate a random int array. The method takes the size of
//    the array and the bound of the random numbers. Return the random array

    public static int[] randomArrays(int size, int random) {
        Random ran = new Random();
        int[] newArr = new int[size];
        int randomNum;
        for (int i = 0; i < size; i++) {
            randomNum = ran.nextInt(random);
            newArr[i] = randomNum + 1;
        }
        return newArr;
    }
//    About 293,329,202 results (0.78 seconds)
//    Write a method that extracts the result number and returns it as only numbers
//    Write a method that takes the extracts the result time and returns it as a number and the seconds
//
public static int resultOf(String word){
        String [] arr = word.trim().split(" ");
        arr [1] = arr[1].replace(",","");
        int num = Integer.valueOf(arr[1]);
        return num;
}
public static String timeOf(String word){
    String [] arr = word.trim().split(" ");
    arr[3]= arr[3].substring(1);
    return arr[3];

}
public static String timeOf(String ya,String no){
        System.out.println("no or yes");
        return "yes OR no?";
}
}