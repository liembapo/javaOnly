package enumeration;

public class UsingCalculatorEnum {
    public static void countIt(double a,double b,Calculator cal){
//        double result ;
        switch (cal){
            case PLUS:
                System.out.println("result is : "+ (a+b));break;
            case MINUS:
                System.out.println("result is : "+ (a-b));break;
            case DIVIDE:
                if(b==0){
                    System.out.println("you cannot divide by 0");break;
                }else {
                    System.out.println("result is: " + (a/b));break;
                }
            case MULTIPLE:
                System.out.println("result is : " + (a*b));break;
            case MODULUS:
                System.out.println("result is : "+ (a%b));break;

        }
    }
}
