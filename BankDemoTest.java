import java.util.*;
public class BankDemoTest {
    public static void main (String[] args){
        CheckingAccount checkAccount = new CheckingAccount("12345");
        Scanner input = new Scanner(System.in);
        while(true){
            try{
            //Input Deposit
            System.out.print("Enter deposit amount: ");
            double depositAmount = input.nextDouble();
            checkAccount.deposit(depositAmount);
            break;
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
        while(true){
            try{//Input Withdraw
                System.out.print("Enter withdraw amount: ");
                double withdrawAmount = input.nextDouble();
                checkAccount.withdraw(withdrawAmount);
                System.out.println("The balance after withdraw is: $"+ checkAccount.getBalance());
                break;
            //Catch error when balance is insufficient for withdrawal
            }catch(InsufficientFundsException e){
                System.out.println("Sorry, but your account is short by: $"+(e.getAmount() - checkAccount.getBalance()));
            } catch(Exception ex){
                System.out.println(ex.getMessage());
            }
        }   
        input.close();
    }
        
        
    }
