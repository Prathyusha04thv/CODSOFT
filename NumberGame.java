package codsoft;
import java.util.*;
public class NumberGame {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		double ranNum=Math.random();
		int num=(int)(ranNum*100);
		while(true)
		{
			System.out.println("Enter user's choice: ");
			int genNum=s.nextInt();
            if(genNum==num)
            {
            	System.out.println("Correct");
            	break;
            }
            else if(genNum>num)
            {
            	System.out.println("genNum is too high");
            }
            else
            {
            	System.out.println("genNum is too low");
            }
		}
		
	}

}
