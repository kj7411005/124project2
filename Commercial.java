/**
 * The Commercial interface defines the methods related to managing the number of passengers
 * for commercial airplanes. This interface provides a contract for getting and setting
 * the number of passengers.
 */
public interface Commercial {

    /**
     * Retrieves the number of passengers on the commercial airplane.
     */
    int getNumberOfPassengers();

    /**
     * Sets the number of passengers on the commercial airplane.
     */
    void setNumberOfPassengers(int passengers);
}
