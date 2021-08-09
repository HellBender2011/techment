
class employee {
	int id;
	String name;
	address address;//object reference
	public employee(int id, String name, address address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}

	 void displayEmployeeInfo() {
		 System.out.println("id :"+ id);
		 System.out.println("name :"+ name);
		 System.out.println("door no :"+ address.doorno);
		 System.out.println("street name :"+ address.streetName);
		 System.out.println("city :"+ address.city);
		 System.out.println("pin :"+ address.pincode);
	 }
}

class address{
	public address(int i, String string, String string2, int j) {
		// TODO Auto-generated constructor stub
	}
	int doorno;
	String streetName;
	String city;
	int pincode;
}

class hasArelationship{
	
	
public static void main(String[] args) {
	// TODO Auto-generated method stub
	address address = new address(101, "gh", "hj", 132);
	employee.displayEmployeeInfo();
	employee employee = new employee(1, "abcd", address);
}
}
