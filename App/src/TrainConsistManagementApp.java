import java.util.LinkedList;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        // Create LinkedList to maintain ordered bogies
        LinkedList<String> trainConsist = new LinkedList<>();

        System.out.println("Adding Bogies to Train...\n");

        // Add bogies in order
        trainConsist.add("Engine");
        trainConsist.add("Sleeper");
        trainConsist.add("AC Chair");
        trainConsist.add("Cargo");
        trainConsist.add("Guard");

        // Insert Pantry Car at position 2 (index 1-based logic → index 2)
        trainConsist.add(2, "Pantry Car");

        // Remove first and last bogie
        trainConsist.removeFirst();
        trainConsist.removeLast();

        // Display final ordered train consist
        System.out.println("Final Train Consist:");
        for (String bogie : trainConsist) {
            System.out.println(bogie);
        }
    }
}