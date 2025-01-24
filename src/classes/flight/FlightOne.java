package classes.flight;

import classes.aircraft.Aircraft;
import classes.aircraft.Boeing;
import classes.airline.Airline;
import classes.airline.Great;
import classes.airport.Airport;
import classes.airport.NorthAirport;
import classes.airport.SouthAirport;
import classes.fly.FlightBehavior;
import classes.fly.FlyWithBoeing;

public final class FlightOne extends Flight{
	static FlightBehavior behavior = new FlyWithBoeing();
	static Aircraft aircraft = new Boeing(behavior);
	static Airline airline = new Great();
	static Airport sourceairport = new NorthAirport();
	static Airport destinationairport = new SouthAirport();

	@Override
	public String getSourceAiport() {
		return FlightOne.sourceairport.getAirport();
	}

	@Override
	public String getDestinationCode() {
		return FlightOne.destinationairport.getCode();
	}

	@Override
	public String getDestinationAirport() {
		return FlightOne.destinationairport.getAirport();
	}

	@Override
	public String getFlightDate() {
		return "Monday, February 12th";
	}

	@Override
	public String getSourceCode() {
		return FlightOne.sourceairport.getCode();
	}

	@Override
	public String getReservedSeat() {
		return FlightOne.aircraft.ReserveSeat();
	}

	@Override
	public String getAirline() {
		return FlightOne.airline.getAirline();
	}

	@Override
	public String getAircraft(){ return FlightOne.aircraft.toString(); }

	@Override
	public String getFlightTime() {
		return "12:00 pm";
	}
	@Override
	public String getLayover() {
		return "Layover at EAS, 2:00 pm";
	}

	@Override
	public double flightCost() {
		return 200.0;
	}

}
