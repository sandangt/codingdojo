package codingdojo.derekbanas.structural.facade;

public class TestBankAccount {
    public static void main(String[] args) {
        BankAccountFacade accessingBank = new BankAccountFacade(12345678, 1234);
        accessingBank.withdrawCash(50D);
        accessingBank.withdrawCash(900D);
        accessingBank.depositCash(200D);
    }
}
