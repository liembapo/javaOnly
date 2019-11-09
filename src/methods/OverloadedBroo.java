package methods;

public class OverloadedBroo {
    public static void main(String[] args) {
        count(3);
    }

    public static void count(int a) {
        System.out.println("int");
    }

    public static void count(long a) {
        System.out.println("long");
    }

    public static void count(byte a) {
        System.out.println("byte");

    }

    public static void count(short a) {
        System.out.println("short");
    }
}