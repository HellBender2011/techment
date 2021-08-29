import java.util.Scanner;

public class heronsFormula {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter first side length");
		Scanner scan = new Scanner(System.in);
		int sideA = scan.nextInt();
		System.out.println("Enter second side length");
		int sideB = scan.nextInt();
		System.out.println("Enter third side length");
		int sideC = scan.nextInt();
		int s = (sideA+sideB+sideC)/3;
		double Area = Math.sqrt(s*(s-sideA)*(s-sideB)*(s-sideC));
		System.out.println("Area of the triangle is" + Area);
	}

}
