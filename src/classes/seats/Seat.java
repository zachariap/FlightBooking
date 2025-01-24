package classes.seats;

public class Seat implements SeatItem{

	/**
 	String representing seat Type
	 */
	private String seatType;

	/**
	 Double representing cost
	 */
	protected double cost;

	/**
	 * The constructor that takes seatType and cost
	 * @param seatType representing the seat
	 * @param cost representing the seat cost
	 * @throws IllegalArgumentException - if the String is null or blank or less than 0
	 */
	public Seat(String seatType, double cost) {
		if(seatType == null || seatType.isBlank()) {
			throw new IllegalArgumentException("Bad Params in Seat Constructor");
		}
		this.seatType = seatType;
		this.cost = cost;
	}
	
	/**
	 * The method to get seat cost
	 * @return double representing the seat cost
	 */
	public double getCost() {
		return this.cost;
	}
	/**
	 * The method to get my seat description
	 * @return String My seat 'is a' the seat type 'with'
	 */
	public String getDescription() {
		return "My seat is a " + this.seatType + " seat";
	}
	/**
	 * The method to return my seat type
	 * @return String My seat 'is a' the seat type
	 */

	public String getSeatClass() {
		return "My seat is a " + this.seatType;

	}

}
