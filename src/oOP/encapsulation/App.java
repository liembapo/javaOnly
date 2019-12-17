package oOP.encapsulation;

import java.util.ArrayList;
import java.util.List;

public class App {
    private String name ;
    private String category;
    private double rating;
    private String description;
    private double size;
    private static List<String> reviews ;
    public static int numberOfApps ;

    public  App(){}

    public App(String name, String category , double size){
        numberOfApps++;
        this.name = name;
        this.category = category;
        this.size = size;
        reviews = new ArrayList<>();
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public static List<String> getReviews() {

        return reviews;
    }

    public static void setReviews(List<String> reviews) {
        App.reviews = reviews;
    }

    public static int getNumberOfApps() {
        return numberOfApps;
    }

    public static void setNumberOfApps(int numberOfApps) {
        App.numberOfApps = numberOfApps;
    }


    public void openApp(){
        System.out.println( name  + " is opening") ;
    }
    public void closeApp(){
        System.out.println((name  + " is closing"));
    }
    public void updateApp(){
        System.out.println(name  + " is updating");
    }
    public void appInfo(){
        System.out.println("App name "+ name);
        System.out.println(("Category "+ category));
        System.out.println("rating : "+rating);
        System.out.println("Description : " + description);
        System.out.println("Size : " + size);
        System.out.println("Total app = " + numberOfApps);
    }
    /**
     * Modify method setReview. Method should accept String message.
     * Method adds review to the list of reviews if message is at least 3 letters and prints success message.
     * If message less than 3 letters then it should NOT add the review and should print failure message.
     */

    public static void setReview(String word){
       if(word.length()>3){
           reviews.add(word);
           System.out.println("success message");
       }else {
           System.out.println("Invalid review");
       }

    }

}
