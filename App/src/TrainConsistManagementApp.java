import java.util.*;
import java.util.stream.Collectors;

// Bogie class (same as UC7 & UC8)
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

        // Add bogies (with duplicates for grouping)
        bogieList.add(new Bogie("Sleeper", 72));
        bogieList.add(new Bogie("AC Chair", 60));
        bogieList.add(new Bogie("Sleeper", 72));
        bogieList.add(new Bogie("First Class", 24));
        bogieList.add(new Bogie("AC Chair", 60));

        // Group bogies by type (name)
        Map<String, List<Bogie>> groupedBogies = bogieList.stream()
                .collect(Collectors.groupingBy(b -> b.name));

        // Display grouped result
        System.out.println("Grouped Bogies by Type:\n");

        for (Map.Entry<String, List<Bogie>> entry : groupedBogies.entrySet()) {
            System.out.println(entry.getKey() + ":");
            for (Bogie b : entry.getValue()) {
                System.out.println("  " + b);
            }
        }

        // Show original list unchanged
        System.out.println("\nOriginal Bogie List:");
        for (Bogie b : bogieList) {
            System.out.println(b);
        }
    }
}