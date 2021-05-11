package test;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static test.Utility.getTotalPerfectNumbers;

/*
 * M tests => min / max testing.
 * S tests => size testing.
 *
 */
public class BoundaryValueAnalysisTests {

    @Test
    public void testM11() {
        List<Integer> input = new ArrayList<>();
        input.add(3);
        input.add(9);
        input.add(6);
        input.add(28);
        input.add(21);
        input.add(35);
        long totalPerfectNumbers = getTotalPerfectNumbers(0, 1, 6, input);

        assertEquals(0, totalPerfectNumbers);
    }

    @Test
    public void testM12() {
        List<Integer> input = new ArrayList<>();
        input.add(3);
        input.add(9);
        input.add(6);
        input.add(28);
        input.add(21);
        input.add(35);
        long totalPerfectNumbers = getTotalPerfectNumbers(5, 10, 6, input);

        assertEquals(1, totalPerfectNumbers);
    }

    @Test
    public void testM21() {
        List<Integer> input = new ArrayList<>();
        input.add(3);
        input.add(9);
        input.add(6);
        input.add(28);
        input.add(21);
        input.add(35);
        long totalPerfectNumbers = getTotalPerfectNumbers(1, 0, 6, input);

        assertEquals(-1, totalPerfectNumbers);
    }

    @Test
    public void testM22() {
        List<Integer> input = new ArrayList<>();
        input.add(3);
        input.add(9);
        input.add(6);
        input.add(28);
        input.add(21);
        input.add(35);
        long totalPerfectNumbers = getTotalPerfectNumbers(10, 5, 6, input);

        assertEquals(-1, totalPerfectNumbers);
    }

    @Test
    public void testM31() {
        List<Integer> input = new ArrayList<>();
        input.add(3);
        input.add(9);
        input.add(6);
        input.add(28);
        input.add(21);
        input.add(35);
        long totalPerfectNumbers = getTotalPerfectNumbers(-1, 10, 6, input);

        assertEquals(-1, totalPerfectNumbers);
    }

    @Test
    public void testM32() {
        List<Integer> input = new ArrayList<>();
        input.add(3);
        input.add(9);
        input.add(6);
        input.add(28);
        input.add(21);
        input.add(35);
        long totalPerfectNumbers = getTotalPerfectNumbers(-10, 10, 6, input);

        assertEquals(-1, totalPerfectNumbers);
    }

    @Test
    public void testM41() {
        List<Integer> input = new ArrayList<>();
        input.add(3);
        input.add(9);
        input.add(6);
        input.add(28);
        input.add(21);
        input.add(35);
        long totalPerfectNumbers = getTotalPerfectNumbers(10, -1, 6, input);

        assertEquals(-1, totalPerfectNumbers);
    }

    @Test
    public void testM42() {
        List<Integer> input = new ArrayList<>();
        input.add(3);
        input.add(9);
        input.add(6);
        input.add(28);
        input.add(21);
        input.add(35);
        long totalPerfectNumbers = getTotalPerfectNumbers(10, -10, 6, input);

        assertEquals(-1, totalPerfectNumbers);
    }

    @Test
    public void testS11() {
        List<Integer> input = new ArrayList<>();
        input.add(10);
        long totalPerfectNumbers = getTotalPerfectNumbers(1, 12, 1, input);

        assertEquals(0, totalPerfectNumbers);
    }

    @Test
    public void testS12() {
        List<Integer> input = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            input.add(i);
        }
        long totalPerfectNumbers = getTotalPerfectNumbers(5, 50, 100, input);

        assertEquals(2, totalPerfectNumbers);
    }

    @Test
    public void testS13() {
        List<Integer> input = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            input.add(i);
        }
        long totalPerfectNumbers = getTotalPerfectNumbers(30, 50, 50, input);

        assertEquals(0, totalPerfectNumbers);
    }

    @Test
    public void testS21() {
        long totalPerfectNumbers = getTotalPerfectNumbers(0, 1, 0, null);
        assertEquals(-1, totalPerfectNumbers);
    }

    @Test
    public void testS22() {
        long totalPerfectNumbers = getTotalPerfectNumbers(0, 50, -5, null);
        assertEquals(-1, totalPerfectNumbers);
    }

    @Test
    public void testS31() {
        List<Integer> input = new ArrayList<>();
        for (int i = 0; i < 101; i++) {
            input.add(i);
        }
        long totalPerfectNumbers = getTotalPerfectNumbers(2, 8, 101, input);

        assertEquals(-1, totalPerfectNumbers);
    }

    @Test
    public void testS32() {
        List<Integer> input = new ArrayList<>();
        for (int i = 0; i < 105; i++) {
            input.add(i);
        }
        long totalPerfectNumbers = getTotalPerfectNumbers(2, 8, 105, input);

        assertEquals(-1, totalPerfectNumbers);
    }
}
