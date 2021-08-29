import java.util.Scanner;

public class multiplicationTable {

	public static void main(String[] args) {
		System.out.println("Enter number");
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
	      for(int i = 1; i<11; i++) {
	                System.out.println(number + " * " + i + "= " + number*i);
	            }
	    }

}
