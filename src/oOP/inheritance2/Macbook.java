package oOP.inheritance2;

public class Macbook extends Laptop {

    public Macbook(int mem){
        super.memory =mem;
    }
    public Macbook(){


    }


    public void appleId(){
        super.memory = 32;
    }
    public static void main(String[] args) {

        Macbook macbook =  new Macbook();
        System.out.println(macbook.memory);
        macbook.appleId();
        System.out.println(macbook.memory);
        System.out.println(macbook.memory+128);
        macbook.appleId();
        System.out.println(macbook.memory);
        System.out.println();

        Macbook nu = new Macbook();
        System.out.println(nu.memory);
    }
}
