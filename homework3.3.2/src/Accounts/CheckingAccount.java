package Accounts;

public class CheckingAccount extends Account {
    @Override
    public void pay(int amount) {
        if (amount < 0){
            return;
        }
        if (amount < super.amount) {
            super.amount -= amount;
            System.out.println("С расчетного счета оплачено: " + amount);
        }else{
            System.out.println("На расчетном счете не достаточно средств для оплаты");
        }
    }

    @Override
    public void transfer(Account account, int amount) {
        if (account == null) {
            return;
        }
        if (amount < 0){
            return;
        }
        if (amount < super.amount) {
            int transferred = account.addMoney(amount);
            if (transferred > 0){
                super.amount -= transferred;
            } else{
                System.out.println("С расчетного счета на другой счет ничего не переведено");
            }
        }else{
            System.out.println("На расчетном счете не достаточно средств для перевода на другой счет");
        }
    }

    @Override
    public int addMoney(int amount) {
        if (amount < 0){
            return 0;
        }
        super.amount += amount;
        System.out.println("На расчетный счет переведено: " + amount);
        return amount;
    }
}
