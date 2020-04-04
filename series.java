package learn;
import java.util.Scanner;

public class series {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number of terms required ");
		double n = sc.nextDouble();
		
		double z=0;
		
		for(double i=1;i<=n;i++)
		{
			z+=(1/i);
			System.out.print(z + " + ");
		}
		
		System.out.println("\nSum of above series is " + z);
	}

}
