//Create a BankAccount class
class BankAccount {
  // The class should have the following attributes(double)checking balance
  private double checkingBalance;
  // The class should have the following attributes(double)savings balance
  private double savingsBalance;
  // Create a class member (static) that has the number of accounts created thus
  // far

  //static attributes are not instances
  private static int totalAccounts = 0;
  // Create a class member (static) that tracks the total number of money stored
  // in every account created
  private static double bankTotal = 0;

  public BankAccount (double checkingBalanceParam){
    totalAccounts++;
    checkingBalance = checkingBalanceParam;
    savingsBalance = 0;
    bankTotal += checkingBalance + savingsBalance;
  }

  public BankAccount(double checkingBalance, double savingsBalance) {
    // In the constructor, be sure to increment the account count
    totalAccounts++;
    this.checkingBalance = checkingBalance;
    this.savingsBalance = savingsBalance;
    // Total ammount stored in accounts
    bankTotal += checkingBalance + savingsBalance;
  }
// Create a getter method for the users checking account balance
  public double getCheckingBalance(){
    return checkingBalance;
  }
//this sets an ammount - but dont need for this assignment
  // public void setCheckingBalance(double checkingBalanceParam){
  //   this.checkingBalance = checkingBalanceParam;
  // }

// Create a getter method for the users savings account balance
public double getSavingsBalance(){
  return savingsBalance;
}

  // Create a method that will allow a user to deposit money into the checking
  // account - add to total ammount stored
  public double addCheckingBalance(double addCheckingBalance) {
    this.checkingBalance += addCheckingBalance;
    bankTotal += addCheckingBalance;
    return this.checkingBalance;
  }

  // Create a method that will allow a user to deposit money into the savings
  // account - add to total ammount stored
  public double addSavingsBal(double addSavingsBal) {
    this.savingsBalance += addSavingsBal;
    bankTotal += addSavingsBal;
    return this.savingsBalance;
  }

  // Create a method to withdraw money from one balance. Do not allow to withdraw
  // if there are insufficient funds
  public void withdrawBalance(double withdrawAmnt) {
    if (this.checkingBalance - withdrawAmnt >= 0) {
      this.checkingBalance -= withdrawAmnt;
      bankTotal -= withdrawAmnt;
    } else {
      System.out.println("Not enough funds!");
    }
    // return this.checkingBalance;

  }

  // Create a method to see the total money from the checking and savings
  public double showAllBal() {
    double accBal = this.checkingBalance + this.savingsBalance;
    return accBal;
  }

  public static void showBankTotal(){
    System.out.println("Bank Balance: $" + bankTotal);
  }

  public static void totalAccounts(){
    System.out.println("Total accounts: " + totalAccounts);
  }
}