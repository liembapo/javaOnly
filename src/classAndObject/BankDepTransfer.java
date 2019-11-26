package classAndObject;

public class BankDepTransfer {
    public static void main(String[] args) {

        BankAccount newUser = new BankAccount();
        newUser.accoungNumber = 902988446;
        newUser.type = "Checking Card";
        newUser.balance = 1000;
        newUser.holderName = "Erika Kadrialyeva";

        newUser.deposit(500);
        newUser.transfer(2000);
        newUser.infoBank();
        newUser.transfer(1000);

    }
}
