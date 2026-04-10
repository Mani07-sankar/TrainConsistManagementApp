import java.util.Scanner;

public class TrainConsistManagementApp {

    // Linear Search Method
    public static boolean linearSearch(String[] bogieIds, String key) {

        // Traverse array
        for (int i = 0; i < bogieIds.length; i++) {

            // Compare using equals()
            if (bogieIds[i].equals(key)) {
                return true; // Found
            }
        }

        return false; // Not Found
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Array of bogie IDs
        String[] bogieIds = {
                "BG101", "BG205", "BG309", "BG412", "BG550"
        };

        // User input
        System.out.println("Enter Bogie ID to search:");
        String searchKey = sc.nextLine();

        // Call search method
        boolean found = linearSearch(bogieIds, searchKey);

        // Output result
        if (found) {
            System.out.println("Bogie ID " + searchKey + " FOUND in the consist.");
        } else {
            System.out.println("Bogie ID " + searchKey + " NOT FOUND.");
        }

        sc.close();
    }
}