import java.util.Scanner;

public class triangleFormed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter Side A");
		Scanner scan = new Scanner(System.in);
		int sideA = scan.nextInt();
		System.out.println("Enter Side B");
		int sideB = scan.nextInt();
		System.out.println("Enter Side C");
		int sideC = scan.nextInt();
		if((sideA + sideB > sideC) && (sideB + sideC > sideA) && (sideA + sideC > sideB)) {
			System.out.println("Valid Triangle");
		}else {
			System.out.println("Invalid Triangle");
		}
	}

}
