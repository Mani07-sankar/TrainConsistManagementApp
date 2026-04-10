import java.util.ArrayList;
import java.util.List;

class GoodsBogie {
    String type;   // Cylindrical / Rectangular / Open / Box
    String cargo;  // Petroleum / Coal / Grain

    GoodsBogie(String type, String cargo) {
        this.type = type;
        this.cargo = cargo;
    }

    public String toString() {
        return type + " -> " + cargo;
    }
}

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        // Create goods bogie list
        List<GoodsBogie> bogieList = new ArrayList<>();

        System.out.println("Adding Goods Bogies...\n");

        bogieList.add(new GoodsBogie("Cylindrical", "Petroleum"));
        bogieList.add(new GoodsBogie("Rectangular", "Coal"));
        bogieList.add(new GoodsBogie("Open", "Grain"));
        bogieList.add(new GoodsBogie("Cylindrical", "Petroleum")); // valid

        // Safety validation using stream
        boolean isSafe = bogieList.stream()
                .allMatch(b ->
                        !b.type.equalsIgnoreCase("Cylindrical") ||
                                b.cargo.equalsIgnoreCase("Petroleum")
                );

        // Display bogies
        System.out.println("Goods Bogies:");
        bogieList.forEach(System.out::println);

        // Result
        if (isSafe) {
            System.out.println("\nTrain is SAFETY COMPLIANT ✅");
        } else {
            System.out.println("\nTrain is NOT SAFE ❌");
        }
    }
}