package builder;


import classes.seatdecorations.Bag;
import classes.seats.SeatItem;
public class Ticket {

	String name;
	String DOB;
	String sourcecode;
	String destcode;
	String srcairport;
	String dstairport;
	double flightcost;
	double finalcost;
	String seatNum;
	String airline;
	String aircraft;
	private String flightDate;
	private String flightTime;
	private String layover;
	public Ticket(String name, String DOB) {
		if(name == null|| name.isBlank() || DOB == null || DOB.isBlank()) {
			throw new IllegalArgumentException("Bad Param Builder Constructor");
		}
		this.name = name;
		this.DOB = DOB;

	}

	public void setFlightCost(double flightcost) {
		this.flightcost = flightcost;
	}

	public void setFinalUpgrades(Bag bag, double cost, double seatCost) {
		if(bag == null) {
			this.finalcost = cost + seatCost;
		}else {
			this.finalcost = bag.getCost() + cost;
		}
	}

	public void setSourceCode(String sourcecode) {
		this.sourcecode = sourcecode;
	}

	public void setSeatNumber(String seatNum) {
		this.seatNum = seatNum;

	}

	public void setDestinationCode(String destcode) {
		this.destcode = destcode;
	}

	public void setSrcAirport(String airport) {
		this.srcairport = airport;
	}

	public void setDstAirport(String airport) {
		this.dstairport = airport;
	}

	public void setAirline(String airline) {
		this.airline = airline;
	}

	public void setAircraft(String aircraft) {this.aircraft = aircraft;}

	public String toString() {
		String result = "\nFlight Cost: " + this.flightcost + "\nFinal Cost: " + this.finalcost + "\nSource Code: " + this.sourcecode + "\nDestination Number: " + 
				this.destcode +  " \nSeat Number "+ this.seatNum+"\nFlight Time: " + this.flightTime + "\nFlight Date: " + this.flightDate + "\nSource Airport: " +
				this.srcairport + " Airport \nDestination Airport: " + this.dstairport + " Airport \nAirline: " +
				this.airline+ "\nAircraft: " + this.aircraft +"\nLayover: " + this.layover + "\n";
		return result;
	}
	public void setFlightDate(String flightDate) {
		this.flightDate = flightDate;
	}
	public void setFlightTime(String flightTime) {
		this.flightTime = flightTime;
	}
	public void setLayovers(String layover) {
		this.layover = layover;
	}
}
