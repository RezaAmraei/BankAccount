public class TestBankAccount {
    public static void main(String[] args){
        BankAccount user1 = new BankAccount(10.0, 12.0);
        System.out.println(user1);
        System.out.println(user1.getNumOfAccounts());
        System.out.println(user1.getSavingsBalance());
        System.out.println(user1.getTotalAmountOfMoney());
        user1.depositSavingsBalance(20.0);
        System.out.println(user1.getSavingsBalance());
        System.out.println(user1.getTotalAmountOfMoney());
    }
}
