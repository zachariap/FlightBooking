package classes.fly;

public class FlyWithStarflier implements FlightBehavior{
	String flightType;
	
	public FlyWithStarflier() {
		
	}
	/**
	 * Method that returns fly sound
	 */
	@Override
	public String fly() {
		flightType = "Welcome to Starflier!";
		return flightType;
		
	}
	
}
