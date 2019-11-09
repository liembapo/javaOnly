package methods;

public class DataTransfer {
    public static void main(String[] args) {
        String origin = "china";
        String newLocation = "london";
        goTo("china","london");
//        makeEmail("bobby","Liem",29);

        String wor = "how are you baby?";

        countWords(wor);

    }
    public static void goTo (String origin , String newLocation){
        System.out.println("you are from : " + origin);
        System.out.println("and you're going to : " + newLocation);
    }
    public static void  makeEmail(String firstName,String lastName,int age){
        String email = firstName + age + lastName  + "@cybertek.com";
        System.out.println(email);
    }

    public  static void countWords(String  word){
        String [] words = word.split(" ");
        System.out.println(words.length);
    }
}
