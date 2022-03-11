package Accounts;

public class CreditAccount extends Account {
    @Override
    public void pay(int amount) {
        if (amount < 0){
            return;
        }
        super.amount -= amount;
        System.out.println("С кредитного счета оплачено: " + amount);
    }

    @Override
    public void transfer(Account account, int amount) {
        if (account == null) {
            return;
        }
        if (amount < 0){
            return;
        }
        int transferred = account.addMoney(amount);
        if (transferred > 0){
            super.amount -= transferred;
        } else{
            System.out.println("С кредитного счета на другой счет ничего не переведено");
        }
    }

    @Override
    public int addMoney(int amount) {
        if (amount < 0){
            return 0;
        }
        if (super.amount + amount < 0) {
            super.amount += amount;
            System.out.println("На кредитный счет переведено: " + amount);
        } else{
            int factAmount = -super.amount;
            super.amount = 0;
            System.out.println("Кредитный счет возвращен в ноль");
            return factAmount; // это сколько переведено по факту, тк на кредитке больше 0 не может быть
        }
        return amount;
    }
}
