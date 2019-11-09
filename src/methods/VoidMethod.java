package methods;

public class VoidMethod {
    public static void main(String[] args) {

        sayHello();
//        sayHi();
        oddNum();

    }

    public static void sayHi() {     // you can use this method anywhere even on different class ;
        System.out.println("Hi");
    }
    public static void sayHello() {
        for (int i = 0; i < 2; i++) {
            System.out.println("hello");
        }
    }
    // create a method that prints "hello" 50 times
    public static void hello50() {
        for (int i = 0; i < 50; i++) {
            System.out.println("hello");
        }
    }
    // create a method that print odd number from 0 to 100.

    public static void oddNum() {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 1) {
                System.out.println(i);

            }
        }
    }
}
