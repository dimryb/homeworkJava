package Accounts;

public class SavingsAccount extends Account {
    @Override
    public void pay(int amount) {
        System.out.println("Оплата со сберегательного счета не допустима");
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
                System.out.println("Со сберегательного счета на другой счет ничего не переведено");
            }
        }else{
            System.out.println("На сберегательном счете не достаточно средств для перевода на другой счет");
        }
    }

    @Override
    public int addMoney(int amount) {
        if (amount < 0){
            return 0;
        }
        super.amount += amount;
        System.out.println("На сберегательный счет переведено: " + amount);
        return amount;
    }
}
