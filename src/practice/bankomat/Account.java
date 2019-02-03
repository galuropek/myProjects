package practice.bankomat;

class Account {

    private double balance;

    Account(double balance) {
        this.balance = balance;
    }

    double getBalance() {
        return balance;
    }

    void putMoney(double money) {
        balance += money;
    }

    void getMoney(double money) {
        balance -= money;
    }
}
