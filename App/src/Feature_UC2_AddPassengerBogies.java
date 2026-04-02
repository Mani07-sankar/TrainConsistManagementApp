import java.util.*;

public class Feature_UC2_AddPassengerBogies {

    public static void main(String[] args) {

        List<String> bogies = new ArrayList<>();

        bogies.add("Sleeper");
        bogies.add("AC Chair");
        bogies.add("First Class");

        System.out.println(bogies);

        bogies.remove("AC Chair");

        System.out.println(bogies);

        System.out.println(bogies.contains("Sleeper"));
    }
}