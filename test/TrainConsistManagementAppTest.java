import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

class TrainConsistManagementAppTest {

    private List<Bogie> getBogies() {
        List<Bogie> list = new ArrayList<>();
        list.add(new Bogie("Sleeper", 72));
        list.add(new Bogie("AC Chair", 50));
        list.add(new Bogie("First Class", 24));
        return list;
    }

    @Test
    void testLoopFilteringLogic() {
        List<Bogie> result = TrainConsistManagementApp.filterUsingLoop(getBogies());
        assertEquals(1, result.size());
    }

    @Test
    void testStreamFilteringLogic() {
        List<Bogie> result = TrainConsistManagementApp.filterUsingStream(getBogies());
        assertEquals(1, result.size());
    }

    @Test
    void testLoopAndStreamResultsMatch() {
        List<Bogie> loopResult = TrainConsistManagementApp.filterUsingLoop(getBogies());
        List<Bogie> streamResult = TrainConsistManagementApp.filterUsingStream(getBogies());

        assertEquals(loopResult.size(), streamResult.size());
    }

    @Test
    void testExecutionTimeMeasurement() {
        long start = System.nanoTime();
        TrainConsistManagementApp.filterUsingLoop(getBogies());
        long end = System.nanoTime();

        assertTrue((end - start) > 0);
    }

    @Test
    void testLargeDatasetProcessing() {
        List<Bogie> bigList = new ArrayList<>();

        for (int i = 0; i < 1000; i++) {
            bigList.add(new Bogie("Sleeper", 72));
            bigList.add(new Bogie("AC Chair", 50));
        }

        List<Bogie> result = TrainConsistManagementApp.filterUsingStream(bigList);
        assertTrue(result.size() > 0);
    }
}