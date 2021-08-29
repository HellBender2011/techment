
public class FourLeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static int isLeap(int year){
		if ((year%400 == 0) || ((year%4 == 0) && (year%100 != 0))) {
			System.out.println(year + " is a Leap Year");
		}
		else {
			System.out.println(year + " is NOT a Leap Year");
		}
	}

}
