/**
 * The CommercialPlane class extends the Airplane class and implements the Commercial interface.
 * It represents a commercial airplane with a specific number of passengers and provides methods 
 * to manage and display the airplane's details, including the number of passengers.
 */
public class CommercialPlane extends Airplane implements Commercial {
    
    private int numberOfPassengers;

    /**
     * Constructor to create a CommercialPlane object with the specified flight details and
     * the number of passengers.
     * Initializes the flight information along with the number of passengers.
     */
    public CommercialPlane(String flightNumber, String make, String type, String departureTime, String landingTime, String flightDuration, int numberOfPassengers) {
        super(flightNumber, make, type, departureTime, landingTime, flightDuration);
        this.numberOfPassengers = numberOfPassengers;
    }

    /**
     * Retrieves the number of passengers on the commercial airplane.
     */
    @Override
    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    /**
     * Sets the number of passengers on the commercial airplane.
     */
    @Override
    public void setNumberOfPassengers(int number) {
        this.numberOfPassengers = number;
    }

    /**
     * Displays the details of the commercial plane, including its flight information 
     * and the number of passengers.
     */
    @Override
    public void displayDetails() {
        System.out.println("Flight Number: " + getFlightNumber() + "," +" Make: " + getMake() + "," +" Type: " + getType() + "," +" Departure Time: " + getDepartureTime() + "," +" Landing Time: " + getLandingTime() + "," +" Flight Duration: " + getFlightDuration() + "," +" Number of Passengers: " + getNumberOfPassengers());
    }
}
