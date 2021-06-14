package JavaCore.Module06.HW06;

public class Account {
    int balance;

    public Account(int balance) {
        this.balance = balance;
    }

    public void withdraw(int n) {
        balance = balance - n;
        if (balance < n) balance = 0;
//        balance = balance < n ? 0 : balance - n;// alternate expression
    }

    public void put(int n) {
        balance = balance + n;
    }

    public int checkBalance() {
        return balance;
    }
}

class CheckingAccount extends Account {
    public CheckingAccount(int balance) {
        super(balance);
    }

    @Override
    public void put(int n) {
        super.put(n);
    }

    @Override
    public void withdraw(int n) {
        balance = balance - n;
    }

    public int getDebt() {
        if (balance < 0) return -balance;
        else return 0;
//        return balance < 0 ? -balance : 0;// alternate expression
    }
}

class Deposit extends Account {
    private int period, percent;

    public Deposit(int balance, int period, int percent) {
        super(balance);
        this.period = period;
        this.percent = percent;
    }

    public double withdraw() {
        if (this.period <= 0) {
            double result = Double.parseDouble(String.valueOf(balance * (100 + percent))) / 100;
            balance = 0;
            return result;
        } else return 0;
    }

    public void waitDays(int n) {
        period = period - n;
    }

    public boolean isPeriodExpired() {
//        return period <= 0 ? true : false;// alternate expresstion
        return period <= 0;
    }
}
