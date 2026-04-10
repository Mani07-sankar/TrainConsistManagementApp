import java.util.ArrayList;
import java.util.List;

// Bogie class (same as previous UCs)
class Bogie {
    String name;
    int capacity;

    Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    public String toString() {
        return name + " -> " + capacity;
    }
}

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        // Create list of bogies
        List<Bogie> bogieList = new ArrayList<>();

        System.out.println("Adding Bogies...\n");

        bogieList.add(new Bogie("Sleeper", 72));
        bogieList.add(new Bogie("AC Chair", 60));
        bogieList.add(new Bogie("First Class", 24));
        bogieList.add(new Bogie("Luxury Coach", 80));

        // Calculate total seating capacity using Stream
        int totalSeats = bogieList.stream()
                .map(b -> b.capacity)           // extract capacity
                .reduce(0, Integer::sum);       // sum all values

        // Display result
        System.out.println("Total Seating Capacity of Train: " + totalSeats);

        // Show original list unchanged
        System.out.println("\nOriginal Bogie List:");
        for (Bogie b : bogieList) {
            System.out.println(b);
        }
    }
}