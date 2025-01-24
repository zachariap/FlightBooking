package classes.flight;

import classes.aircraft.Aircraft;
import classes.aircraft.Starflier;
import classes.airline.Airline;
import classes.airline.Great;
import classes.airport.*;
import classes.fly.FlightBehavior;
import classes.fly.FlyWithStarflier;

public class FlightThree extends Flight{
    static FlightBehavior behavior = new FlyWithStarflier();
    static Aircraft aircraft = new Starflier(behavior);
    static Airline airline = new Great();
    static Airport sourceairport = new EastAirport();
    static Airport destinationairport = new WestAirport();

    @Override
    public String getSourceAiport() {
        return FlightThree.sourceairport.getAirport();
    }

    @Override
    public String getDestinationCode() {
        return FlightThree.destinationairport.getCode();
    }

    @Override
    public String getDestinationAirport() {
        return FlightThree.destinationairport.getAirport();
    }

    @Override
    public String getFlightDate() {
        return "Monday, March 12";
    }

    @Override
    public String getSourceCode() {
        return FlightThree.sourceairport.getCode();
    }

    @Override
    public String getReservedSeat() {
        return FlightThree.aircraft.ReserveSeat();
    }

    @Override
    public String getAirline() {
        return FlightThree.airline.getAirline();
    }

    @Override
    public String getAircraft(){ return FlightThree.aircraft.toString(); }

    @Override
    public String getFlightTime() {
        return "12:00 pm";
    }
    @Override
    public String getLayover() {
        return "Layover at SOU, 2:00 pm";
    }

    @Override
    public double flightCost() {
        return 600.0;
    }

}
