package classes.flight;

import classes.aircraft.Aircraft;
import classes.airport.Airport;
import classes.fly.FlightBehavior;

public abstract class Flight {
	Aircraft aircraft;
	FlightBehavior behavior;
	Airport sourceairport;
	Airport destinationairport;
	/**
	 * method to get source code
	 * @return source code
	 */
	public abstract String getSourceCode();
	/**
	 * method to get source airport
	 * @return source airport
	 */
	public abstract String getSourceAiport();
	/**
	 * method to return destination code
	 * @return destination code
	 */
	public abstract String getDestinationCode();
	/**
	 * method to return destination airport
	 * @return destination airport
	 */
	public abstract String getDestinationAirport();
	/**
	 * method to return flight date
	 * @return flight date
	 */
	public abstract String getFlightDate();
	/**
	 * method to return flight time
	 * @return flight time
	 */
	public abstract String getFlightTime();
	/**
	 * method to return reserved seat
	 * @return reserved seat
	 */
	public abstract String getReservedSeat();
	/**
	 * method to return airline
	 * @return airline
	 */
	public abstract String getAirline();
	/**
	 * method to return aircraft
	 * @return aircraft
	 */
	public abstract String getAircraft();
	/**
	 * method to get layovers
	 * @return layovers
	 */
	public abstract String getLayover();
	/**
	 * method to get flight cost
	 * @return flight cost
	 */
	public abstract double flightCost();
}
