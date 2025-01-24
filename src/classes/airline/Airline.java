package classes.airline;

public abstract class Airline {
	String name;
	/**
	 * Airline constructor
	 * @param name
	 */
	public Airline(String name) {
		if(name == null) {
			throw new IllegalArgumentException("Bad Params in Airline");
		}
		this.name = name;
	}
	/**
	 * Method to get airline
	 * @return name - airline name
	 */
	public String getAirline(){
		return this.name;
	}


}
