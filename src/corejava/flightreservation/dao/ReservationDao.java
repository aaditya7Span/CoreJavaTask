package corejava.flightreservation.dao;


import corejava.flightreservation.moduls.Reservation;

public interface ReservationDao {

    Reservation bookFlight(Reservation reservation);
}
