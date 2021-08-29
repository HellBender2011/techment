import java.util.ArrayList;
import java.util.Scanner;

public class FourteenTotalStock {
		Scanner scan = new Scanner(System.in);
		
		int totalItems = 0;

		ArrayList<Integer> items = new ArrayList<Integer>();

		System.out.println("Do you want to add new Item ?");
		
		String more = scan.nextLine();
		
		while(more == "Yes"){
			int newItem = scan.nextInt();
			items.add((int)newItem);
			totalItems += (int)newItem;
			System.out.println("Do you want to add new Item ?");
			more = scan.nextLine();
		}

		System.out.println("Total items " + totalItems);
}
