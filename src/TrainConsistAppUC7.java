import java.util.*;

// Bogie Class
class Bogie {
    String name;
    int capacity;

    public Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }
}

public class TrainConsistAppUC7 {

    public static void main(String[] args) {

        System.out.println("====================================");
        System.out.println("=== Train Consist Management App ===");
        System.out.println("====================================");

        // Create List of Bogies
        List<Bogie> bogies = new ArrayList<>();

        // Add bogies
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));

        // Sort using Comparator
        bogies.sort(Comparator.comparingInt(Bogie::getCapacity));

        // Display sorted bogies
        System.out.println("\nSorted Bogies by Capacity:");

        for (Bogie b : bogies) {
            System.out.println(b.getName() + " → " + b.getCapacity());
        }

        System.out.println("\nTotal Bogies: " + bogies.size());

        System.out.println("\nUC7 Completed Successfully!");
    }
}