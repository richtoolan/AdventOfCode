import days.AdventOfCodeOne;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AdventOfCodeOneTest {

    @Test
    void shouldCalculateFuelFor0() {
        assertEquals(0, AdventOfCodeOne.calculateFuel(0));
    }

    @Test
    void shouldCalculateFuelFor12() {
        assertEquals(2, AdventOfCodeOne.calculateFuel(12));
    }

    @Test
    void shouldCalculateFuelFor1969() {
        assertEquals(966, AdventOfCodeOne.calculateFuel(1969));
    }

    @Test
    void shouldCalculateFuelFor100756() {
        assertEquals(50346, AdventOfCodeOne.calculateFuel(100756));
    }
}