package classes.seatdecorations;

import classes.seats.SeatItem;

public class Bag extends SeatItemDecorator{
	SeatItem item;
	/**
	 * Bag constructor
	 * @param item - representing seat item
	 */
	public Bag(SeatItem item) {
		super(item, "bag option", 50.00);
		this.item = item;
	}

	/**
	 * Returns this decoration's cost
	 * @return double representing this decoration's cost
	 */
	public double getCost() {
		return super.getItemCost() + this.item.getCost();
	}

	/**
	 * The abstract method that returns the decoration's description
	 * @return String Representing the decoration's description
	 */
	public String getDescription() {
		return this.item.getDescription() + " with a " + super.getName();
	}
}
