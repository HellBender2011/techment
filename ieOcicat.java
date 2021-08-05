
public class ieOcicat extends ieCat {
	
	String color;

	public ieOcicat(int legs, String sound) {
		super(legs, sound);
		// TODO Auto-generated constructor stub
		this.color = "grey";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ieOcicat cat = new ieOcicat(4, "meow");
		System.out.println(cat.toString());
	}

}
