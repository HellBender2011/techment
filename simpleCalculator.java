
public class simpleCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static float calculator(int num1, char opr, int num2) {
	    switch(opr) {  
	    	case '+':
	    		System.out.println(num1 + num2);  
	    		break;  
	    	case '-':
	    		System.out.println(num1 - num2);  
	    		break;  
	    	case '*':
	    		System.out.println(num1 * num2);  
	    		break;  
	    	case '/':
	    		System.out.println(num1 / num2);  
	    		break;  
	    	default:
	    		System.out.println("Invalid operator");  
	    }
	}
}