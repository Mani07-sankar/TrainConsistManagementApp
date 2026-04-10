import java.util.Arrays;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        // Array of bogie names
        String[] bogieNames = {
                "Sleeper",
                "AC Chair",
                "First Class",
                "General",
                "Luxury"
        };

        // Before sorting
        System.out.println("Before Sorting:");
        System.out.println(Arrays.toString(bogieNames));

        // Sort using built-in method
        Arrays.sort(bogieNames);

        // After sorting
        System.out.println("\nAfter Sorting (Alphabetical Order):");
        System.out.println(Arrays.toString(bogieNames));
    }
}