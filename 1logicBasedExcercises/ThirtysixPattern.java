import java.util.Scanner;

public class ThirtysixPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter number");
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		
        for(int i = number; i>0; i-=2) {
        	for(int j = 1; j<=i/2; j++) {
        		System.out.print(j);
        		}
        	for(int j = i/2; j>= 1; j--) {
        		System.out.print(j);
        		}
        	System.out.println();
        }
	}
}
