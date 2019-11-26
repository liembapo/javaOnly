//2. Create a class BankAccount
//Instance variables: type, accountNumber, balance,
//        holderName Methods:
//        deposit. Method accepts double and it doesn’t return anything. Method should simply print
//        “%double is deposited to your account” and add given double to the balance.
//        transfer -> accepts double -> Method should print “%double $ is transferred from your account” and decrement balance by given amount.
//        info -> Method doesn’t accept or return anything. It should simply print the information about the BankAccount as below format
//        Name: %holderName
//        Balace: %balance
//        Type: %type
//        Account Number: %accountNumber
package classAndObject;

public class BankAccount {
    String type;
    int accoungNumber;
    double balance;
    String holderName;

    public void deposit(double moneyComesIn){

        balance += moneyComesIn;
        System.out.println("$"+moneyComesIn + " is deposited to your account");
    }
    public void transfer(double transferMoney){
        if(balance>transferMoney) {
            System.out.println("$"+transferMoney + " is transfered from your bank account");
            balance -= transferMoney;
        }else {
            System.out.println("Your balance is not enough to do this transaction");
        }
    }
    public void infoBank(){
        System.out.println("Holder Name: " + holderName);
        System.out.println("Balance: $" + balance);
        System.out.println("Type : "+ type);
        System.out.println("Account number: "+ accoungNumber);
    }

}
