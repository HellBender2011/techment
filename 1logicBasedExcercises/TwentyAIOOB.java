import java.util.Scanner;

public class TwentyAIOOB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int count = 0;
			System.out.println("Enter the length of array");
			Scanner scan = new Scanner(System.in);
			int lengthOfArray = scan.nextInt();
		
			int [] array = new int [lengthOfArray];
		
			for(int i = 0; i<lengthOfArray; i++) {
				System.out.println("Enter the number");
				array[i] = scan.nextInt();
				}
		try {
			System.out.println("Enter the search element index");
			int searchElement = scan.nextInt();
			System.out.println("Searched element is" + array[searchElement]);
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("search element index is greater than the length of array, enter lower number");
		}
		
		

	}

}
