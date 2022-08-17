public class SavingsAccountImpl {
    public static void main(String[] args){
        SavingsAccount object = new SavingsAccount();
        object.setAccountHolderName("nikhil");
        object.setAccountNumber(1234556789L);
        object.setAccountStatus("active");
        object.setAccountOpeningDate("24/05/2004");
        object.setModeOfOperation("self operated");
        object.setInterestRate(5);
        object.setAvailableBalance(4000);
        object.setInterestRate(5);
        object.accountHolderDetails();
        System.out.println("retrieve balance = " + object.retrieveBalance());
        System.out.println("updated balance after debiting = " + object.debitBalance(400));
        System.out.println("updated balance crediting = " + object.creditBalance(500));


    }
}
