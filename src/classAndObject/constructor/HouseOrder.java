package classAndObject.constructor;


import java.util.Scanner;

public class HouseOrder {
    public static void main(String[] args) {


        House house = new House();
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter the type: ");
        house.type = scan.nextLine();
        System.out.print("Please enter the address: ");
        house.address = scan.nextLine();
        System.out.print("Please enter the rooms you wish: ");
        house.numOfRoom = scan.nextInt();

        house.info();

    }
}
