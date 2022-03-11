import Accounts.*;

public class Main {

    public static void main(String[] args) {
        Account savingAccount = new SavingsAccount();
        Account creditAccount = new CreditAccount();
        Account checkingAccount = new CheckingAccount();

        System.out.println("На сберегательном счете: " + savingAccount.getAmount());
        System.out.println("На кредитном счете: "+ creditAccount.getAmount());
        System.out.println("На расчетном счете: " + checkingAccount.getAmount());

        savingAccount.addMoney(100);
        creditAccount.addMoney(20);
        checkingAccount.addMoney(150);

        savingAccount.pay(12);
        creditAccount.pay(23);
        checkingAccount.pay(17);

        savingAccount.transfer(creditAccount, 27);
        creditAccount.transfer(checkingAccount, 52);
        checkingAccount.transfer(savingAccount, 11);

        System.out.println("На сберегательном счете: " + savingAccount.getAmount());
        System.out.println("На кредитном счете: "+ creditAccount.getAmount());
        System.out.println("На расчетном счете: " + checkingAccount.getAmount());
    }
}
