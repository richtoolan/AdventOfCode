import days.AdventOfCodeTwo;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AdventOfCodeTwoTest {
    @Test
    void shouldRunProgram() {
        AdventOfCodeTwo adventOfCodeTwo = new AdventOfCodeTwo();
        List<Integer> output = adventOfCodeTwo.runProgram(Arrays.asList(1,9,10,3,2,3,11,0,99,30,40,50), 0);

        assertEquals(Arrays.asList(3500,9,10,70,2,3,11,0,99,30,40,50), output);
    }

    @Test
    void shouldRunProgram2() {
        AdventOfCodeTwo adventOfCodeTwo = new AdventOfCodeTwo();
        List<Integer> output = adventOfCodeTwo.runProgram(Arrays.asList(1,0,0,0,99), 0);

        assertEquals(Arrays.asList(2,0,0,0,99), output);
    }

    @Test
    void shouldRunProgram3() {
        AdventOfCodeTwo adventOfCodeTwo = new AdventOfCodeTwo();
        List<Integer> output = adventOfCodeTwo.runProgram(Arrays.asList(2,3,0,3,99), 0);

        assertEquals(Arrays.asList(2,3,0,6,99), output);
    }

    @Test
    void shouldRunProgram4() {
        AdventOfCodeTwo adventOfCodeTwo = new AdventOfCodeTwo();
        List<Integer> output = adventOfCodeTwo.runProgram(Arrays.asList(2,4,4,5,99,0), 0);

        assertEquals(Arrays.asList(2,4,4,5,99,9801), output);
    }

    @Test
    void shouldRunProgram5() {
        AdventOfCodeTwo adventOfCodeTwo = new AdventOfCodeTwo();
        List<Integer> output = adventOfCodeTwo.runProgram(Arrays.asList(1,1,1,4,99,5,6,0,99), 0);

        assertEquals(Arrays.asList(30,1,1,4,2,5,6,0,99), output);
    }

    @Test
    void shouldRunProgram6() {
        AdventOfCodeTwo adventOfCodeTwo = new AdventOfCodeTwo();
        List<Integer> output = adventOfCodeTwo.runProgram(Arrays.asList(1,0,0,3,1,1,2,3,1,3,4,3,1,5,0,3,2,9,1,19,1,19,5,23,1,23,6,27,2,9,27,31,1,5,31,35,1,35,10,39,1,39,10,43,2,43,9,47,1,6,47,51,2,51,6,55,1,5,55,59,2,59,10,63,1,9,63,67,1,9,67,71,2,71,6,75,1,5,75,79,1,5,79,83,1,9,83,87,2,87,10,91,2,10,91,95,1,95,9,99,2,99,9,103,2,10,103,107,2,9,107,111,1,111,5,115,1,115,2,119,1,119,6,0,99,2,0,14,0), 0);

        assertEquals(Arrays.asList(30,1,1,4,2,5,6,0,99), output);
    }
}