package learn;
import java.util.Scanner;

public class pattern {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number of rows");
		int c = sc.nextInt();
		int i,j;
		for(i=1;i<=c;i++)
		{
			for(j=1;j<=i-1;j++)
			{
				System.out.print("  ");
			}
			for(j=1;j<=c-i+1;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
