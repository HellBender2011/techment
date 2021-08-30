
public class NineteenReversePyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rowCount = 6;
	      for (int i = 0; i < 6; i++) {

	            for (int j = 1; j <= i * 2; j++) {
	                System.out.print(" ");
	            }

	            for (int j = 1; j <= rowCount; j++) {
	                System.out.print(j + " ");
	            }

	            for (int j = rowCount - 1; j >= 1; j--) {
	                System.out.print(j + " ");
	            }

	            System.out.println();
	            rowCount--;
	    }
	}

}
