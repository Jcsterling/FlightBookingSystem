package com.bae.flightBookingApp.persistence.domain;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;


@Entity
public class Ticket {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@LazyCollection(LazyCollectionOption.FALSE)
    @OneToMany(cascade = CascadeType.ALL)
	private List<Passenger> passenger;
	
	@LazyCollection(LazyCollectionOption.FALSE)
    @OneToMany(cascade = CascadeType.ALL)
	private List<Flight> flight;
	
	@LazyCollection(LazyCollectionOption.FALSE)
    @OneToMany(cascade = CascadeType.ALL)
	private List<Seat> seat;
	
	private Flight Flight;
	private Seat Seat;
	private Passenger Passenger;
	
	
	private Date creationDate;

	public Ticket() {
	}
	
	public Ticket ( List<Passenger> passenger, List<Flight> flight, List<Seat> seat, Date creationDate) {
		setPassenger(passenger);
		setFlight(flight);
		setSeat(seat);
		setCreationDate(creationDate);
	}

	public Ticket ( Passenger Passenger, Flight Flight, Seat Seat, Date creationDate) {
		setPassenger(Passenger);
		setFlight(Flight);
		setSeat(Seat);
		setCreationDate(creationDate);
	}
	public List<Passenger> getPassenger() {
		return passenger;
	}

	public void setPassenger(List<Passenger> passenger) {
		this.passenger = passenger;
	}

	public List<Flight> getFlight() {
		return flight;
	}

	public void setFlight(List<Flight> flight) {
		this.flight = flight;
	}

	public List<Seat> getSeat() {
		return seat;
	}

	public void setSeat(List<Seat> seat) {
		this.seat = seat;
	}

	

	public Date getCreationDate() {
		return creationDate;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setFlight(Flight flight) {
		Flight = flight;
	}

	public void setSeat(Seat seat) {
		Seat = seat;
	}

	public void setPassenger(Passenger passenger) {
		Passenger = passenger;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}




	

}
