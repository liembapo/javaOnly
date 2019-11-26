package classAndObject.constructor;

import classAndObject.constructor.DebitCardClass;

public class UsingDebitCard {
    public static void main(String[] args) {

        DebitCardClass debit = new DebitCardClass(8111111111111000L, "bobby", 100000);

        debit.info();

    }
}
