package dojo.designpattern.derekbanas.structural.facade;

public class FundCheck {

    private double cashInAccount = 1000D;

    public double getCashInAccount() {
        return cashInAccount;
    }

    public void decreaseCashInAccount(double cashWithdraw) {
        cashInAccount -= cashWithdraw;
    }

    public void increaseCashInAccount(double cashDeposited) {
        cashInAccount += cashDeposited;
    }

    public boolean haveEnoughMoney(double cashWithdraw) {
        if (cashWithdraw > getCashInAccount()) {
            System.out.println("Error");
            return false;
        }
        decreaseCashInAccount(cashWithdraw);
        System.out.println("Withdrawal complete");
        return true;
    }

    public void makeDeposit(double cashToDeposit) {
        increaseCashInAccount(cashToDeposit);
        System.out.println("Deposit complete");
    }

}
