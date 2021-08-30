import java.util.Scanner;

public class ThirtyLetterAtATime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int countA = 0;
		System.out.println("Enter first side length");
		Scanner scan = new Scanner(System.in);
		String message = scan.next();
		int messageLength = message.length();
		for(int i = 0; i<messageLength; i++) {
			if(message.charAt(i) == 'a') {
				countA++;
			}
		}
		System.out.println("Total characters in message are" + messageLength);
		System.out.println("First character is " + message.charAt(0) + " and the last character is " + message.charAt(messageLength-1) + " and it's position is " + messageLength);
		System.out.println("Character 'a' is present" + countA + "times in the message");
	}

}
