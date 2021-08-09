import java.util.Scanner;

public class arraySearch {

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
		System.out.println("Enter the search element");
		int searchElement = scan.nextInt();
		for(int i = 0; i<lengthOfArray; i++) {
			if(array[i] == searchElement) {
				count++;
				System.out.println("Index of searched element is" + i);
				break;
			};
		}
		if(count == 0) {
			System.out.println("-1");
		}
	}

}
