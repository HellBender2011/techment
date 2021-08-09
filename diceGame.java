import java.util.Random; 
public class diceGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();   
		// Generates random integers 0 to 49  
		int dice1 = random.nextInt(7);
		int dice2 = random.nextInt(7);
		if((dice1%2 == 0) && (dice2%2 == 0)) {
			System.out.println(dice1 + dice2 + "points");
		}else {
			System.out.println(Math.abs(dice1 - dice2) + "points");
		}
	}

}
