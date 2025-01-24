package classes.aircraft;

import classes.fly.FlightBehavior;

public class Boeing extends Aircraft {
	private FlightBehavior flight;
	public static final int rows = 20;
	public static final int seatsPerRow = 5;
	/**
	 * Constructor for Rocket
	 * @param flight - representing flight behavior
	 */
	public Boeing(FlightBehavior flight) {
		super("Boeing", rows, seatsPerRow, flight);
		if(flight == null) {
			throw new IllegalArgumentException("Bad Params in Boeing Constructor");
		}
		plane = new boolean[rows][seatsPerRow];
		this.flight = flight;
	}
	/**
	 * Method to get flight behavior
	 * @return FlightBehavior - representing the flight behavior
	 */
	public FlightBehavior getFlightBehavior() {
		return this.flight;

	}
	/**
	 * Method to return string of flight behavior
	 * String - flight behavior
	 */
	@Override
	public String toString() {
		return super.toString() + " and they would like to send you this message '" + this.flight.fly() + "'";
	}
	/**
	 * Method to return string of fly sound
	 * @return String - flight sound
	 */
	public String toStringFly() {
		String flight = this.flight.fly();
		return flight;
	}
	/**
	 * Method to reserve seat on plane
	 * @return String - representing seat on plane
	 */
	@Override
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
