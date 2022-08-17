public class SavingsAccount {
    private String accountHolderName;
   private Long accountNumber;
   private String accountOpeningDate;
   private String accountStatus;
   private double availableBalance;
  private double totalBalance;
   private double interestRate;
   private String modeOfOperation;

   public String getAccountHolderName() {
      return accountHolderName;
   }

   public void setAccountHolderName(String accountHolderName) {
      this.accountHolderName = accountHolderName;
   }

   public Long getAccountNumber() {
      return accountNumber;
   }

   public void setAccountNumber(Long accountNumber) {
      this.accountNumber = accountNumber;
   }

   public String getAccountOpeningDate() {
      return accountOpeningDate;
   }

   public void setAccountOpeningDate(String accountOpeningDate) {
      this.accountOpeningDate = accountOpeningDate;
   }

   public String getAccountStatus() {
      return accountStatus;
   }

   public void setAccountStatus(String accountStatus) {
      this.accountStatus = accountStatus;
   }

   public double getAvailableBalance() {
      return availableBalance;
   }

   public void setAvailableBalance(double availableBalance) {
      this.availableBalance = availableBalance;
   }

   public double getTotalBalance() {
      return totalBalance;
   }

   public void setTotalBalance(double totalBalance) {
      this.totalBalance = totalBalance;
   }

   public double getInterestRate() {
      return interestRate;
   }

   public void setInterestRate(double interestRate) {
      this.interestRate = interestRate;
   }

   public String getModeOfOperation() {
      return modeOfOperation;
   }

   public void setModeOfOperation(String modeOfOperation) {
      this.modeOfOperation = modeOfOperation;
   }
   public double retrieveBalance(){
      return availableBalance;
   }
   public double debitBalance(int withdrawlamount){
      return availableBalance - withdrawlamount;

   }
   public double creditBalance(int creditamount){
      return availableBalance + creditamount;

   }
   public void accountHolderDetails(){
       System.out.println("account holder name = " + accountHolderName);
       System.out.println("account number = " + accountNumber);
       System.out.println("account opening date = " + accountOpeningDate);
       System.out.println("account status = " + accountStatus);
       System.out.println("interest rate = " + interestRate);
       System.out.println("mode of operation = " + modeOfOperation);

    }
}
