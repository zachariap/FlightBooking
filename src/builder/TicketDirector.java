package builder;

import classes.driver.Driver;

public class TicketDirector{
	TicketBuilder builder;
	private int numtickets;
	private String sourcecode;
	private String destcode;
	private String seatClass;
	private int booleanbag;
	private boolean bags;

	public TicketDirector(String name, String DOB){
		if(name == null|| name.isBlank() || DOB == null || DOB.isBlank()) {
			throw new IllegalArgumentException("Bad Param TicketDirector Constructor");
		}
		this.builder = new TicketBuilder(name, DOB);


	}

	public void setNumofTickets(int numtickets) {
		this.numtickets = numtickets;
	}

	public void setSourceCode(String sourcecode) {
		this.sourcecode = sourcecode;
	}


	public void setDestinationCode(String destcode) {
		this.destcode = destcode;
	}
	public void setSeatClass(String seatClass){
		this.seatClass = seatClass;;
	}
	public void setBags(int booleanBag) {
		if(booleanBag == 1) {
			this.bags = true;
		}
		if(booleanBag == 0) {
			this.bags = false;
		}
	}
	public void printNumofTickets(int i) {
		System.out.println("Number of tickets in this reservation: " + this.numtickets + "(" + i + ")"+"\n");
	}

	public void constructTicket() {
		this.builder.setFlight(this.sourcecode, this.destcode);
		this.builder.setSeat(seatClass, bags);

	}

}
