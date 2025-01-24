package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import classes.airline.Delta;
import classes.airline.Great;
import classes.seatdecorations.Bag;
import classes.seats.Comfort;
import classes.seats.Economy;
import classes.seats.FirstClass;
class airlineProgramUnitTests {

	@Test
	void TestDeltaAirlineName() {
		Delta airline = new Delta();
		assertEquals(airline.getAirline(), "Delta", "The airline name is Delta");
	}
	@Test
	void TestGreatAirlineName() {
		Great airline = new Great();
		assertEquals(airline.getAirline(), "Great", "The airline name is Great");
	}
	@Test
	void TestComfort() {
		Comfort seat = new Comfort();;
		assertEquals("My seat is a Comfort", seat.getDescription(), "Description of comfort seat");
	}
	@Test
	void TestEconomy() {
		Economy seat = new Economy();
		assertEquals("My seat is a Economy", seat.getDescription(), "Description of economy seat");
	}
	@Test
	void FirstClass() {
		FirstClass seat = new FirstClass();
		assertEquals("My seat is a First Class", seat.getDescription(), "Description of first class seat");
	}

	@Test
	void TestEconomySeatwithBag() {
		Economy seat = new Economy();
		Bag bag = new Bag(seat);
		assertEquals("My seat is a Economy and bag option", bag.getDescription(), "Description of economy with one bag");
	}
	@Test
	void TestComfortSeatwithBag() {
		Comfort seat = new Comfort();
		Bag bag = new Bag(seat);
		assertEquals("My seat is a Comfort and bag option", bag.getDescription(), "Description of comfort with one bag");
	}
	@Test
	void TestFirstClassSeatwithBag() {
		FirstClass seat = new FirstClass();
		Bag bag = new Bag(seat);
		assertEquals("My seat is a First Class and bag option", bag.getDescription(), "Description of First Class with one bag");
	}

	@Test
	void TestComfortCost() {
		Comfort seat = new Comfort();;
		assertEquals(300.0, seat.getCost(), "Cost of comfort seat");
	}
	@Test
	void TestEconomyCost() {
		Economy seat = new Economy();;
		assertEquals(200.0, seat.getCost(), "Cost of economy seat");
	}
	@Test
	void TestFirstClassCost() {
		FirstClass seat = new FirstClass();;
		assertEquals(400.0, seat.getCost(), "Cost of First Class seat");
	}



}
