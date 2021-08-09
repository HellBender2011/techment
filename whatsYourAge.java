
import java.text.SimpleDateFormat;
import java.util.*;

public class whatsYourAge {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
	    System.out.println("Enter date in following format -> yyyy-mm-dd");
	    Scanner scanner = new Scanner(System.in);
	    String date = scanner.nextLine();
	    Date date1=new SimpleDateFormat("yyyy-MM-dd").parse(date);  
	    System.out.println(date1);
	    Date objDate = new Date(); // Current System Date and time is assigned to objDate
	    System.out.println(objDate);
	}

}