package corejava.flightreservation.moduls;

public class Reservation extends AbstractID{
    private Flights flight;
    private Passengers passenger;
    private long flightNumber;

    public Flights getFlight() {
        return flight;
    }

    public void setFlight(Flights flight) {
        this.flight = flight;
    }

    public Passengers getPassenger() {
        return passenger;
    }

    public void setPassenger(Passengers passenger) {
        this.passenger = passenger;
    }

    public long getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(long flightNumber) {
        this.flightNumber = flightNumber;
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "flight=" + flight +
                ", passenger=" + passenger +
                ", flightNumber=" + flightNumber +
                '}';
    }
}
