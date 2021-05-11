package test;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static test.Utility.getTotalPerfectNumbers;

public class DecisionCoverageTests {

    @Test
    public void testDC1() {
        List<Integer> input = new ArrayList<>();
        input.add(3);
        input.add(4);
        input.add(9);
        input.add(21);
        input.add(27);
        input.add(34);
        long totalPerfectNumbers = getTotalPerfectNumbers(2, 34, 6, input);

        assertEquals(0, totalPerfectNumbers);
    }
}
