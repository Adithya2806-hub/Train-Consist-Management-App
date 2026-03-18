import java.util.HashMap;
import java.util.Map;

public class TrainConsistAppUC6 {

    public static void main(String[] args) {

        System.out.println("====================================");
        System.out.println("=== Train Consist Management App ===");
        System.out.println("====================================");

        // Create HashMap (Bogie → Capacity)
        Map<String, Integer> bogieCapacity = new HashMap<>();

        // Add bogies with capacity
        bogieCapacity.put("Sleeper", 72);
        bogieCapacity.put("AC Chair", 50);
        bogieCapacity.put("First Class", 24);

        // Display data
        System.out.println("\nBogie Capacity Details:");

        for (Map.Entry<String, Integer> entry : bogieCapacity.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }

        System.out.println("\nTotal Bogies: " + bogieCapacity.size());

        System.out.println("\nUC6 Completed Successfully!");
    }
}