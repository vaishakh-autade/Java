package learn;
import java.util.Scanner;

public class numpatttern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Number ");
		int c = sc.nextInt();
		
		int i,j,n=1;
		
		for(i=0;i<=c;i++)
		{
			for(j=0;j<=c-i;j++)
			{
				System.out.print(" ");
			}
			for(j=0;j<i;j++)
			{
				System.out.print(n + " ");
				n++;
			}
			System.out.println();
		}
	}

}
