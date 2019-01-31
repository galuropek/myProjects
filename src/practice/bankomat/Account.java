package practice.bankomat;

public class Account {

    private double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void putMoney(double money) {
        balance += money;
    }

    public void getMoney(double money) {
        balance -= money;
    }
}
