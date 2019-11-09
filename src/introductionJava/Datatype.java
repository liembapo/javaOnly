package introductionJava;


import java.util.Scanner;
public class Datatype {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        int change ,quarter,dime, nickle,penny;
//        boolean between;
//        System.out.print("put your change : " + "\n");
//        change = input.nextInt();
//        quarter = change /25 ;
//        dime = (change - (quarter*25))/10;
//        nickle =(change - ((quarter*25) +(dime*10)))/5;
//        penny   = change -((quarter*25)+(dime*10)+(nickle*5));
//        System.out.println("your change is " + quarter + " quarters and " + dime + " dimes and  " + nickle+ " nickles " + penny+ " penny"  );

        System.out.println("put your change = ");
        int change = input.nextInt();
        int quarter = change/25;
        int dime = change%25/10;
        int nickle = change%25%10/5;
        int penny = change%25%10%5;
        System.out.println("your change is " + quarter + " quarters and " + dime + " dimes and  " + nickle + " nickles " + penny+ " penny");


    }

}

