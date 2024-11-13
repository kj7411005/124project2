/**
 * The Cargo interface defines the methods related to managing cargo weight for an object.
 * This interface provides a contract for getting and setting the cargo weight.
 * 
 * Note: Interfaces do not have constructors because they are not meant to be instantiated directly.
 * Implementing classes will handle the construction and initialization of objects.
 * 
 * All fields in interfaces are implicitly public, static, and final. They act as constants shared 
 * across all implementing classes.
 */
public interface Cargo {
    
    /**
     * Retrieves the cargo weight.
     */
    double getCargoWeight();
    
    /**
     * Sets the cargo weight.
     */
    void setCargoWeight(double weight);
}



