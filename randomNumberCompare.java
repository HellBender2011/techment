import java.util.Random; 
public class randomNumberCompare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();   
		// Generates random integers 0 to 49  
		int number1 = random.nextInt();
		int number2 = random.nextInt();
		if(number1 == number2) {
			System.out.println("The Random numbers were the same");
		}else {
			System.out.println("The Random numbers were different");
		}
	}

}
