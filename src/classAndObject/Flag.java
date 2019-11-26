package classAndObject;

public class Flag {
    String country;
    int size;
    String color;
    String material;

    public void wave(){
        System.out.println("flag is flapping");
    }

    public void info(){
        System.out.println("Country: " + country);
        System.out.println("Size: "+ size);
        System.out.println("Color: "+color);
        System.out.println("Material: "+ material);
    }
    public void upgradeFlag(int size, String material){  // this case local var same as insatance var(we use this. method)

        this.material = material;
        this.size = size;
        System.out.println("Country: " + country);
        System.out.println("Size: "+ size);
        System.out.println("Color: "+color);
        System.out.println("Material: "+ material);
    }
}
