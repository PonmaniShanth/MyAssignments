package homeassignmentweek3.day2;

public class JavaConnection implements DatabaseConnection{
	
@Override
	public void connect() {
	System.out.println("Connect method is executed");
		
		
	}

	@Override
	public void disconnect() {
		System.out.println("Disconnect method is executed");
		
	}

	@Override
	public void executeUpdate() {
	System.out.println("Execute and update method is executed");
	}
	public static void main(String[] args) {
		JavaConnection db = new JavaConnection();
		db.connect();
		db.disconnect();
		db.executeUpdate();
	
	}

}
