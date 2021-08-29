import java.util.Scanner;
import java.util.Arrays;
public class inputAndsort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] array = new int [10];
		Scanner scan = new Scanner(System.in);
		for(int i = 0; i<10; i++) {
			System.out.println("Enter the array element");
			array[i] = scan.nextInt();
		}
        Arrays.sort(array);
        System.out.printf("sorted array" + Arrays.toString(array));
	}

}
