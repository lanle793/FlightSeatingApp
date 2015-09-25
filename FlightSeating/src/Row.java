
public class Row {
	private int rowNum;
	private int rowCap;
	private Seat[] seats;
	private int numAvblSeat;
	private int numElements;
	
	public Row(int rowNum, int rowCap){
		this.rowNum = rowNum;
		this.rowCap = rowCap;
		seats = new Seat[rowCap];
		numAvblSeat = rowCap;
	}
	
	public void addSeat(Seat seat){
		if(numElements < rowCap){
			if(numElements == seats.length/2 || numElements == seats.length/2 - 1)
				seat.setAisleOrWindow("A");
			else if(numElements == 0 || numElements == rowCap - 1)
				seat.setAisleOrWindow("W");
			else seat.setAisleOrWindow("N");
			seats[numElements] = seat;
			numElements++;
		}
	}
	
	public boolean checkAvbl(){
		if(numAvblSeat > 0) return true;
		else return false;
	}
	
	public void lessNumAvblSeat(int numSeats){
		numAvblSeat -= numSeats;
	}
	
	public void plusNumAvblSeat(int numSeats){
		numAvblSeat += numSeats;
	}

	public int getRowNum() {
		return rowNum;
	}

	public void setRowNum(int rowNum) {
		this.rowNum = rowNum;
	}

	public int getRowCap() {
		return rowCap;
	}

	public void setRowCap(int rowCap) {
		this.rowCap = rowCap;
	}

	public Seat[] getSeats() {
		return seats;
	}

	public void setSeats(Seat[] seats) {
		this.seats = seats;
	}

	public int getNumAvblSeat() {
		return numAvblSeat;
	}

	public void setNumAvblSeat(int numAvblSeat) {
		this.numAvblSeat = numAvblSeat;
	}
	
	public String toString(){
		String toReturn = "";
		toReturn += rowNum + ":";
		for(int i = 0; i < seats.length; i++){
			toReturn += " " + seats[i];
		}
		return toReturn;
	}

}
