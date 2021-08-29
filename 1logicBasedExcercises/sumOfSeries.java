import java.util.Scanner;

public class sumOfSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		System.out.println("Enter number of terms");
		Scanner scan = new Scanner(System.in);
		int terms = scan.nextInt();
		for(int i = 1; i<terms+1; i++) {
			sum += 1/factorial(i);
		}
		System.out.println("sum of the terms is" + sum);

	}
	 static int factorial(int n){    
		  if (n == 0)    
		    return 1;    
		  else    
		    return(n * factorial(n-1));    
		 }   

}
