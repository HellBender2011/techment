import java.util.Scanner;

public class ThirtynineMatrixAddition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the length of row");
		Scanner scan = new Scanner(System.in);
		int rowLength = scan.nextInt();
		System.out.println("Enter the length of column");
		int columnLength = scan.nextInt();
	
		int [][] array1 = new int [rowLength][columnLength];
		int [][] array2 = new int [rowLength][columnLength];
		int [][] sum = new int [rowLength][columnLength];
		int i;
		int j;


		System.out.println("Enter the elements of first matrix");
		  for (i = 0; i < rowLength; ++i)
		    for (j = 0; j < columnLength; ++j) {
		    	System.out.println("Enter element " + (i + 1) + (j + 1));
		    	array1[i][j] = scan.nextInt();
		    }

			System.out.println("Enter the elements of second matrix");
			  for (i = 0; i < rowLength; ++i)
			    for (j = 0; j < columnLength; ++j) {
			    	System.out.println("Enter element " + (i + 1) + (j + 1));
			    	array2[i][j] = scan.nextInt();
			    }

		  for (i = 0; i < rowLength; ++i)
		    for (j = 0; j < columnLength; ++j) {
		      sum[i][j] = array1[i][j] + array2[i][j];
		    }


		  System.out.println("Sum of two matrices");
		  for (i = 0; i < rowLength; ++i)
		    for (j = 0; j < columnLength; ++j) {
				System.out.println(sum[i][j]);
		      if (j == columnLength - 1) {
				  System.out.println();
		      }
		    }
	}

}
