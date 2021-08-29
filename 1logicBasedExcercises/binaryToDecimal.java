import java.util.Scanner;

public class binaryToDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int digit = 0;
		int sum = 0;
		System.out.println("Enter number");
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		int lengthOfInt = String.valueOf(number).length();
		for(int i = 0; i<lengthOfInt; i++) {
			digit = number%10;
			number = number/10;
			sum += digit * Math.pow(2, i);
		}
		System.out.println("decimal number is" + sum);

	}

}
