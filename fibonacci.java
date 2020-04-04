package learn;
import java.util.Scanner;

public class fibonacci {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number of terms required to print fibonacci series");
		int t = sc.nextInt();
		
		int a=0,b=1,c=0;
		
		System.out.print("0 1");
		
		for(int i = 0; i< t-2 ; i++)
		{
			c = a+b;
			a=b;
			b=c;
			System.out.print(" " + c);
		}
		
	}

}
