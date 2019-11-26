package classAndObject.constructor;



public class Item {

    String nameOf ;
    double price;
    int size;

    public Item(){
    size =14;
    }

    public Item(String name , double pricee){
        nameOf = name;
        price = pricee;
    }
    //Overload the contstructor that takes 3 parameters to set all 3 instance variables
    public Item(String name , double priceee ,int sizee){
        this(name,priceee);
        size = sizee;

    }
    public void printItem(){
        System.out.println("Name is " + nameOf);
        System.out.println("Price is " + price);
        System.out.println("Item size is " + size);
    }
}
