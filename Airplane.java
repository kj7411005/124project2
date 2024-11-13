/**
 * Abstract class representing an Airplane with details such as flight number, make, type, 
 * departure time, landing time, and flight duration.
 */
public abstract class Airplane {

    // Fields
    private String FlightNumber;
    private String Make;
    private String Type;
    private String DepartureTime;
    private String LandingTime;
    private String FlightDuration;

    /**
     * Retrieves the flight number of the airplane.
     */
    public String getFlightNumber() {
        return FlightNumber;
    }

    /**
     * Sets the flight number of the airplane.
     */
    public void setFlightNumber(String flightNumber) {
        FlightNumber = flightNumber;
    }

    /**
     * Retrieves the make of the airplane.
     */
    public String getMake() {
        return Make;
    }

    /**
     * Sets the make of the airplane.
     */
    public void setMake(String make) {
        Make = make;
    }

    /**
     * Retrieves the type of the airplane.
     */
    public String getType() {
        return Type;
    }

    /**
     * Sets the type of the airplane.
     */
    public void setType(String type) {
        Type = type;
    }

    /**
     * Retrieves the departure time of the airplane.
     */
    public String getDepartureTime() {
        return DepartureTime;
    }

    /**
     * Sets the departure time of the airplane.
     */
    public void setDepartureTime(String departureTime) {
        DepartureTime = departureTime;
    }

    /**
     * Retrieves the landing time of the airplane.
     */
    public String getLandingTime() {
        return LandingTime;
    }

    /**
     * Sets the landing time of the airplane.
     */
    public void setLandingTime(String landingTime) {
        LandingTime = landingTime;
    }

    /**
     * Retrieves the flight duration of the airplane.
     */
    public String getFlightDuration() {
        return FlightDuration;
    }

    /**
     * Sets the flight duration of the airplane.
     */
    public void setFlightDuration(String flightDuration) {
        FlightDuration = flightDuration;
    }

    /**
     * Constructor to create an Airplane object with the provided attributes.
     * Initializes the airplane's flight number, make, type, departure time, landing time, 
     * and flight duration.
     */
    public Airplane(String flightNumber, String make, String type, String departureTime, String landingTime, String flightDuration) {
        this.FlightNumber = flightNumber;
        this.Make = make;
        this.Type = type;
        this.DepartureTime = departureTime;
        this.LandingTime = landingTime;
        this.FlightDuration = flightDuration;
    }

    /**
     * Abstract method to display the details of the airplane.
     * Subclasses must implement this method to define how the airplane's details will be displayed.
     */
    public abstract void displayDetails();
}
