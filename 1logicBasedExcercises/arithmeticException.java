import java.util.Scanner;

public class arithmeticException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter integer a"); 
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		System.out.println("Enter integer b"); 
		int b = scan.nextInt();
		try {
			int aExpression=a/b;  
			System.out.println("quotient is" + aExpression);  
        }catch(ArithmeticException e) {  
            System.out.println(e);  
        }finally {  
        	System.out.println("Inside finally block");  
        }      
	}

}
