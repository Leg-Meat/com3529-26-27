package uk.ac.shef.com3529;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalendarTest {

    @Test
    public void daysBetweenDatesTest() {
        assertEquals(Calendar.daysBetweenTwoDates(2012,12,5,2012,12,6), 1);

    }
}
