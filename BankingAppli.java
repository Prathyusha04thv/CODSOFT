package atmInterface;

import java.util.Scanner;

public class BankingAppli extends UserAccount{
	Scanner sc=new Scanner(System.in);
	 public void deposition() 
	    {
	    	System.out.println("Enter deposition amount: ");
	    	double amount=sc.nextDouble();
	    	if(amount>=0)
	    	    balance+=amount;
	    	else
	    		System.out.println("Please deposit valid amount");
	    }
	    public void withDrawal() 
	    {
	    	System.out.println("Enter withdrawal amount: ");
	    	double amount=sc.nextDouble();
	    	if(amount<=balance && amount>=0)
	    		balance-=amount;
	    	else
	    		System.out.println("Please withdraw valid amount");
	    }
	    public void checkBalance() 
	    {
	    	System.out.println("Balance amount: "+balance);
	    }

}
