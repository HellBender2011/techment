
public class trafficCongestion {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		isEven(30);
	}
	public static void isEven(int Date) {
		if(Date>=1 && Date<=31) {
			if(Date%2 == 0) {
				System.out.println("Cars with Even registration numbers are permitted today");
			}else {
				System.out.println("Cars with Odd registration numbers are permitted today");
			}
		}else {
			System.out.println("Invalid Input");
		}
	}
}
