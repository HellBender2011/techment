import java.util.Scanner;

public class fascinatingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter your number");
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		int numberTwice = number*2;
		int numberThrice = number*3;
		int sum = 0;
		
		//number
		sum += number%10;
		number = number/10;
		sum += number%10;
		number = number/10;
		sum += number%10;
		number = number/10;
		
		//numberTwice
		sum += numberTwice%10;
		numberTwice = numberTwice/10;
		sum += numberTwice%10;
		numberTwice = numberTwice/10;
		sum += numberTwice%10;
		numberTwice = numberTwice/10;
		
		//numberThrice
		sum += numberThrice%10;
		numberThrice = numberThrice/10;
		sum += numberThrice%10;
		numberThrice = numberThrice/10;
		sum += numberThrice%10;
		numberThrice = numberThrice/10;
		
		if(sum == 45) {
			System.out.println("It is a fascinating number");
		}System.out.println("It is not a fascinating number");
	}
}
