package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ToolsTest {

    @Test
    void isAboveOneFalse() {
        boolean expected = Tools.isAboveOne(1);
        assertTrue(expected);
    }

    @Test
    void isAboveOneTrue() {
        boolean expected = Tools.isAboveOne(0);
        assertFalse(expected);
    }

    @Test
    void isZeroFalse() {
        boolean expected = Tools.isZero(-1);
        assertFalse(expected);
    }

    @Test
    void isZeroTrue() {
        boolean expected = Tools.isZero(0);
        assertTrue(expected);
    }

    @Test
    void isEvenTrue() {
        boolean expected = Tools.isEven(2);
        assertTrue(expected);
    }

    @Test
    void isEvenFalse() {
        boolean expected = Tools.isEven(3);
        assertFalse(expected);
    }
}