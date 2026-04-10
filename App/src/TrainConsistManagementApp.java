import java.util.Arrays;
import java.util.Scanner;

public class TrainConsistManagementApp {

    // Binary Search with Validation (UC20)
    public static boolean searchBogie(String[] bogieIds, String key) {

        // ✅ Fail-Fast Check
        if (bogieIds == null || bogieIds.length == 0) {
            throw new IllegalStateException("No bogies available in the train. Please add bogies first.");
        }

        // Ensure sorted before binary search
        Arrays.sort(bogieIds);

        int low = 0;
        int high = bogieIds.length - 1;

        while (low <= high) {

            int mid = (low + high) / 2;

            int result = key.compareTo(bogieIds[mid]);

            if (result == 0) {
                return true; // Found
            } else if (result > 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return false; // Not found
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Try changing this to {} to test exception
        String[] bogieIds = {"BG101", "BG205", "BG309"};

        System.out.println("Enter Bogie ID to search:");
        String key = sc.nextLine();

        try {
            boolean found = searchBogie(bogieIds, key);

            if (found) {
                System.out.println("Bogie ID " + key + " FOUND.");
            } else {
                System.out.println("Bogie ID " + key + " NOT FOUND.");
            }

        } catch (IllegalStateException e) {
            System.out.println("ERROR: " + e.getMessage());
        }

        sc.close();
    }
}