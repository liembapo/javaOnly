package staticClass;

public class Lexus {

    String model;
    int year;
    String color;
    double milage;
    boolean newOrOld;
    double price;
    public static int totalNumOfLexus = 10;

    public Lexus(String model,int year){  //constructor
        totalNumOfLexus++;
        this.year = year;
        this.model = model;
    }
    public void info(){
        System.out.println(year);
        System.out.println(model);
        System.out.println(totalNumOfLexus);
    }

    public static double mileToKm (double miles){

        return (miles*1.6);
    }

    /**
     *
     * @param car
     */
    public static void evaluateCar(Lexus car ){

        int age = 2019- car.year;
        if( car.milage< 50000 && age <3 ){
            System.out.println("\" Best Choice \" ");
        }else if (car.milage >50000 && car.milage<100000 && age>=3 && age<7 ){
            System.out.println("\" Fair Choice \"");
        }else if (car.milage>100000 && car.milage<200000){
            System.out.println(" \"You Decide\"");
        }else if(car.milage>200000){
            System.out.println("\"Stay Away\"");
        }else {
            System.out.println("Not able to evaluate");
        }
    }

}
