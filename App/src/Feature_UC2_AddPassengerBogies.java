import java.util.HashSet;
import java.util.Set;

class UC3_BogieSet {

    public static void main(String[] args) {

        Set<String> bogieSet = new HashSet<>();

        System.out.println("Adding Bogie IDs...\n");

        addBogie(bogieSet, "BG101");
        addBogie(bogieSet, "BG102");
        addBogie(bogieSet, "BG103");
        addBogie(bogieSet, "BG101"); // duplicate
        addBogie(bogieSet, "BG104");
        addBogie(bogieSet, "BG102"); // duplicate

        System.out.println("\nUnique Bogie IDs:");
        for (String id : bogieSet) {
            System.out.println(id);
        }
    }

    public static void addBogie(Set<String> set, String id) {
        if (set.add(id)) {
            System.out.println("Added: " + id);
        } else {
            System.out.println("Duplicate ignored: " + id);
        }
    }
}