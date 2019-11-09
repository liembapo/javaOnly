//Create a method that takes a String, it will print the first characters
//  Then overload the method to take a String, and an index. And print the character found at that index
// Then overload the method to take a String and two numbers. Take the substring of the String based
//  on the two numbers provided. Return the length of the substring String

        package methods;

public class Taskkk {
    public static void main(String[] args) {

        int a = 5 ;
        int b = 3 ;

        int c = firstChar(a,b);




    }
    public static String firstChar(String word){
        word = word.substring(0,1);
        return word;
    }
    public static char firstChar(String word, int i){
        char a = word.charAt(i);
        return a;
    }
    public static void firstChar(String word, int i , int j   ){
        System.out.println((j-i));
    }
    public static int firstChar(int i, int j ){
        int k = i +j;
        return k;
    }
}
