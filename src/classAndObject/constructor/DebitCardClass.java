package arrays.multiDimention;

public class DebitCardClass {
    long cardNumber;
    String nameOfHolder;
    String typeOfCard;
    int pin;
    double balance;

    public void info(){                                                         // this is method
        System.out.println("Your card number is "+cardNumber);
        System.out.println("Holder name is " + nameOfHolder );
        System.out.println("Your balance is "+ balance);
        if(typeOfCard!=null) {
            System.out.println("Type of card is " + typeOfCard);
        }
    }

    public DebitCardClass(long num,String name , double bal){                              // this is constructor
        if(num > 1000000000000000L && num < 9999999999999999L){
            cardNumber = num;
            System.out.println("Your account number is "+ cardNumber);
        }else {
            System.out.println("Please enter 16 digit not less than that");
        }
        nameOfHolder =name;
        balance = bal;
    }


    public DebitCardClass(long num,String name , double bal, String cardType,int piiin){
        this(num,name,bal);
        if(cardType.equalsIgnoreCase("Master Card")||cardType.equalsIgnoreCase("Visa")){

            if(piiin>9999 || piiin <1000){
                System.out.println("Invalid pin length");           // this is overloaded constructor
            }else {
                pin = piiin;
            }

            typeOfCard = cardType;

        }else{
            System.out.println("Invalid card type");
        }
    }

}
