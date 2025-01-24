package classes.flight;

import java.util.ArrayList;

public class StoringFlight {

	private static ArrayList<Flight> flights = new ArrayList<Flight>();
	FlightOne f1 = new FlightOne();
	FlightTwo f2 = new FlightTwo();
	FlightThree f3 = new FlightThree();
	FlightFour f4 = new FlightFour();
	/**
	 * method to set flights in array list
	 */
	public void setFlights() {
		flights.add(f1);
		flights.add(f2);
		flights.add(f3);
		flights.add(f4);
	}
	/**
	 * method to get flights from array list
	 * @return
	 */
	public ArrayList<Flight> getFlights() {
		return flights;
	}


}
