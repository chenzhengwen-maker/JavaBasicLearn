package banking;

public class Account {
    protected double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    /**
     * 存钱方法
     * @param amt
     */
    public boolean deposit(double amt){
        this.balance += amt;
        return true;
    }

    /**
     * 取钱方法
     * @param amt
     */
    public void withdraw(double amt){
        if(amt > balance){
            throw new OverdraftException("资金不足",amt-balance);
        }
        this.balance -= amt;
    }
}
