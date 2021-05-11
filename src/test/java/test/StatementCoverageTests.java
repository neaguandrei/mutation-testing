package test;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static test.Utility.getTotalPerfectNumbers;

public class StatementCoverageTests {

    @Test
    public void testSC1() {
        List<Integer> input = new ArrayList<>();
        input.add(3);
        input.add(6);
        input.add(9);
        input.add(21);
        input.add(28);
        input.add(35);
        long totalPerfectNumbers = getTotalPerfectNumbers(2, 34, 6, input);

        assertEquals(2, totalPerfectNumbers);
    }


    @Test
    public void testSC2() {
        long totalPerfectNumbers = getTotalPerfectNumbers(2, 34, 6, null);
        assertEquals(-1, totalPerfectNumbers);
    }

    @Test
    public void testSC3() {
        List<Integer> input = new ArrayList<>();
        input.add(3);
        input.add(6);
        input.add(9);
        input.add(28);
        input.add(21);
        input.add(35);
        long totalPerfectNumbers = getTotalPerfectNumbers(4, 2, 6, input);
        assertEquals(-1, totalPerfectNumbers);
    }
}
