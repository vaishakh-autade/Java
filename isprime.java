package learn;
import java.util.Scanner;

public class isprime {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a positive number to check weather its prime or not");
		int x = sc.nextInt();
		//int z=x/2;
		
		boolean pri = true;
		
		for(int i=2 ; i*i<x ;i++)
		{
			if(x % i == 0 )
			{	pri = false;
				//System.out.println(pri);
				break;
			}
				
		}
		
		if(x<2)
			{ 	pri=false;
			}
		
		System.out.println(x + " is prime = " + pri);
		
//		while(i <= x/2)
//        {
//            // condition for nonprime number
//            if(x % i == 0)
//            {
//                pri = true;
//                break;
//            }
//
//            ++i;
//        }
//
//        if (!pri)
//            System.out.println(x + " is a prime number.");
//        else
//            System.out.println(x + " is not a prime number.");
	}

}
