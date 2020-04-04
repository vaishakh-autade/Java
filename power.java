package learn;
import java.util.Scanner;

public class power {

	public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter The Base number followed by Power");
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			int c=1;
			
			for(int i=0;i<b;i++)
			{
				c=c*a;
			}

			System.out.println("Result = " + c);
			
	}

}
