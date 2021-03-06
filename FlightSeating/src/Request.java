import java.util.*;

public class Request {
	public Date date;
	public int rowNum;
	public int seatNum;
	public String type;

}

class SelectRequest extends Request{
	private String preference;
	private String busOrEco;
	private String consecutive;
	private String aisleOrWindow;
	private int numOfSeats;
	Scanner keyboard = new Scanner(System.in);
	
	public SelectRequest(){
		System.out.print("Would you like to reserve a single seat or consecutive seats? (S/C): ");
		consecutive = keyboard.next();
		if(consecutive.equalsIgnoreCase("S")){
			System.out.print("Do you have any preference for seating? (Y/N): ");
			preference = keyboard.next();
			if(preference.equalsIgnoreCase("Y")){
				System.out.print("Business or Economy? (B/E): ");
				busOrEco = keyboard.next();
				System.out.print("Aisle or Window seat (or neither)? (A/W/N): ");
				aisleOrWindow = keyboard.next();
			}
		}
		else{
			System.out.print("How many consecutive seats would you like to reserve? ");
			numOfSeats = keyboard.nextInt();
		}
		
	}

	public String getPreference() {
		return preference;
	}

	public void setPreference(String preference) {
		this.preference = preference;
	}

	public String getBusOrEco() {
		return busOrEco;
	}

	public void setBusOrEco(String busOrEco) {
		this.busOrEco = busOrEco;
	}

	public String getConsecutive() {
		return consecutive;
	}

	public void setConsecutive(String consecutive) {
		this.consecutive = consecutive;
	}

	public String getAisleOrWindow() {
		return aisleOrWindow;
	}

	public void setAisleOrWindow(String aisleOrWindow) {
		this.aisleOrWindow = aisleOrWindow;
	}

	public int getNumOfSeats() {
		return numOfSeats;
	}

	public void setNumOfSeats(int numOfSeats) {
		this.numOfSeats = numOfSeats;
	}
	
}

class CancelRequest extends Request{
	Scanner keyboard = new Scanner(System.in);
	
	public CancelRequest(){
		System.out.print("Please enter your row number: ");
		rowNum = keyboard.nextInt();
		System.out.print("Please enter your seat number: ");
		seatNum = keyboard.nextInt();
	}
	
}