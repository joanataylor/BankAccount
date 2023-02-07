public class TestBankAccount {
    public static void main(String[] args) {
        BankAccount bankAccount1 = new BankAccount(5000, 25000);
        BankAccount bankAccount2 = new BankAccount(1, 39);
        BankAccount bankAccount3 = new BankAccount(8000);



        bankAccount1.addCheckingBalance(250);
        System.out.println("ckecking bal" + bankAccount1.getCheckingBalance());
        bankAccount1.withdrawBalance(5250);


        System.out.println("----------Account 1---------------");
        System.out.println("Checking Balance: $" + bankAccount1.getCheckingBalance());
        System.out.println("Savings Balance: $" + bankAccount1.getSavingsBalance());
        System.out.println("Account Balance: $" + bankAccount1.showAllBal());

        System.out.println("----------Account 2---------------");
        System.out.println("Checking Balance: $" + bankAccount2.getCheckingBalance());
        System.out.println("Savings Balance: $" + bankAccount2.getSavingsBalance());
        System.out.println("Account Balance: $" + bankAccount2.showAllBal());
        
        System.out.println("----------Account 3---------------");
        System.out.println("checking Balance: $" + bankAccount3.getCheckingBalance());
        System.out.println("Savings Balance: $" + bankAccount3.addSavingsBal(30));
        System.out.println("Saving and Checking Total Balance: $" + bankAccount3.showAllBal());
        
        System.out.println("----------Total in All accounts---------------");
        BankAccount.showBankTotal();

        System.out.println("----------Total Accounts---------------");
        BankAccount.totalAccounts();
    }
}