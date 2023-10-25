package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class exercise14Test {

    @Test
    void rightCCNumber() {
        boolean expected = exercise14.rightCCNumber(143571443);
        assertTrue(expected);
    }

    @Test
    void rightCCNumberAnotherValidCC() {
        boolean expected = exercise14.rightCCNumber(136138128);
        assertTrue(expected);
    }

    @Test
    void rightCCNumberAnotherInvalidCC() {
        boolean expected = exercise14.rightCCNumber(136138127);
        assertFalse(expected);
    }
}