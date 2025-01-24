package classes.aircraft;

import classes.fly.FlightBehavior;

public abstract class Aircraft {
	private FlightBehavior flight;
	String name;
	int rows;
	int seatsPerRow;
	static boolean[][] plane;
	/**
	 * Constructor for Aircraft
	 * @param name - representing name of aircraft
	 * @param rows - representing rows
	 * @param seatsPerRow - representing seats per row
	 * @param flight - representing flight
	 */
	public Aircraft(String name, int rows, int seatsPerRow, FlightBehavior flight) {
		if(name == null || name.isBlank() || rows < 1 || seatsPerRow < 1 || flight == null) {
			throw new IllegalArgumentException("Bad Params Aircraft Constructor");
		}
		this.name = name;
		this.rows = rows;
		this.seatsPerRow = seatsPerRow;
		this.flight = flight;

	}
	/**
	 * Method to set flight behavior
	 * @param newFlight - representing new flight behavior
	 */
	public void setFlightBehavior(FlightBehavior newFlight) {
		if(newFlight == null) {
			throw new IllegalArgumentException("Bad Params in setFlightBehavior");
		}
		this.flight = newFlight;

	}
	/**
	 * Method to get flight behavior 
	 * @return flight behavior
	 */
	public FlightBehavior getFlightBehavior() {
		return this.flight;
	}
	/**
	 * Method to reserve seat on plane
	 * @return String seat number
	 */
	public String toString(){
		return this.name;
	}

	public abstract String ReserveSeat();


}

