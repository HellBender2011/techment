import java.util.Scanner;

public class ThirtyfourPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter number");
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		
	      for(int i = 1; i<=number; i++){
	          for(int j = number; j>=i; j--){
	          System.out.print(j);
	          }System.out.println();
	      }
	}

}
