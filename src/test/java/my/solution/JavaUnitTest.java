package my.solution;

import java.util.List;
import java.util.Map;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class JavaUnitTest {
    @Test
    public void integerListTest() {
        final var solver = new SolverJava<Integer>();
        final var expected = Map.of(1, 2, 3, 1, 4, 2, 5, 2);

        final var source = List.of(1, 3, 4, 5, 1, 5, 4);
        final var result = solver.getFrequencyStatistics(source);

        assertEquals(result, expected);
    }

    @Test
    public void integerArrayTest() {
        final var solver = new SolverJava<Integer>();
        final var expected = Map.of(1, 2, 3, 1, 4, 2, 5, 2);

        final var source = new Integer[] {1, 3, 4, 5, 1, 5, 4};
        final var result = solver.getFrequencyStatistics(source);

        assertEquals(result, expected);
    }

    @Test
    public void stringListTest() {
        final var solver = new SolverJava<String>();
        final var expected = Map.of("1", 2, "3", 1, "4", 2, "5", 2);

        final var source = List.of("1", "3", "4", "5", "1", "5", "4");
        final var result = solver.getFrequencyStatistics(source);

        assertEquals(result, expected);
    }

    @Test
    public void stringArrayTest() {
        final var solver = new SolverJava<String>();
        final var expected = Map.of("1", 2, "3", 1, "4", 2, "5", 2);

        final var source = new String[] {"1", "3", "4", "5", "1", "5", "4"};
        final var result = solver.getFrequencyStatistics(source);

        assertEquals(result, expected);
    }

    @Test
    public void emptyCollectionTest() {
        final var solver = new SolverJava<Integer>();
        final var expected = Map.of();

        final var source = new Integer[] {};
        final var result = solver.getFrequencyStatistics(source);

        assertEquals(result, expected);
    }
}
