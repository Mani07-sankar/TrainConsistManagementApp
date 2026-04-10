import java.util.LinkedHashSet;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        // Create LinkedHashSet to maintain order + uniqueness
        LinkedHashSet<String> trainSet = new LinkedHashSet<>();

        System.out.println("Attaching Bogies...\n");

        // Add bogies
        trainSet.add("Engine");
        trainSet.add("Sleeper");
        trainSet.add("Cargo");
        trainSet.add("Guard");

        // Attempt duplicate
        trainSet.add("Sleeper"); // duplicate → ignored

        // Display final formation
        System.out.println("Final Train Formation (Insertion Order Preserved):");
        for (String bogie : trainSet) {
            System.out.println(bogie);
        }
    }
}