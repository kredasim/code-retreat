package com.sportradar.code.retreat;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SampleTest {

    @Test
    public void GIVEN_nothing_WHEN_testing_THEN_failing() {

        assertEquals(true, true);
    }

    @Test
    public void New_Seat_Is_Free() {
        Seat seat = new Seat();

        assertTrue(seat.isFree());
    }

}
