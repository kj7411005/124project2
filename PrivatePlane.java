/**
 * The PrivatePlane class extends the Airplane class and implements the Private interface.
 * It represents a private airplane with a specific owner, and provides methods to manage
 * and display the airplane's details, including the owner's name.
 */
public class PrivatePlane extends Airplane implements Private {
    
    private String OwnerName;

    /**
     * Constructs a PrivatePlane object with the specified flight details and owner's name.
     * Initializes the airplane's flight information along with the owner's name.
     */
    public PrivatePlane(String flightNumber, String make, String type, String departureTime, String landingTime, String flightDuration, String OwnerName) {
        super(flightNumber, make, type, departureTime, landingTime, flightDuration);
        this.OwnerName = OwnerName;
    }

    /**
     * Retrieves the name of the owner of the private airplane.
     */
    @Override
    public String getOwnerName() {
        return OwnerName;
    }

    /**
     * Sets the name of the owner of the private airplane.
     */
    @Override
    public void setOwnerName(String name) {
        this.OwnerName = name;
    }

    /**
     * Displays the details of the private airplane, including its flight information
     * and the owner's name.
     */
    @Override
    public void displayDetails() {
        System.out.println("Flight Number: " + getFlightNumber() + "," + " Make: " + getMake() + "," +" Type: " + getType() + "," +" Departure Time: " + getDepartureTime() + "," +" Landing Time: " + getLandingTime() + "," +" Flight Duration: " + getFlightDuration() + "," +" Owner Name: " + getOwnerName());
    }
}
