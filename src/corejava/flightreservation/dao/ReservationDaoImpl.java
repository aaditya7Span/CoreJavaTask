package corejava.flightreservation.dao;


import corejava.flightreservation.moduls.Flights;
import corejava.flightreservation.moduls.Reservation;

import java.util.HashMap;

public class ReservationDaoImpl implements ReservationDao {
    HashMap<Long, Flights> flights;
    HashMap<Long, Reservation> reservations;
    long reservationId;

    public ReservationDaoImpl() {
        reservations=new HashMap<>();
        flights =new HashMap<>();
        Flights flight1=new Flights();

        flight1.setId(1L);
        flight1.setFlightNumber("123");
        flight1.setOperatingAirline("American");
        flight1.setDeparctureCity("Austin");
        flight1.setArivalCity("Newyork");
        flight1.setDateAndTimeOfDeparture("5/22/2022 9Pm");

        flights.put(flight1.getId(),flight1);


        Flights flight2=new Flights();

        flight2.setId(2L);
        flight2.setFlightNumber("98123");
        flight2.setOperatingAirline("Jalva");
        flight2.setDeparctureCity("Bapunagar");
        flight2.setArivalCity("Naroda");
        flight2.setDateAndTimeOfDeparture("10/11/2022 8:30Am");

        flights.put(flight2.getId(),flight2);

    }

    @Override
    public Reservation bookFlight(Reservation reservation) {
       Flights flight= flights.get(reservation.getFlightNumber());
        reservation.setFlight(flight);
        reservationId++;
        reservation.setId(reservationId);
        reservations.put(reservationId,reservation);
        return reservation;
    }
}
