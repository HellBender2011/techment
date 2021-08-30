import java.util.Scanner;

public class TwentythreeBmiCalc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the weight in KGs");
		Scanner scan = new Scanner(System.in);
		int weight = scan.nextInt();
		System.out.println("Enter the height in meters");
		int height = scan.nextInt();
		System.out.println("BMI is" + (weight/(height*height)));
	}

}
