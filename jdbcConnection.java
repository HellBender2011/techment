
public interface jdbcConnection {
	void connect();
}

class oracle implements jdbcConnection {

	@Override
	public void connect() {
		// TODO Auto-generated method stub
		System.out.println("connect to oracle");
	}
	
}

class mySQL implements jdbcConnection {

	@Override
	public void connect() {
		// TODO Auto-generated method stub
		System.out.println("connect to mySQL");
	}
	public static void main(String[] args) {
		jdbcConnection connection = new mySQL();
		connection.connect();
	}
	
}