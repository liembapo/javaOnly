package arrays;

public class forEachLoop {
    public static void main(String[] args) {
        int [] numbers = {2,44,32,4,76,8};

        //traditional loops
        for (int i = 0 ; i < numbers.length;i++){
            if(numbers[i]%2==0) {
                System.out.println(numbers[i]);
            }
        }
        //for each
        for(int number : numbers){
            if (number%2==0){
                System.out.println(number);
            }
        }
        System.out.println();
        String [] names = {"adam","james","bob"};
        for(String name: names) {
            if(name.contains("a")) {
                System.out.println(name);
            }
        }

    }
}
