import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TrainConsistManagementApp {
    public static List<Bogie> filterBogies(List<Bogie> bogies) {
        return bogies.stream()
                .filter(b -> b.getCapacity() > 60)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {

        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));

        List<Bogie> result = filterBogies(bogies);

        System.out.println("Filtered Bogies:");
        for (Bogie b : result) {
            System.out.println(b.getName() + " → " + b.getCapacity());
        }
    }

}
