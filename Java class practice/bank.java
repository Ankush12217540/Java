
abstract class Bank {
    String name;
    double balance;
    Bank(String name,double balance){
        this.name=name;
        this.balance=balance;
    }
    abstract double deposit(double amount);
    abstract double withdraw(double amount);
    void displayAmount(){
        System.out.println("Name: "+name+ " balance: "+balance);
    }
}

class Saving extends Bank{
    double interestRate;
    balance=balance-amount;
}
