public class BankAccount{
    private double checkingBalance;
    private double savingsBalance;
    private static int numOfAccounts = 0;
    private static double totalAmountOfMoney = 0.00;
    // CONSTRUCTOR
    public BankAccount(){
        this.checkingBalance = 0;
        this.savingsBalance = 0;
        numOfAccounts++;
        totalAmountOfMoney += checkingBalance + savingsBalance;
    }
    // CONSTRUCTOR
    public BankAccount(double checkingBalance, double savingsBalance){
        this.checkingBalance = checkingBalance;
        this.savingsBalance = savingsBalance;
        numOfAccounts++;
        totalAmountOfMoney += checkingBalance + savingsBalance;
    }
    //CHECKING BALANCE
    public double getCheckingBalance(){
        return checkingBalance;
    }
    public void depositCheckingBalance(double chckingBalance){
        this.checkingBalance += chckingBalance;
        totalAmountOfMoney += chckingBalance;
    }
    public void withdrawlCheckingBalance(double withdrawl){
        if(this.checkingBalance <= withdrawl){
            System.out.println("Not enough money in your account");
        }else{
            this.checkingBalance -= withdrawl;
            totalAmountOfMoney -= withdrawl;
        }
    }
    // SAVINGS BALANCE
    public double getSavingsBalance(){
        return this.savingsBalance;
    }
    public void depositSavingsBalance(double savingsBalance){
        this.savingsBalance += savingsBalance;
        totalAmountOfMoney += savingsBalance;
    }
    public void withdrawlSavingsBalance(double withdrawl){
        if(this.savingsBalance <= withdrawl){
            System.out.println("Not enough money in your account");
        }else{
            this.savingsBalance -= withdrawl;
            totalAmountOfMoney -= withdrawl;
        }
    }
    // NUMBER OF ACCOUNTS
    public int getNumOfAccounts(){
        return numOfAccounts;
    }
    // TOTAL AMOUNT OF MONEY
    public double getTotalAmountOfMoney(){
        return totalAmountOfMoney;
    }
}