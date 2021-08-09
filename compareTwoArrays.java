import java.util.Scanner;

public class compareTwoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int isEqualCount = 0;
		System.out.println("Enter the size of the array");
		Scanner scan = new Scanner(System.in);
		int sizeOfArray = scan.nextInt();
		int array1[]=new int[sizeOfArray];
		for(int i = 0; i<sizeOfArray; i++) {
			int array1Element = scan.nextInt();
			array1[i] = array1Element;
		}
		
		int array2[]=new int[sizeOfArray];
		for(int j = 0; j<sizeOfArray; j++) {
			int array2Element = scan.nextInt();
			array1[j] = array2Element;
		}
		
		for(int k = 0; k<sizeOfArray; k++) {
			if(array1[k] != array2[k]) {
				isEqualCount++;
			}
		}
		if(isEqualCount == 0) {
			System.out.println("the arrays are same");
		}else {
			System.out.println("the arrays are different");
		}
	}

}
