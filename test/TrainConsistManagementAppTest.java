import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TrainConsistManagementAppTest {


    private List<Bogie> getBogies() {
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));
        return bogies;
    }

    @Test
    void testFilterGreaterThan60() {
        List<Bogie> result = TrainConsistManagementApp.filterBogies(getBogies());
        assertEquals(1, result.size());
        assertEquals("Sleeper", result.get(0).getName());
    }

    @Test
    void testNoBogiesMatch() {
        List<Bogie> list = new ArrayList<>();
        list.add(new Bogie("First Class", 20));

        List<Bogie> result = TrainConsistManagementApp.filterBogies(list);
        assertTrue(result.isEmpty());
    }

    @Test
    void testAllBogiesMatch() {
        List<Bogie> list = new ArrayList<>();
        list.add(new Bogie("Sleeper", 80));
        list.add(new Bogie("AC", 70));

        List<Bogie> result = TrainConsistManagementApp.filterBogies(list);
        assertEquals(2, result.size());
    }

}