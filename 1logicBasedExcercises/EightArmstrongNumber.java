
public class EightArmstrongNumber {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isArmstrong(100));
	}
	static boolean isArmstrong(int Num) {
		int sum = 0;
		int nextDigit;
		int temp;
		temp = Num;
		while(Num>0) {
			nextDigit = Num%10;
			Num = Num/10;
			sum = sum + (nextDigit*nextDigit*nextDigit);
		}
		if(temp == sum) {
			return true;
		}
		return false;
	}

}
