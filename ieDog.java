
public class ieDog extends ieAnimal {
	
	String sound;
	
	public ieDog(int legs, String sound) {
		super(legs);
		// TODO Auto-generated constructor stub
		this.sound = sound;	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ieDog dog = new ieDog(4, "bark");
		dog.waggingTail();

	}

}
