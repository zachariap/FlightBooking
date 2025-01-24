package classes.aircraft;

import classes.fly.FlightBehavior;

public class Starflier extends Aircraft{

	private FlightBehavior flight;
	public static final int rows = 20;
	public static final int seatsPerRow = 5;
	/**
	 * Ship constructor
	 * @param flight - representing flight behavior
	 */
	public Starflier(FlightBehavior flight) {
		super("Starflier", rows, seatsPerRow, flight);
		if(flight == null) {
			throw new IllegalArgumentException("Bad Params in Starflier Constructor");
		}
		plane = new boolean[rows][seatsPerRow];
		this.flight = flight;
	}
	/**
	 * Method to set flight behavior
	 * @param newFlight - new flight behavior
	 */
	public void setFlightBehavior(FlightBehavior newFlight) {
		if(newFlight == null) {
			throw new IllegalArgumentException("Bad Params in setFlightBehavior");
		}
		this.flight = newFlight;

	}
	/**
	 * Method to get flight behavior
	 */
	public FlightBehavior getFlightBehavior() {
		return this.flight;

	}
	/**
	 * Method to get flight behavior string
	 */
	@Override
	public String toString() {
		return super.toString() + " and they would like to send you this message '" + this.flight.fly() +"'";
	}
	/**
	 * Method to get flight behavior sound
	 * @return
	 */
	public String Fly() {
		String flight = this.flight.fly();
		return flight;
	}
	/**
	 * Method to reserve seat on plane
	 */
	public String ReserveSeat() {
		for(int i = 0; i < rows; i++) {
			for(int j=0; j < seatsPerRow; j++) {
				if(!plane[i][j]) {
					plane[i][j] = true;
					return "" + (i+1) + (char)('A' + j);
				}
			}
		}
		throw new IllegalStateException("Plane is full");
	}
}
