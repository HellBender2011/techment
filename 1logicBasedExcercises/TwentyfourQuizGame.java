import java.util.HashMap;
import java.util.Scanner;

public class TwentyfourQuizGame {

	String question;
	String option1;
	String option2;
	String option3;
	String option4;
	String correctAnswer;
	
	
	public TwentyfourQuizGame(String question, String option1, String option2, String option3, String option4,
			String correctAnswer) {
		super();
		this.question = question;
		this.option1 = option1;
		this.option2 = option2;
		this.option3 = option3;
		this.option4 = option4;
		this.correctAnswer = correctAnswer;
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		TwentyfourQuizGame q1 = new TwentyfourQuizGame("what is the first alphabet of english ?", "A", "B", "C", "D", "D");
		HashMap<Integer,TwentyfourQuizGame> map=new HashMap<Integer,TwentyfourQuizGame>();
		map.put(1, q1);
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter question id");
		
		int more = scan.nextInt();
		
		TwentyfourQuizGame question1 = map.get(more);
		
		String q = question1.question;
		System.out.println("Enter question id");
		
		String a1 = question1.option1;
		System.out.println("Enter question id");
		
		String a2 = question1.option2;
		System.out.println("Enter question id");
		
		String a3 = question1.option3;
		System.out.println("Enter question id");
		
		String a4 = question1.option4;
		System.out.println("Enter question id");
		
		
		System.out.println("Answer");
		
		String ans = scan.nextLine();

		if(ans == question1.correctAnswer) {
			System.out.println("Correct Answer");
		}else {
			System.out.println("Incorrect Answer");
		}
	}
}
