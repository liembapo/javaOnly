package arrays;

public class WindyCity {
    public static void main(String[] args) {

        String [] cities = {"chicago","New York","Madison","Miami","Washington"};
        int count =0;
        boolean check = false;
        for(String city : cities) {
            if (city.equalsIgnoreCase("chicago")) {
                count++;
                check = true;

            }
            if (check) {
                System.out.println("WindyCity found" + count + "times");
            } else {
                System.out.println("Windy City not found ");
            }
        }

    }
}
