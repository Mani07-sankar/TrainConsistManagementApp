import java.util.HashSet;
import java.util.Set;

 class TrainConsistManagementApp {

    static void main(String[] args) {

        // Create HashSet to store unique bogie IDs
        Set<String> bogieSet = new HashSet<>();

        System.out.println("Adding Bogie IDs...\n");

        // Adding bogie IDs (including duplicates intentionally)
        addBogie(bogieSet, "BG101");
        addBogie(bogieSet, "BG102");
        addBogie(bogieSet, "BG103");
        addBogie(bogieSet, "BG101"); // duplicate
        addBogie(bogieSet, "BG104");
        addBogie(bogieSet, "BG102"); // duplicate

        // Display unique bogie IDs
        System.out.println("\nUnique Bogie IDs:");
        for (String id : bogieSet) {
            System.out.println(id);
        }
    }

    // Method to add bogie and handle duplicates
    public static void addBogie(Set<String> set, String id) {
        if (set.add(id)) {
            System.out.println("Added: " + id);
        } else {
            System.out.println("Duplicate ignored: " + id);
        }
    }
}