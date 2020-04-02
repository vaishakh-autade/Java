package learn;
import java.util.Scanner;

 public class calc {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first operand");
		int a = sc.nextInt();
		
		System.out.println("Enter first operand");
		int b = sc.nextInt();
		
		System.out.println("Enter the operator");
		sc.nextLine();
		char op = sc.nextLine().charAt(0);
		
		int res=0;
		
		switch(op)
		{
		case '+' : res = a + b;
					break;
		case '-' : res = a - b;
					break;
		case '*' : res = a * b;
					break;
		case '/' : res = a / b;
					break;
		default : System.out.println("Invalid Operator");
		}
		
		System.out.println("Result = " + res);
		// TODO Auto-generated method stub

	}

}
