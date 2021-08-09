import java.util.Scanner;

public class rightAngledTriangle {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter Side A");
		Scanner scan = new Scanner(System.in);
		int sideA = scan.nextInt();
		System.out.println("Enter Side B");
		int sideB = scan.nextInt();
		System.out.println("Enter Side C");
		int sideC = scan.nextInt();
		if((((sideA*sideA) + (sideB*sideB)) == (sideC*sideC)) || (((sideB*sideB) + (sideC*sideC)) == (sideA*sideA)) || ((sideA*sideA) + (sideC*sideC)) == (sideB*sideB)) {
			System.out.println("Right Angled Triangle");
		}else {
			System.out.println("Not a Right Angled Triangle");
		}
	}
}
