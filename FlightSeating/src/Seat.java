
public class Seat {
	public boolean avbl;
	public String aisleOrWindow;				//values are "A", "W", or "N"
	public int seatNum;
	private Customer cus;
	
	public Seat(int seatNum){
		this.seatNum = seatNum;
		avbl = true;
	}
	
	public void changeAvbl(){
		if(avbl) avbl = false;
		else avbl = true;
	}

	public String getAisleOrWindow() {
		return aisleOrWindow;
	}

	public void setAisleOrWindow(String aisleOrWindow) {
		this.aisleOrWindow = aisleOrWindow;
	}

	public Customer getCus() {
		return cus;
	}

	public void setCus(Customer cus) {
		this.cus = cus;
	}

	public boolean isAvbl() {
		return avbl;
	}

	public void setAvbl(boolean avbl) {
		this.avbl = avbl;
	}

	public int getSeatNum() {
		return seatNum;
	}

	public void setSeatNum(int seatNum) {
		this.seatNum = seatNum;
	}
	
	public String toString(){
		if(isAvbl()) return "[A]";
		else return "[0]";
	}
}