import java.util.Scanner;

public class Customer {
	private String lName;
	private String fName;
	private String flightNum;
	private String travelDate;
	private Request request;
	private String requestType;
	Scanner keyboard = new Scanner(System.in);
	
	public Customer(String lName, String fName, String flightNum, String travelDate){
		this.lName = lName;
		this.fName = fName;
		this.travelDate = travelDate;
		this.flightNum = flightNum;
		request = makeRequest();
	}
	
	public Request makeRequest(){ //precondition: request == null, postcondition: request != null
		System.out.print("Choose either select or cancel seating (S/C): ");
		requestType = keyboard.next();
		if(requestType.equalsIgnoreCase("S")) request = new SelectRequest();
		else request = new CancelRequest();
		return request;
	}

	public String getRequestType() {
		return requestType;
	}

	public void setRequestType(String requestType) {
		this.requestType = requestType;
	}

	public Request getRequest() {
		return request;
	}

	public void setRequest(Request request) {
		this.request = request;
	}

}
