import java.util.ArrayList;
import java.util.Scanner;

public class TwentyoneProductCatalogue {
	private int id;
	private String name;
	private float price;
		
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	
	public void setName(String name) {
		this.name = name;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}
	
	public TwentyoneProductCatalogue(int id, String name, float price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}

	public TwentyoneProductCatalogue() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<TwentyoneProductCatalogue> items = new ArrayList<TwentyoneProductCatalogue>();
	
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Do you want to add new Item ?");
		
		String more = scan.nextLine();

		while(more == "Yes"){
			TwentyoneProductCatalogue i = new TwentyoneProductCatalogue();
			
			System.out.print("Enter id :");
			int id = scan.nextInt();
			i.setId(id);
			
			System.out.print("Enter name :");
			String name = scan.next();
			i.setName(name);
			
			System.out.print("Enter price :");
			float price = scan.nextFloat();
			i.setPrice(price);
			
			items.add(i);
			
			System.out.println("Do you want to add new Item ?");
			more = scan.nextLine();
		}

		System.out.print("Enter the id of product for searching :");
		int SearchId = scan.nextInt();

		for(TwentyoneProductCatalogue j:items) {
			if(j.getId() == SearchId) {
				System.out.println("Id :" + j.getId());
				System.out.println("Name :" + j.getName());
				System.out.println("Price :" + j.getPrice());
			}
		}
	}
}
