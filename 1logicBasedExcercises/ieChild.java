
public class ieChild extends ieParent {
	
	String firstName;
	
	public ieChild(String lastname, String firstName) {
		super(lastname);
		// TODO Auto-generated constructor stub
		this.firstName = firstName;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ieChild a = new ieChild("firstname", "lastname");
		System.out.println(a.toString());
		a.sendMoney(1000);
	}
	

}
