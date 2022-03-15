public class CheckingAccount {

    private double balance;
    private String accountNo;

    //Method for CheckingAccount
    public CheckingAccount(String accountNo) {
        // balance and account number fields
        this.accountNo = accountNo;
        this.balance = 0;
    }
    //Method for deposit and withdraw , 
    public void deposit(double amount) throws Exception {
        if (amount <= 0){
            throw new Exception("Please enter positive value");
        } else{
            this.balance += amount;
        }
        
    }

    public void withdraw(double amount) throws InsufficientFundsException , Exception{
        if (this.balance < amount){
            throw new InsufficientFundsException(amount);
        } else if(amount <= 0){
            throw new Exception("Please enter positive value");
        }
        else
        {
            this.balance -= amount;
        }
    }

    //Method to get the balance from the account
    public double getBalance() {
        return this.balance;
    }

    //Method to get the account number 
    public String getNumber() {
        return this.accountNo;
    }
}