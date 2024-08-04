package atmInterface;

import java.util.Scanner;

public class AtmMachine {
    
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1 for Deposition");
		System.out.println("Enter 2 for WithDrawal");
		System.out.println("Enter 3 for Check Balance");
		System.out.println("Enter 4 for Exit");
		BankingAppli b=new BankingAppli();
		System.err.println("Current Balance amount:"+b.balance);
		while(true)
		{
			System.out.println("Enter your choice: ");
		    int choice=sc.nextInt();
		    switch(choice)
		    {
		    case 1:b.deposition();
		           break;
		    case 2:b.withDrawal();
		           break;
		    case 3:b.checkBalance();
		           break;
		    case 4:System.out.println("Thank you !!!");
			       System.exit(0);
		    default:System.out.println("Enter valid choice");
		    }
		}

	}
   
}