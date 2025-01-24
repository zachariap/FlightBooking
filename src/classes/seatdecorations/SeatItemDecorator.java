package classes.seatdecorations;

import classes.seats.SeatItem;

public abstract class SeatItemDecorator implements SeatItem{
	/**
	 * The reference to SeatItem
	 */
	protected SeatItem item;

	/**
	 * The reference to the decoration name
	 */
	protected String name;

	/**
	 * The double for the decoration cost
	 */
	protected double cost;
	/**
	 * The constructor that sets all the parameters
	 * @param item
	 * @param name
	 * @param cost
	 * @throws IllegalArgumentException - if the String is null or blank
	 */
	public SeatItemDecorator(SeatItem item, String name, double cost) {
		if(name == null || name.isBlank()) { 
			throw new IllegalArgumentException("Bad Params for SeatItemDecorator Constructor");
		}
		if(cost < 0) {
			throw new IllegalArgumentException("Bad Params for SeatItemDecorator Constructor");
		}
		this.item = item;
		this.name = name;
		this.cost = cost;
	}
	/**
	 * Returns this decoration's cost
	 * @return double representing this decoration's cost
	 */
	protected double getItemCost() {
		return this.cost;
	}
	/**
	 * Returns this decoration name
	 * @return String representing this decoration's name
	 */
	protected String getName() {
		return this.name;
	}
	/**
	 * The abstract method that returns the decoration's description
	 * @return String Representing the decoration's description
	 */
	public abstract String getDescription();


}
