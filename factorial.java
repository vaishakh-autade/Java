package learn;
import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		 int i,type=1;
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number for factorial");
		int n = sc.nextInt();
				
		for(i=n;i>=1;i--)
		{
			type = type * i;
		}

		System.out.println("factorial of sum is " + type );
	}

}
