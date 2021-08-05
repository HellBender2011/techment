
public class classConstructor {
    int id;
    String name;
    int contact;
    int minBalance;

    classConstructor(int id, String name, int contact, int minBalance) {
        // TODO Auto-generated constructor stub
        this.id = id;
        this.name = name;
        this.contact = contact;
        this.minBalance = minBalance;
        
    }
    
    public void displayCustomerDetails() {
        System.out.println("id " + id);
        System.out.println("name " + name);
        System.out.println("contact " + contact);
        System.out.println("minBalance " + minBalance);
    }
    
    public String checkAccountTypes() {
        if(this.minBalance == 0) {
            System.out.println("zero balance account");
            return "zero balance account";
        }else if(this.minBalance == 1000) {
            System.out.println("savings bank account");
            return "savings bank account";
        }else if(this.minBalance == 10000) {
            System.out.println("current bank account");
            return "current bank account";
        }return "aa";
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        classConstructor customer1 = new classConstructor(1, "aa", 1, 0);
        classConstructor customer2 = new classConstructor(2, "bb", 2, 1000);
        classConstructor customer3 = new classConstructor(3, "cc", 3, 10000);
        customer1.displayCustomerDetails();
        customer1.checkAccountTypes();
    }

}