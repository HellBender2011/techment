import java.util.Scanner;

class InvalidAgeException extends Exception{  
 InvalidAgeException(String s){  
  super(s);  
 }  
}  

public class SeventeenCustomException {
	static void validate(int age)throws InvalidAgeException{  
	     if(age<18) {
	    	 throw new InvalidAgeException("not valid");  
	     }else { 
	      System.out.println("welcome to vote");  
	   }
	}  
	public static void main(String args[]){  
	    try {
			System.out.println("Enter your age"); 
			Scanner scan = new Scanner(System.in);
			int age = scan.nextInt();
	    	validate(age);  
	    }catch(Exception m){
	    	System.out.println("Exception occured: "+m);
	    }
	}
}
