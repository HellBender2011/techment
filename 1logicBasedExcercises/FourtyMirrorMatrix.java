import java.util.Scanner;

public class FourtyMirrorMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the length of row");
		Scanner scan = new Scanner(System.in);
		int rowLength = scan.nextInt();
		System.out.println("Enter the length of column");
		int columnLength = scan.nextInt();
	
		int [][] array1 = new int [rowLength][columnLength];
		int [][] mirror = new int [rowLength][columnLength];
		int i;
		int j;


		System.out.println("Enter the elements of first matrix");
		  for (i = 0; i < rowLength; ++i)
		    for (j = 0; j < columnLength; ++j) {
		    	System.out.println("Enter element " + (i + 1) + (j + 1));
		    	array1[i][j] = scan.nextInt();
		    }


		  for (i = 0; i < rowLength; ++i)
		    for (j = 0; j < columnLength; ++j) {
		      mirror[rowLength-i][j] = array1[i][j] ;
		    }


		  System.out.println("mirror matrix");
		  for (i = 0; i < rowLength; ++i)
		    for (j = 0; j < columnLength; ++j) {
				System.out.println(mirror[i][j]);
		      if (j == columnLength - 1) {
				  System.out.println();
		      }
		    }
	}

}