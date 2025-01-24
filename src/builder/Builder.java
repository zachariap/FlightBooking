package builder;

import java.util.ArrayList;


public abstract class Builder  {
	String name;
	String DOB;
	ArrayList<Ticket> tickets;
	public Builder(String name, String DOB) {
		if(name == null|| name.isBlank() || DOB == null || DOB.isBlank()) {
			throw new IllegalArgumentException("Bad Param Builder Constructor");
		}
	}
	public abstract TicketBuilder setSeat(String seatClass, boolean bags);
	public abstract TicketBuilder setFlight(String sourceCode, String destinationCode);

}
