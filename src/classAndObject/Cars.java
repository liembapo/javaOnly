//1. Create a class Car
//Instance variables: make, year, sportEdition, mileage
//        Methods:
//        drive -> print “%year %make is driving” -> increment mileage by 10
//        drive -> accepts String(destination) -> print “%year %make is driving to %destination”
//        -> increment mileage by 10
//        drive -> accepts integer(mile) -> print “%year %make is driving %mile miles”
//        -> increment mileage by given mile.
package classAndObject;

public class Cars {
    String make;
    int year;
    boolean sportEdition;
    int milage;

    public void drive(){
        System.out.println(make + "," + year + " is driving");
        milage+=10;
    }
    public void drive(String destination){
        System.out.println(make + "," + year + " is driving to " + destination);
        milage+=10;
    }
    public void drive(int mile){
        milage+=mile;
        System.out.println(make + "," + year + " is driving " + mile + " miles");
    }
}
