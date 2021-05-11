package test;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static test.Utility.getTotalPerfectNumbers;

public class MutatingTests {

    @Test
    public void testM1() {
        List<Integer> input = new ArrayList<>();
        input.add(4);
        input.add(6);
        input.add(9);
        input.add(28);
        input.add(21);
        input.add(35);
        long totalPerfectNumbers = getTotalPerfectNumbers(6, 29, 6, input);

        assertEquals(2, totalPerfectNumbers);
    }

    @Test
    public void testM2() {
        List<Integer> input = new ArrayList<>();
        input.add(3);
        input.add(9);
        input.add(6);
        input.add(28);
        input.add(21);
        input.add(35);
        long totalPerfectNumbers = getTotalPerfectNumbers(3, 28, 6, input);

        assertEquals(2, totalPerfectNumbers);
    }

    @Test
    public void testM3() {
        List<Integer> input = new ArrayList<>();
        input.add(3);
        input.add(9);
        input.add(6);
        input.add(28);
        input.add(21);
        input.add(35);
        long totalPerfectNumbers = getTotalPerfectNumbers(6, 28, 6, input);

        assertEquals(2, totalPerfectNumbers);
    }
}
