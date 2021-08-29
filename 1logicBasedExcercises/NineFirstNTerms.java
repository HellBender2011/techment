import java.util.Scanner;

public class NineFirstNTerms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the number of terms");
		Scanner scan = new Scanner(System.in);
		int numberOfTerms = scan.nextInt();
		for(int i = 0; i <numberOfTerms; i++) {
			System.out.println(i*i*i);
		}

	}

}
