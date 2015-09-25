
public class SeatCollection {
	private String flightNum;
	private Row[] busRow;
	private int numBusRow;
	private Row[] ecoRow;
	private int numEcoRow;
	private boolean avbl;
	
	public SeatCollection(int numOfBusRow, int numOfEcoRow, String flightNum){
		busRow = new Row[numOfBusRow];
		ecoRow = new Row[numOfEcoRow];
		this.flightNum = flightNum;
		avbl = true;
	}
	
	public void addRow(Row row){
		if(numBusRow < busRow.length){
			busRow[numBusRow] = row;
			numBusRow++;
		}
		else if(numEcoRow < ecoRow.length){
			ecoRow[numEcoRow] = row;
			numEcoRow++;
		}
		
	}
	
	public void checkAvbl(){
		boolean busRowAvbl = false, ecoRowAvbl = false;
		for(int i = 0; i < busRow.length; i++){ 
			if(busRow[i].checkAvbl()){ 
				busRowAvbl = true; 
				break;
			}
		}
		for(int i = 0; i < ecoRow.length; i++){
			if(ecoRow[i].checkAvbl()){
				busRowAvbl = true;
				break;
			}
		}
		avbl = busRowAvbl || ecoRowAvbl;
	}

	public Row[] getBusRow() {
		return busRow;
	}

	public void setBusRow(Row[] busRow) {
		this.busRow = busRow;
	}

	public Row[] getEcoRow() {
		return ecoRow;
	}

	public void setEcoRow(Row[] ecoRow) {
		this.ecoRow = ecoRow;
	}

	public boolean isAvbl() {
		return avbl;
	}

	public void setAvbl(boolean avbl) {
		this.avbl = avbl;
	}
	
	public String getFlightNum() {
		return flightNum;
	}

	public void setFlightNum(String flightNum) {
		this.flightNum = flightNum;
	}

	public String toString(){
		String toReturn = "";
		for(int i = 0; i < busRow.length; i++){
			toReturn += busRow[i] + "\n";
		}
		for(int i = 0; i < ecoRow.length; i++){
			toReturn += ecoRow[i] + "\n";
		}
		return toReturn;
	}

}
