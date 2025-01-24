package classes.flight;

import classes.aircraft.Aircraft;
import classes.aircraft.Boeing;
import classes.airline.Airline;
import classes.airline.Great;
import classes.airport.Airport;
import classes.airport.NorthAirport;
import classes.airport.WestAirport;
import classes.fly.FlightBehavior;
import classes.fly.FlyWithBoeing;

public class FlightFour extends Flight {

    static FlightBehavior behavior = new FlyWithBoeing();
    static Aircraft aircraft = new Boeing(behavior);
    static Airline airline = new Great();
    static Airport sourceairport = new NorthAirport();
    static Airport destinationairport = new WestAirport();

    @Override
    public String getSourceAiport() {
        return FlightFour.sourceairport.getAirport();
    }

    @Override
    public String getDestinationCode() {
        return FlightFour.destinationairport.getCode();
    }

    @Override
    public String getDestinationAirport() {
        return FlightFour.destinationairport.getAirport();
    }

    @Override
    public String getFlightDate() {
        return "Wednesday, December 3";
    }

    @Override
    public String getSourceCode() {
        return FlightFour.sourceairport.getCode();
    }

    @Override
    public String getReservedSeat() {
        return FlightFour.aircraft.ReserveSeat();
    }

    @Override
    public String getAirline() {
        return FlightFour.airline.getAirline();
    }
    @Override
    public String getAircraft(){ return FlightFour.aircraft.toString(); }

    @Override
    public String getFlightTime() {
        return "6:00 pm";
    }
    @Override
    public String getLayover() {
        return "Layover at NOR, 9:00 pm";
    }

    @Override
    public double flightCost() {
        return 100.0;
    }

}
