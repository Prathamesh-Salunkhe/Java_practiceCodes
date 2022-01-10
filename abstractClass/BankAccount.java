package abstractClass;

import polymorphism.Main;

//abstract parent class
public abstract class BankAccount {
	String accountNo;
    public abstract void deposit();
    public  abstract void withdraw();
    
    public void OpenAccount() {
    	System.out.println("Openning an account");
    }
}
public  class SavingAccount extends BankAccount {
        public SavingAccount(String accNo) 
        	{
        	super()
        }

	
	
	@Override
	public void deposit() {
	   System.out.println("Deposit in saving acc");
	   
   }

   @Override
  	public void withdraw() {
  	   System.out.println("Withdraw from Saving acc");
  	   
     }

}

public class MainAbstractClass() {
	public static void main(String[] args)
{
		SavingAccount sa=new SavingAccount();
		sa.OpenAccount();
		}
}