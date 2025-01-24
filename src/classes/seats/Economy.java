package classes.seats;

public class Economy extends Seat{
	SeatItem item;
	/**
	 * Economy constructor
	 */
	public Economy() {
		super("Economy", 200.00);
		item = null;
	}
}
