import java.util.LinkedHashSet;
import java.util.Set;

public class TrainConsistAppUC5 {

    public static void main(String[] args) {

        System.out.println("====================================");
        System.out.println("=== Train Consist Management App ===");
        System.out.println("====================================");

        // Create LinkedHashSet
        Set<String> train = new LinkedHashSet<>();

        // Add bogies
        train.add("Engine");
        train.add("Sleeper");
        train.add("Cargo");
        train.add("Guard");

        // Add duplicate
        train.add("Sleeper"); // duplicate (will be ignored)

        System.out.println("\nTrain Formation (Insertion Order Preserved):");
        System.out.println(train);

        System.out.println("\nTotal Bogies: " + train.size());

        System.out.println("\nUC5 Completed Successfully!");
    }
}