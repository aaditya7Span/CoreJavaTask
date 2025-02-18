package corejava.flightreservation.moduls;

public class Flights extends AbstractID {
    private String flightNumber;
    private String operatingAirline;
    private String deparctureCity;
    private String arivalCity;
    private String DateAndTimeOfDeparture;

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getOperatingAirline() {
        return operatingAirline;
    }

    public void setOperatingAirline(String operatingAirline) {
        this.operatingAirline = operatingAirline;
    }

    public String getDeparctureCity() {
        return deparctureCity;
    }

    public void setDeparctureCity(String deparctureCity) {
        this.deparctureCity = deparctureCity;
    }

    public String getArivalCity() {
        return arivalCity;
    }

    public void setArivalCity(String arivalCity) {
        this.arivalCity = arivalCity;
    }

    public String getDateAndTimeOfDeparture() {
        return DateAndTimeOfDeparture;
    }

    public void setDateAndTimeOfDeparture(String dateAndTimeOfDeparture) {
        DateAndTimeOfDeparture = dateAndTimeOfDeparture;
    }

    @Override
    public String toString() {
        return "Flights{" +
                "flightNumber='" + flightNumber + '\'' +
                ", operatingAirline='" + operatingAirline + '\'' +
                ", deparctureCity='" + deparctureCity + '\'' +
                ", arivalCity='" + arivalCity + '\'' +
                ", DateAndTimeOfDeparture='" + DateAndTimeOfDeparture + '\'' +
                '}';
    }
}
