import java.util.HashMap;
import java.util.Map;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        // Create HashMap to store bogie and its capacity
        HashMap<String, Integer> bogieCapacity = new HashMap<>();

        System.out.println("Adding Bogie Capacities...\n");

        // Insert bogie-capacity pairs
        bogieCapacity.put("Sleeper", 72);
        bogieCapacity.put("AC Chair", 60);
        bogieCapacity.put("First Class", 24);

        // Display bogie with capacity
        System.out.println("Bogie Capacity Details:");
        for (Map.Entry<String, Integer> entry : bogieCapacity.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // Example: Fast lookup
        System.out.println("\nCapacity of Sleeper: " + bogieCapacity.get("Sleeper"));
    }
}