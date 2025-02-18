package corejava.flightreservation.test;


import corejava.flightreservation.dao.ReservationDao;
import corejava.flightreservation.dao.ReservationDaoImpl;
import corejava.flightreservation.moduls.Passengers;
import corejava.flightreservation.moduls.Reservation;

public class Main {
    public static void main(String[] args) {
        ReservationDao dao=new ReservationDaoImpl();
        Reservation reservation=new Reservation();
        Passengers passenger =new Passengers();

        passenger.setId(123l);
        passenger.setFirstname("aadi");
        passenger.setLastname("jsoje");
        passenger.setMiddlename("johnn");
        passenger.setEmail("aadi@gmail.com");
        passenger.setPhone("91091910");

        reservation.setFlightNumber(1l);

        System.out.println(dao.bookFlight(reservation));
    }
}