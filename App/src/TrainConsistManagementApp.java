import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

// Bogie class (custom object)
class Bogie {
    String name;
    int capacity;

    // Constructor
    Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    // Display method
    public String toString() {
        return name + " -> " + capacity;
    }
}

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        // Create list of bogies
        List<Bogie> bogieList = new ArrayList<>();

        System.out.println("Adding Passenger Bogies...\n");

        // Add bogies
        bogieList.add(new Bogie("Sleeper", 72));
        bogieList.add(new Bogie("AC Chair", 60));
        bogieList.add(new Bogie("First Class", 24));

        // Sort bogies based on capacity (ascending)
        bogieList.sort(Comparator.comparingInt(b -> b.capacity));

        // Display sorted bogies
        System.out.println("Bogies Sorted by Capacity (Ascending):");
        for (Bogie b : bogieList) {
            System.out.println(b);
        }

        // Optional: Descending order
        bogieList.sort(Comparator.comparingInt((Bogie b) -> b.capacity).reversed());

        System.out.println("\nBogies Sorted by Capacity (Descending):");
        for (Bogie b : bogieList) {
            System.out.println(b);
        }
    }
}