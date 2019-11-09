package arrays;

public class StartsWithUppercase {
    public static void main(String[] args) {
        String [] foods = {"Bread","cucumber","Apples","Orange","cookies","Cake"};
        int count = 0;
        for(String food : foods){
            char start = food.charAt(0);
            if(start>=65 && start<=90){
                count++;
            }
        }
        System.out.println(count);
    }
}
