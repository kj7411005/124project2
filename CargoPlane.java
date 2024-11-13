/**
 * The CargoPlane class extends the Airplane class and implements the Cargo interface.
 * It represents a cargo airplane with a specific cargo weight and overrides the
 * necessary methods to manage and display its details.
 */
public class CargoPlane extends Airplane implements Cargo {

    private double weight;

    /**
     * Constructor to create a CargoPlane object with the specified attributes.
     * Initializes the flight details and cargo weight.
     */
    public CargoPlane(String flightNumber, String make, String type, String departureTime, String landingTime, String flightDuration, double weight) {
        super(flightNumber, make, type, departureTime, landingTime, flightDuration);
        this.weight = weight;
    }

    /**
     * Retrieves the cargo weight of the cargo plane.
     */
    @Override
    public double getCargoWeight() {
        return weight;
    }

    /**
     * Sets the cargo weight of the cargo plane.
     */
    @Override
    public void setCargoWeight(double weight) {
        this.weight = weight;
    }

    /**
     * Displays the details of the cargo plane, including its flight information
     * and cargo weight.
     */
    @Override
    public void displayDetails() {
        System.out.println("Flight Number: " + getFlightNumber() + "," +
                           " Make: " + getMake() + "," +
                           " Type: " + getType() + "," +
                           " Departure Time: " + getDepartureTime() + "," +
                           " Landing Time: " + getLandingTime() + "," +
                           " Flight Duration: " + getFlightDuration() + "," +
                           " Cargo Weight: " + getCargoWeight());
    }
}
