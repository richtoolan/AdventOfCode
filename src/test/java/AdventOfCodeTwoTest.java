import days.AdventOfCodeTwo;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class AdventOfCodeTwoTest {
  @Test
  void shouldRunProgram() {
    AdventOfCodeTwo adventOfCodeTwo = new AdventOfCodeTwo();
    List<Integer> output = adventOfCodeTwo.executeProgram(Arrays.asList(1, 9, 10, 3, 2, 3, 11, 0, 99, 30, 40, 50), null);

    assertEquals(Arrays.asList(3500, 9, 10, 70, 2, 3, 11, 0, 99, 30, 40, 50), output);
  }

  @Test
  void shouldRunProgram2() {
    AdventOfCodeTwo adventOfCodeTwo = new AdventOfCodeTwo();
    List<Integer> output = adventOfCodeTwo.executeProgram(Arrays.asList(1, 0, 0, 0, 99), null);

    assertEquals(Arrays.asList(2, 0, 0, 0, 99), output);
  }

  @Test
  void shouldRunProgram3() {
    AdventOfCodeTwo adventOfCodeTwo = new AdventOfCodeTwo();
    List<Integer> output = adventOfCodeTwo.executeProgram(Arrays.asList(2, 3, 0, 3, 99), null);

    assertEquals(Arrays.asList(2, 3, 0, 6, 99), output);
  }

  @Test
  void shouldRunProgram4() {
    AdventOfCodeTwo adventOfCodeTwo = new AdventOfCodeTwo();
    List<Integer> output = adventOfCodeTwo.executeProgram(Arrays.asList(2, 4, 4, 5, 99, 0), null);

    assertEquals(Arrays.asList(2, 4, 4, 5, 99, 9801), output);
  }

  @Test
  void shouldRunProgram5() {
    AdventOfCodeTwo adventOfCodeTwo = new AdventOfCodeTwo();
    List<Integer> output = adventOfCodeTwo.executeProgram(Arrays.asList(1, 1, 1, 4, 99, 5, 6, 0, 99), null);

    assertEquals(Arrays.asList(30, 1, 1, 4, 2, 5, 6, 0, 99), output);
  }

  @Test
  void shouldRunProgram6() {
    AdventOfCodeTwo adventOfCodeTwo = new AdventOfCodeTwo();

    Map<Integer, Integer> intialState = Map.of(
      1, 12,
      2, 2
    );

    List<Integer> output = adventOfCodeTwo.executeProgram(Arrays.asList(1, 0, 0, 3, 1, 1, 2, 3, 1, 3, 4, 3, 1, 5, 0, 3, 2, 9, 1, 19, 1, 19, 5, 23, 1, 23, 6, 27, 2, 9, 27, 31, 1, 5, 31, 35, 1, 35, 10, 39, 1, 39, 10, 43, 2, 43, 9, 47, 1, 6, 47, 51, 2, 51, 6, 55, 1, 5, 55, 59, 2, 59, 10, 63, 1, 9, 63, 67, 1, 9, 67, 71, 2, 71, 6, 75, 1, 5, 75, 79, 1, 5, 79, 83, 1, 9, 83, 87, 2, 87, 10, 91, 2, 10, 91, 95, 1, 95, 9, 99, 2, 99, 9, 103, 2, 10, 103, 107, 2, 9, 107, 111, 1, 111, 5, 115, 1, 115, 2, 119, 1, 119, 6, 0, 99, 2, 0, 14, 0), intialState);

    assertEquals(Arrays.asList(3516593, 12, 2, 2, 1, 1, 2, 3, 1, 3, 4, 3, 1, 5, 0, 3, 2, 9, 1, 36, 1, 19, 5, 37, 1, 23, 6, 39, 2, 9, 27, 117, 1, 5, 31, 118, 1, 35, 10, 122, 1, 39, 10, 126, 2, 43, 9, 378, 1, 6, 47, 380, 2, 51, 6, 760, 1, 5, 55, 761, 2, 59, 10, 3044, 1, 9, 63, 3047, 1, 9, 67, 3050, 2, 71, 6, 6100, 1, 5, 75, 6101, 1, 5, 79, 6102, 1, 9, 83, 6105, 2, 87, 10, 24420, 2, 10, 91, 97680, 1, 95, 9, 97683, 2, 99, 9, 293049, 2, 10, 103, 1172196, 2, 9, 107, 3516588, 1, 111, 5, 3516589, 1, 115, 2, 3516591, 1, 119, 6, 0, 99, 2, 0, 14, 0), output);
  }

  @Test
  void shouldRunProgram7() {
    AdventOfCodeTwo adventOfCodeTwo = new AdventOfCodeTwo();

    Map<Integer, Integer> intialState = Map.of(
      1, 12,
      2, 2
    );

    List<Integer> output = adventOfCodeTwo.executeProgram(Arrays.asList(1, 0, 0, 3, 1, 1, 2, 3, 1, 3, 4, 3, 1, 5, 0, 3, 2, 9, 1, 19, 1, 19, 5, 23, 1, 23, 6, 27, 2, 9, 27, 31, 1, 5, 31, 35, 1, 35, 10, 39, 1, 39, 10, 43, 2, 43, 9, 47, 1, 6, 47, 51, 2, 51, 6, 55, 1, 5, 55, 59, 2, 59, 10, 63, 1, 9, 63, 67, 1, 9, 67, 71, 2, 71, 6, 75, 1, 5, 75, 79, 1, 5, 79, 83, 1, 9, 83, 87, 2, 87, 10, 91, 2, 10, 91, 95, 1, 95, 9, 99, 2, 99, 9, 103, 2, 10, 103, 107, 2, 9, 107, 111, 1, 111, 5, 115, 1, 115, 2, 119, 1, 119, 6, 0, 99, 2, 0, 14, 0), intialState);

    assertEquals(Arrays.asList(3516593, 12, 2, 2, 1, 1, 2, 3, 1, 3, 4, 3, 1, 5, 0, 3, 2, 9, 1, 36, 1, 19, 5, 37, 1, 23, 6, 39, 2, 9, 27, 117, 1, 5, 31, 118, 1, 35, 10, 122, 1, 39, 10, 126, 2, 43, 9, 378, 1, 6, 47, 380, 2, 51, 6, 760, 1, 5, 55, 761, 2, 59, 10, 3044, 1, 9, 63, 3047, 1, 9, 67, 3050, 2, 71, 6, 6100, 1, 5, 75, 6101, 1, 5, 79, 6102, 1, 9, 83, 6105, 2, 87, 10, 24420, 2, 10, 91, 97680, 1, 95, 9, 97683, 2, 99, 9, 293049, 2, 10, 103, 1172196, 2, 9, 107, 3516588, 1, 111, 5, 3516589, 1, 115, 2, 3516591, 1, 119, 6, 0, 99, 2, 0, 14, 0), output);
  }
}