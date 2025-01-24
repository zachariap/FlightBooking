package builder;

import java.util.ArrayList;

import classes.flight.Flight;
import classes.flight.StoringFlight;
import classes.seatdecorations.Bag;
import classes.seatdecorations.SeatItemDecorator;
import classes.seats.Comfort;
import classes.seats.Economy;
import classes.seats.FirstClass;
import classes.seats.Seat;

public class TicketBuilder extends Builder {
    private String name;
    private String DOB;
    private Bag bag;
    private double flightCost;
    private Flight chosenflight;
    private Ticket ticket;
    private ArrayList<Ticket> tickets;
    private String flightDate;
    private String flightTime;
    private String layover;
    private double seatCost;

    public TicketBuilder(String name, String DOB) {
        super(name, DOB);
        this.name = name;
        this.DOB = DOB;
        this.ticket = new Ticket(name, DOB);
        tickets = new ArrayList<Ticket>();
    }

    @Override
    public TicketBuilder setFlight(String sourceCode, String destinationCode) {
        StoringFlight stored = new StoringFlight();
        stored.setFlights();
        ArrayList<Flight> allflights = stored.getFlights();


        for (int i = 0; i < allflights.size(); i++) {
            String allflightsrccode = allflights.get(i).getSourceCode().toUpperCase();
            String allflightdestcode = allflights.get(i).getDestinationCode().toUpperCase();
            if (allflightsrccode.equals(sourceCode.toUpperCase()) && allflightdestcode.equals(destinationCode.toUpperCase())) {
                this.chosenflight = allflights.get(i);
            }
        }
        if (this.chosenflight == null) {
            System.out.println("Source code and destination code do not match any available flights");

        }
            this.flightCost = this.chosenflight.flightCost();
            this.flightDate = this.chosenflight.getFlightDate();
            this.flightTime = this.chosenflight.getFlightTime();
            this.layover = this.chosenflight.getLayover();
            this.ticket.setSrcAirport(this.chosenflight.getSourceAiport());
            this.ticket.setDstAirport(this.chosenflight.getDestinationAirport());
            this.ticket.setAirline(this.chosenflight.getAirline());
            this.ticket.setAircraft(this.chosenflight.getAircraft());
            this.ticket.setFlightCost(flightCost);
            this.ticket.setSourceCode(this.chosenflight.getSourceCode());
            this.ticket.setDestinationCode(this.chosenflight.getDestinationCode());
            this.ticket.setFlightDate(this.flightDate);
            this.ticket.setFlightTime(this.flightTime);
            this.ticket.setLayovers(this.layover);

        return this;
    }

    @Override
    public TicketBuilder setSeat(String seatClass, boolean bags) {
        String rseat = this.chosenflight.getReservedSeat();
        ticket.setSeatNumber(rseat);
        if (seatClass.toLowerCase().equals("comfort")) {
            Comfort seatcomfort = new Comfort();
            System.out.println(seatcomfort.getDescription());
            this.seatCost = seatcomfort.getCost();
            if (bags == true) {
                this.bag = new Bag(seatcomfort);
                System.out.println(this.bag.getDescription());
            }
        } else if (seatClass.toLowerCase().equals("economy")) {
            Economy seatecon = new Economy();
            this.seatCost = seatecon.getCost();
            if (bags == true) {
                this.bag = new Bag(seatecon);
                System.out.println(this.bag.getDescription());
            }
        } else if (seatClass.toLowerCase().equals("first class")) {
            FirstClass fclassseat = new FirstClass();
            this.seatCost = fclassseat.getCost();
            if (bags == true) {
                this.bag = new Bag(fclassseat);
                System.out.println(this.bag.getDescription());
            }
        }
        this.ticket.setFinalUpgrades(bag, this.chosenflight.flightCost(), this.seatCost);
        this.tickets.add(ticket);
        System.out.println(this.ticket.toString());
        return this;

    }

}
