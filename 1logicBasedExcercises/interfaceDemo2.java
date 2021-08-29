class car{
	String name;
	int model;
	engine Engine;
	void displayCarInfo() {
		System.out.println("name :"+ name);
		System.out.println("model :"+ model);
		System.out.println("engineNo :"+ engine.engineNo);
		System.out.println("engineType :"+ engine.engineType);
	}
}


class engine {
	public engine(int engineNo, String engineType) {
		super();
		this.engineNo = engineNo;
		this.engineType = engineType;
	}
	int engineNo;
	String engineType;
}

public class interfaceDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		car car = new car("audi", "r8");
		engine engine = mew engine(1, "2stroke");
		car.displayCarInfo();

	}

}
