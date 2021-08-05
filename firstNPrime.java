import java.util.Scanner;

public class firstNPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter number of terms");
		Scanner scan = new Scanner(System.in);
		int numberOfTerms = scan.nextInt();
		int count = 0;
		int i = 0;
		while(count<numberOfTerms) {
			if(isPrime(i)) {
				System.out.println(i);
				count++;
			}i++;
		}
	}
	
	public static boolean isPrime(int n) {  
	       if (n <= 1) {  
	           return false;  
	       }  
	       for (int i = 2; i < Math.sqrt(n); i++) {  
	           if (n % i == 0) {  
	               return false;  
	           }  
	       }return true;  
	   }  

}
