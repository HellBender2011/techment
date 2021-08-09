class customer{
	int id;
	String custName;
	int account;
	void displayAccountInfo() {
		System.out.println("id :"+ id);
		System.out.println("custName :"+ custName);
		System.out.println("accountNo :"+ account.accountNo);
		System.out.println("account Type :"+ account.accountType);
		System.out.println("balance :"+ account.balance);
		System.out.println("ifsc :"+ account.ifsc);
		System.out.println("branch :"+ account.branch);
	}
}


class account {
	int accountNo;
	String accountType;
	int balance;
	int ifsc;
	String branch;
	public account(int accountNo, String accountType, int balance, int ifsc, String branch) {
		super();
		this.accountNo = accountNo;
		this.accountType = accountType;
		this.balance = balance;
		this.ifsc = ifsc;
		this.branch = branch;
	}
}

public class interfaceDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		car car = new car("audi", "r8");
		customer customer = new customer(1, "a");
		account account = new account(1, "savings", 100, 1234, "bhilai");
		customer.displayAccountInfo();

	}

}