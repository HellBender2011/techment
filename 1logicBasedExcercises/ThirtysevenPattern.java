import java.util.Scanner;

public class ThirtysevenPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter number");
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		
        for(int i = 0; i<10; i+=2) {
        	for(int j = i/2; j>= 1; j--) {
        		System.out.print(j);
        		}
        
        	for(int j = 2; j<=i/2; j++) {
        		System.out.print(j);
        		}
        	System.out.println();
        }

        for(int k = 10; k>0; k-=2) {
        	for(int l = i/2; l>= 1; l--) {
        		System.out.print(l);
        		}
        	for(int l = 2; l<=k/2; l++){
        		System.out.print(l);
        		}
        	System.out.println();

        }
	}
}
