package string;

//import java.util.Scanner;

public class Quiz6 {
    public static void main(String[] args) {
        String cars = "Toyota, BMW, Jaguar, Maserati, Mustang";

        if (cars.contains("Toyota") || cars.contains("Nissan")) {
            System.out.println("There is Japanese car in your Japanese car in your garage");}


        if (cars.contains("BMW")) {
            System.out.println("there is a Germany car in your garage");}


        if (cars.contains("Maserati")) {
            System.out.println("there is an Italian car in your garage");}

        if (cars.contains("Jaguar")) {
            System.out.println("there is Brithish car in your garage");}
        if (cars.isEmpty()){
            System.out.println("you have no car in garage");}
        if (!cars.contains("BMW,Maserati,Jaguar,Toyota,Nissan")){
            System.out.println("there is no car with X brand");}


    }
}