package codingdojo.derekbanas.structural.facade;

public class BankAccountFacade {

    private int accountNumber;
    private int securityCode;
    private AccountNumberCheck accountNumberChecker;
    private SecurityCodeCheck securityCodeChecker;
    private FundCheck fundChecker;
    WelcomeToBank bankWelcome;

    public BankAccountFacade(int newAccountNumber, int newSecurityCode) {
        accountNumber = newAccountNumber;
        securityCode = newSecurityCode;

        bankWelcome = new WelcomeToBank();
        accountNumberChecker = new AccountNumberCheck();
        securityCodeChecker = new SecurityCodeCheck();
        fundChecker = new FundCheck();
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public int getSecurityCode() {
        return securityCode;
    }

    public void withdrawCash(double cashToGet) {
        if (accountNumberChecker.accountActive(getAccountNumber()) &&
            securityCodeChecker.isCodeCorrect(getSecurityCode()) &&
            fundChecker.haveEnoughMoney(cashToGet)) {
            System.out.println("Transaction complete");
            return;
        }
        System.out.println("Transaction failed");
    }

    public void depositCash(double cashToDeposit) {
        if (accountNumberChecker.accountActive(getAccountNumber()) &&
            securityCodeChecker.isCodeCorrect(getSecurityCode())) {
            fundChecker.makeDeposit(cashToDeposit);
            System.out.println("Transaction complete");
            return;
        }
        System.out.println("Transaction failed");
    }

}
