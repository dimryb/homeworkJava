package Accounts;

public abstract class Account {
    protected int amount;

    public int getAmount(){
        return amount;
    }

    public abstract void pay(int amount);

    public abstract void transfer(Account account, int amount);

    public abstract int addMoney(int amount);
}
