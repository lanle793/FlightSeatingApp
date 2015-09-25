import java.util.*;

public class FlightSeatingApp {

	public static void main(String[] args) {
		final int NUMOFBUSROW = 2;
		final int NUMOFECOROW = 3;
		String lName = "";
		String fName = "";
		String flightNum = "";
		String travelDate = "";
		
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);
		
		SeatCollection seatCollection = new SeatCollection(NUMOFBUSROW,NUMOFECOROW, "A136");
		Row row1 = new Row(1, 4);
		for(int i = 0; i < 4; i++) row1.addSeat(new Seat(i+1));
		Row row2 = new Row(2, 4);
		for(int i = 0; i < 4; i++) row2.addSeat(new Seat(i+1));
		Row row3 = new Row(3, 4);
		for(int i = 0; i < 4; i++) row3.addSeat(new Seat(i+1));
		Row row4 = new Row(4, 4);
		for(int i = 0; i < 4; i++) row4.addSeat(new Seat(i+1));
		Row row5 = new Row(5, 4);
		for(int i = 0; i < 4; i++) row5.addSeat(new Seat(i+1));
		seatCollection.addRow(row1);
		seatCollection.addRow(row2);
		seatCollection.addRow(row3);
		seatCollection.addRow(row4);
		seatCollection.addRow(row5);
		System.out.println(seatCollection);
		
		System.out.print("Please enter your last name: ");
		lName = keyboard.next();
		System.out.print("Please enter your first name: ");
		fName = keyboard.next();
		System.out.print("Please enter your flight number: ");
		flightNum = keyboard.next();
		System.out.print("Please enter your travel date (DD/MM/YY): ");
		travelDate = keyboard.next();
		
		Customer cus = new Customer(lName, fName, flightNum, travelDate);
		SeatingHandler seatHandler = new SeatingHandler(seatCollection);
		seatHandler.handleRequest(cus);
		System.out.println(seatCollection);
	}

}
