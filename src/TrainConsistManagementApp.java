import java.util.regex.*;

// Same class name (as you asked)
public class TrainConsistManagementApp {

    // Regex patterns
    private static final String TRAIN_ID_REGEX = "TRN-\\d{4}";
    private static final String CARGO_CODE_REGEX = "PET-[A-Z]{2}";

    // Validation methods (used in test cases)
    public static boolean isValidTrainId(String trainId) {
        return Pattern.matches(TRAIN_ID_REGEX, trainId);
    }

    public static boolean isValidCargoCode(String cargoCode) {
        return Pattern.matches(CARGO_CODE_REGEX, cargoCode);
    }

    public static void main(String[] args) {

        System.out.println("====================================");
        System.out.println("=== Train Consist Management App ===");
        System.out.println("====================================");

        // Sample Inputs
        String trainId = "TRN-1234";
        String cargoCode = "PET-AB";

        // Validation
        boolean trainValid = isValidTrainId(trainId);
        boolean cargoValid = isValidCargoCode(cargoCode);

        System.out.println("\nTrain ID: " + trainId + " → " + (trainValid ? "Valid" : "Invalid"));
        System.out.println("Cargo Code: " + cargoCode + " → " + (cargoValid ? "Valid" : "Invalid"));

        System.out.println("\nUC11 Completed Successfully!");
    }
}