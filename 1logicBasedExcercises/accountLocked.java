import java.util.Scanner;

public class accountLocked {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		System.out.println("Enter your PIN number");
		Scanner scan = new Scanner(System.in);
		int pin = scan.nextInt();
		while(pin != 12345) {
			count++;
			System.out.println("wrong");
			System.out.println("Enter your PIN number");
			pin = scan.nextInt();
			if(pin == 12345) {
				System.out.println("PIN ACCEPTED. YOU NOW HAVE ACCESS TO YOUR ACCOUNT");
				break;
			}else if(count>2) {
				System.out.println("YOU HAVE RUN OUT OF TRIES. ACCOUNT LOCKED");
			}
		}
	}

}
