package classes.airport;

public abstract class Airport {
	String name;
	String code;
	/**
	 * Airport constructor
	 * @param name - representing airport
	 * @param code - representing airport code
	 */
	public Airport(String name, String code) {
		if(name == null || name.isBlank() || code == null || code.isBlank()) {
			throw new IllegalArgumentException("Bad Params Airport Constructor");
		}
		this.name = name;
		this.code = code;

	}
/**
 * Method to get airport
 * @return airport name
 */
	public String getAirport() {
		return this.name;
	}
/**
 * Method to get code
 * @return airport code
 */
	public String getCode() {
		return this.code;
	}

}
