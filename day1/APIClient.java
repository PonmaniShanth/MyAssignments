package homeassignmentweek3.day1;

public class APIClient {
	public String sendRequest(String endPoint) {
		String ep = "endPoint";
		System.out.println(ep);
		return endPoint;
	}
		
public void sendRequest(String endPoint, String requestBody, boolean requestStatus)	{
	String rb = "requestBody";
	System.out.println(rb);
	String ep = "endPoint";
	boolean status = true;
	System.out.println(status);
	
	}
public static void main(String[] args) {
	APIClient o = new APIClient();
	o.sendRequest("rb");
	o.sendRequest("rb","ep", false);
}
}
	

