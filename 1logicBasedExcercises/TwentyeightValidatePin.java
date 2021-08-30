import java.util.Scanner;

public class TwentyeightValidatePin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter your PIN number");
		Scanner scan = new Scanner(System.in);
		int pin = scan.nextInt();
		while(pin != 12345) {
			System.out.println("wrong");
			System.out.println("Enter your PIN number");
			pin = scan.nextInt();
		}System.out.println("PIN accepted");
		
	}

}
