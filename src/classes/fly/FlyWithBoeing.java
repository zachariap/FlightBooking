package classes.fly;

public class FlyWithBoeing implements FlightBehavior{
	String flightType;
	public FlyWithBoeing() {

	}
	/**
	 * Method that returns a fly sound
	 */
	@Override
	public String fly() {
		flightType = "Welcome to Boeing!";
		return flightType;

	}


}
