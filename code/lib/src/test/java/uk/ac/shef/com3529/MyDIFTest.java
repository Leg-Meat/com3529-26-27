package uk.ac.shef.com3529;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyDIFTest {

    @Test
    public void findLastFail() {
        int[] testInput = {9, 4, 2, 1};

        // Defect is the condition that y > 0 in the for loop. If the last occurrence
        // of a number is the first number, the code incorrectly fails with an exception.
        assertEquals(DIF.findLast(testInput, 9), 0);
    }

    @Test
    public void countPositiveFaiL() {
        int[] testInput = {1, -1, -6, -9, 35, 120, 0, -2, 3, -519};

        // Defect is a logic error that 0 is counted as a positive number.
        assertEquals(DIF.countPositive(testInput), 4);
    }

    @Test
    public void lastZeroFail() {
        int[] testInput = {4, 5, 0, 2, 6, 0};

        // Defect is that the loop counts from the start so returns the first
        // (not last) input
        assertEquals(DIF.lastZero(testInput), 5);
    }


}
