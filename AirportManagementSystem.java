import java.io.IOException;

/**
 * The AirportManagementSystem class manages the departure and landing queues of airplanes.
 * It allows adding, removing, and displaying airplanes in the queues, while reading airplane data from CSV files.
 */
public class AirportManagementSystem {

    NodeQueue<Airplane> departureQueue = new NodeQueue<>();
    NodeQueue<Airplane> landingQueue = new NodeQueue<>();

    /**
     * Adds an airplane to the appropriate queue (departure or landing) based on the provided type.
     * The airplane type can be cargo, private, or commercial.
     * If the type or queue type is invalid, it will print an error message.
     */
    public void addPlaneToQueue(String flightNumber, String make, String type, String departureTime, String landingTime, String flightDuration, String queueType, String lastField) {
        Airplane plane = null;
        if (type.equals("cargo")) {
            plane = new CargoPlane(flightNumber, make, type, departureTime, landingTime, flightDuration, Double.parseDouble(lastField));
        } else if (type.equals("private")) {
            plane = new PrivatePlane(flightNumber, make, type, departureTime, landingTime, flightDuration, lastField);
        } else if (type.equals("commercial")) {
            plane = new CommercialPlane(flightNumber, make, type, departureTime, landingTime, flightDuration, Integer.parseInt(lastField));
        } else {
            System.out.println("Invalid plane type");
            return;
        }

        if (queueType.equals("departure")) {
            departureQueue.enqueue(plane);
        } else if (queueType.equals("landing")) {
            landingQueue.enqueue(plane);
        } else {
            System.out.println("Invalid queue type");
        }
    }

    /**
     * Removes an airplane from the departure queue.
     * If the departure queue is empty, it will print a message indicating that.
     */
    public void removeFromDepQueue() {
        if (departureQueue.isEmpty()) {
            System.out.println("Departure queue is empty");
        } else {
            Airplane plane = departureQueue.dequeue();
            System.out.println("Plane removed from Departure Queue: " + plane.getFlightNumber());
        }
    }

    /**
     * Removes an airplane from the landing queue.
     * If the landing queue is empty, it will print a message indicating that.
     */
    public void removeFromLandQueue() {
        if (landingQueue.isEmpty()) {
            System.out.println("Landing queue is empty");
        } else {
            Airplane plane = landingQueue.dequeue();
            System.out.println("Plane removed from Landing Queue: " + plane.getFlightNumber());
        }
    }

    /**
     * Displays the airplanes currently in both the departure and landing queues.
     * If a queue is empty, it prints a message indicating that.
     */
    public void displayPlanesinQueue() {
        // Display Queue for Departure
        if (departureQueue.isEmpty()) {
            System.out.println("Departure queue is empty");
        } else {
            System.out.println("Planes in Departure Queue:");
            Node<Airplane> current = departureQueue.getFirst();
            while (current != null) {
                Airplane plane = current.getValue();
                plane.displayDetails();
                current = current.getNext();
            }
        }
        System.out.println("\n");

        // Display Queue for Landing
        if (landingQueue.isEmpty()) {
            System.out.println("Landing queue is empty");
        } else {
            System.out.println("Planes in Landing Queue:");
            Node<Airplane> current = landingQueue.getFirst();
            while (current != null) {
                Airplane plane = current.getValue();
                plane.displayDetails();
                current = current.getNext();
            }
        }
    }

    /**
     * Main method that initiates the airport management system.
     * It reads data from files, adds planes to the corresponding queues, 
     * and simulates removing planes from the queues.
     */
    public static void main(String[] args) throws IOException {

        AirportManagementSystem airportSystem = new AirportManagementSystem();
        String departureFlightData = Handling.readFromFile("departureFlights.csv");
        String landingFlightData = Handling.readFromFile("landingFlights.csv");

        // Process departure flights
        String[] lines = departureFlightData.split("\n");
        for (int i = 0; i < lines.length; i++) {
            String line = lines[i];
            String[] fields = line.split(",");
            String flightNumber = fields[0];
            String make = fields[1];
            String type = fields[2].trim();
            String departureTime = fields[3];
            String landingTime = fields[4];
            String flightDuration = fields[5];
            String lastField = fields[6];
            airportSystem.addPlaneToQueue(flightNumber, make, type, departureTime, landingTime, flightDuration, "departure", lastField);
        }

        // Process landing flights
        lines = landingFlightData.split("\n");
        for (int i = 0; i < lines.length; i++) {
            String line = lines[i];
            String[] fields = line.split(",");
            String flightNumber = fields[0];
            String make = fields[1];
            String type = fields[2].trim();
            String departureTime = fields[3];
            String landingTime = fields[4];
            String flightDuration = fields[5];
            String lastField = fields[6];
            airportSystem.addPlaneToQueue(flightNumber, make, type, departureTime, landingTime, flightDuration, "landing", lastField);
        }

        // Display initial queues
        System.out.println("\n");
        airportSystem.displayPlanesinQueue();
        System.out.println("\n");

        // Simulate removing a plane from the departure queue and the landing queue
        airportSystem.removeFromDepQueue();
        System.out.println("\n");

        airportSystem.removeFromLandQueue();
        System.out.println("\n");

        // Display updated queues
        System.out.println("Updated Queues:");
        airportSystem.displayPlanesinQueue();
    }
}
