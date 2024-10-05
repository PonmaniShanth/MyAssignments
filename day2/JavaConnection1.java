package homeassignmentweek3.day2;

public class JavaConnection1 extends MySqlConnection{

	@Override
	public void connect() {
		System.out.println("Connect method is executed");
		
	}

	@Override
	public void disconnect() {
		System.out.println("Disconnect method is executed");
		
	}

	@Override
	public void executeupdate() {
		System.out.println("Execute and update method is executed");
		
	}
	
	@Override
	public void executeQuery() {
		System.out.println("Execute query method is implemented");
		
	}
	public static void main(String[] args) {
		JavaConnection1 jc = new JavaConnection1();
		jc.connect();
		jc.disconnect();
		jc.executeupdate();
		jc.executeQuery();
		
	}

	

}
