package learn;

public class ternary {

	public static void main(String[] args) {
		
		int a = 10, b = 200 , c = 25;
		int result;
		
		result = a>b  ?  a>c ? a : c : b>c ? b : c;
		
		System.out.println("biggest number among them if " + result);
	}

}
