import java.util.Scanner;

public class SixteenDivisibleBy8And3Both {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number");
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		if((number%3 == 0) && (number%5 == 0)) {
			System.out.println("number is divisible by 8 & 3 both");
		}else {
			System.out.println("number is not divisible by 8 & 3 both");
		}

	}

}
