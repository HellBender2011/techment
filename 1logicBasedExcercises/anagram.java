import java.util.Scanner;

public class anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum1 = 0;
		int sum2 = 0;
		System.out.println("Enter first string");
		Scanner scan = new Scanner(System.in);
		String string1 = scan.next();

		System.out.println("Enter second string");
		String string2 = scan.next();
		
		int length1 = string1.length();
		int length2 = string2.length();
		
		for(int i = 0; i<length1; i++) {
			sum1 +=  (int)string1.charAt(i);
		}
		for(int j = 0; j<length2; j++) {
			sum2 +=  (int)string2.charAt(j);
		}
		
		if((sum1 == sum2) && (length1 == length2)) {
			System.out.println("anagram");
		}else {
			System.out.println("not anagram");
		}
		
	}

}
