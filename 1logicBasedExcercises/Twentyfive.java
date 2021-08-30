class Star extends Thread {

	public void show()
	{
		System.out.println("*");

			try {
				Thread.sleep(500);
			}
			catch (Exception e) {
			}
}
 
class Dollar extends Thread {

	public void show()
	{
			System.out.println("$");

			try {
				Thread.sleep(1000);
			}
			catch (Exception e) {
			}
		}
	}

public class Twentyfive {

	public static void main(String[] args) {

		// Creating objects in the main() method
		Star obj1 = new Star();
		Dollar obj2 = new Dollar();

		// Starting the thread objects
		obj1.start();
		obj2.start();

		// Calling methods of class 1 and class 2
		obj1.show();
		obj2.show();
	}
}
