package classAndObject;

public class UsingOurObjectFlag {
    public static void main(String[] args) {
        String name ="james";
        Flag f1 = new Flag();

        f1.country = "USA";
        f1.color = "Red, blue, white";
        f1.material ="wood";
        f1.size = 5;
        System.out.println(f1.country);
        f1.wave();

        System.out.println();
        f1.info();

        System.out.println("\n");
        f1.upgradeFlag(9,"Wool");
        BankAccount bank = new BankAccount();

//        BankAccount.deposit(123);
        System.gc();

    }
}
