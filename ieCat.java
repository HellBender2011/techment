
public class ieCat extends ieAnimal {

	String sound;
	
	public ieCat(int legs, String sound) {
		super(legs);
		// TODO Auto-generated constructor stub
		this.sound = sound;	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ieCat cat = new ieCat(4, "meow");
		cat.waggingTail();

	}
}
