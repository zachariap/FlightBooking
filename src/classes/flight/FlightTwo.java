package classes.flight;

import classes.aircraft.Aircraft;
import classes.aircraft.Starflier;
import classes.airline.Airline;
import classes.airline.Delta;
import classes.airport.Airport;
import classes.airport.NorthAirport;
import classes.airport.SouthAirport;
import classes.fly.FlightBehavior;
import classes.fly.FlyWithStarflier;

public final class FlightTwo extends Flight{
	static FlightBehavior behavior = new FlyWithStarflier();
	static Aircraft aircraft = new Starflier(behavior);
	static Airline airline = new Delta();
	static Airport sourceairport = new SouthAirport();
	static Airport destinationairport = new NorthAirport();

	@Override
	public String getSourceAiport() {
		return FlightTwo.sourceairport.getAirport();
	}

	@Override
	public String getDestinationCode() {
		return FlightTwo.destinationairport.getCode();
	}

	@Override
	public String getDestinationAirport() {
		return FlightTwo.destinationairport.getAirport();
	}

	@Override
	public String getFlightDate() {
		return "Tuesday, February 12th";
	}

	@Override
	public String getSourceCode() {
		return FlightTwo.sourceairport.getCode();
	}
	@Override
	public String getReservedSeat() {
		return FlightTwo.aircraft.ReserveSeat();
	}

	@Override
	public String getAirline() {
		return FlightTwo.airline.getAirline();
	}

	@Override
	public String getAircraft(){ return FlightTwo.aircraft.toString(); }

	@Override
	public String getFlightTime() {
		return "1:00 pm";
	}

	@Override
	public String getLayover() {
		return "Layover at WES, 2:00 pm";
	}

	@Override
	public double flightCost() {
		return 300.0;
	}
}
