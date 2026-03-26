import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

class TrainConsistManagementAppTest {

    private List<Bogie> getBogies() {
        List<Bogie> list = new ArrayList<>();
        list.add(new Bogie("Sleeper", 72));
        list.add(new Bogie("AC Chair", 56));
        list.add(new Bogie("First Class", 24));
        return list;
    }

    @Test
    void testReduce_TotalSeatCalculation() {
        int result = TrainConsistManagementApp.getTotalSeats(getBogies());
        assertEquals(152, result);
    }

    @Test
    void testReduce_MultipleBogiesAggregation() {
        int result = TrainConsistManagementApp.getTotalSeats(getBogies());
        assertEquals(152, result);
    }

    @Test
    void testReduce_SingleBogieCapacity() {
        List<Bogie> list = new ArrayList<>();
        list.add(new Bogie("Sleeper", 80));

        int result = TrainConsistManagementApp.getTotalSeats(list);
        assertEquals(80, result);
    }

    @Test
    void testReduce_EmptyBogieList() {
        int result = TrainConsistManagementApp.getTotalSeats(new ArrayList<>());
        assertEquals(0, result);
    }

    @Test
    void testReduce_CorrectCapacityExtraction() {
        int result = TrainConsistManagementApp.getTotalSeats(getBogies());
        assertEquals(152, result);
    }

    @Test
    void testReduce_AllBogiesIncluded() {
        int result = TrainConsistManagementApp.getTotalSeats(getBogies());
        assertEquals(152, result);
    }

    @Test
    void testReduce_OriginalListUnchanged() {
        List<Bogie> original = getBogies();

        TrainConsistManagementApp.getTotalSeats(original);

        assertEquals(3, original.size());
    }
}