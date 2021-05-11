package test;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static test.Utility.getTotalPerfectNumbers;

public class EquivalencePartitioningTests {

    @Test
    public void testC11() {
        List<Integer> input = new ArrayList<>();
        input.add(3);
        input.add(6);
        input.add(9);
        input.add(28);
        input.add(21);
        input.add(35);
        long totalPerfectNumbers = getTotalPerfectNumbers(2, 34, 6, input);

        assertEquals(2, totalPerfectNumbers);
    }

    @Test
    public void testC12() {
        List<Integer> input = new ArrayList<>();
        input.add(3);
        input.add(6);
        input.add(9);
        input.add(28);
        input.add(21);
        input.add(35);
        long totalPerfectNumbers = getTotalPerfectNumbers(8, 29, 6, input);

        assertEquals(1, totalPerfectNumbers);
    }

    @Test
    public void testC13() {
        List<Integer> input = new ArrayList<>();
        input.add(3);
        input.add(6);
        input.add(9);
        input.add(28);
        input.add(21);
        input.add(35);
        long totalPerfectNumbers = getTotalPerfectNumbers(-1, 7, 6, input);

        assertEquals(-1, totalPerfectNumbers);
    }

    @Test
    public void testC14() {
        List<Integer> input = new ArrayList<>();
        input.add(3);
        input.add(6);
        input.add(9);
        input.add(28);
        input.add(21);
        input.add(35);
        long totalPerfectNumbers = getTotalPerfectNumbers(7, -1, 6, input);

        assertEquals(-1, totalPerfectNumbers);
    }

    @Test
    public void testC2() {
        long totalPerfectNumbers = getTotalPerfectNumbers(0, 1, 0, new ArrayList<>());
        assertEquals(-1, totalPerfectNumbers);
    }

    @Test
    public void testC3() {
        List<Integer> input = new ArrayList<>();
        for (int i = 0; i < 101; i++) {
            input.add(i);
        }
        long totalPerfectNumbers = getTotalPerfectNumbers(10, 99, 101, input);

        assertEquals(-1, totalPerfectNumbers);
    }
}
