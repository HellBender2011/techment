
public class classs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//star 1
			for(int i = 0; i<4; i++) {
				for(int j = 0; j<i; j++) {
				System.out.println("* ");
			}System.out.println();
		}
			
		//star 2
			for(int i = 0; i<4; i++) {
				for(int j = 1; j<=i; j++) {
				System.out.println(j);
			}System.out.println();
		}
		
		//star 4
			for(int i = 1; i<4; i++) {
				for(int j = 0; j<i; j++) {
				System.out.print(i + j);
			}System.out.println();
		}
			
		//star 5
			for(int i = 0; i<4; i++) {
				for(int j = 0; j<i; j++) {
					if(j == i-1) {
						System.out.print("*");
	                } else {
	                	System.out.print(" ");
	                }
			}System.out.println();
		}
			
		//star 3
			for(int i = 0; i<5; i++) {
				for(int j = 0; j<5; j++) {
					if((i == 0) || (i == 4)) {
						System.out.println("*****");
	                } else if ( (j == 0) || (j == 4)){
	                	System.out.print("*");
	                } else {
	                	System.out.print(" ");
	                }
			}System.out.println();
		}
	}

}
