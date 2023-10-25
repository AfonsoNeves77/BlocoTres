package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MultiplesExerciseTwoTest {

    @Test
    void multiplesOfaCertainNumber() {
        int[] expected = MultiplesExerciseTwo.multiplesOfaCertainNumber(3,15,10);
        int[] a = {12,15};
        assertArrayEquals(expected,a);
    }

    @Test
    void multiplesOfZero() {
        int[] expected = MultiplesExerciseTwo.multiplesOfaCertainNumber(0,15,10);
        int[] a = {};
        assertArrayEquals(expected,a);
    }

    @Test
    void multiplesOfMinusTwo() {
        int[] expected = MultiplesExerciseTwo.multiplesOfaCertainNumber(2,0,-8);
        int[] a = {-8,-6,-4,-2,0};
        assertArrayEquals(expected,a);
    }

    @Test
    void multiplesOfTwoNmbers() {
        int[] expected = MultiplesExerciseTwo.multiplesOfTwoNumbers(2,3,15,10);
        int[] a = {10, 12, 14, 12, 15};
        assertArrayEquals(expected,a);
    }

    @Test
    void multiplesOfTwoNumbersZero() {
        int[] expected = MultiplesExerciseTwo.multiplesOfTwoNumbers(0,0,15,10);
        int[] a = {};
        assertArrayEquals(expected,a);
    }

    @Test
    void multiplesOfTwoNumbersOneZero() {
        int[] expected = MultiplesExerciseTwo.multiplesOfTwoNumbers(0,3,15,10);
        int[] a = {12,15};
        assertArrayEquals(expected,a);
    }

    @Test
    void sumOfTwoMultipleNumbers() {
        int expected = MultiplesExerciseTwo.sumOfTwoMultipleNumbers(0,3,15,10);

        assertEquals(expected,27);
    }

    @Test
    void sumOfTwoMultipleZero() {
        int expected = MultiplesExerciseTwo.sumOfTwoMultipleNumbers(0,0,15,10);

        assertEquals(expected,-1);
    }

    @Test
    void productMultiplesOnaGivenInterval() {
        int expected = MultiplesExerciseTwo.productMultiplesOnaGivenInterval(2,6,4);
        assertEquals(24,expected);
    }

    @Test
    void productMultiplesOnaGivenIntervalZeroMin() {
        int expected = MultiplesExerciseTwo.productMultiplesOnaGivenInterval(6,2,0);
        assertEquals(1,expected);
    }

    @Test
    void productMultiplesOnaGivenIntervalZero() {
        int expected = MultiplesExerciseTwo.productMultiplesOnaGivenInterval(0,6,4);
        assertEquals(-1,expected);
    }

    @Test
    void mediaMultiplesGivenInterval() {
        double expected = MultiplesExerciseTwo.mediaMultiplesGivenInterval(2,6,4);
        assertEquals(5,expected);
    }

    @Test
    void mediaMultiplesGivenIntervalV2() {
        double expected = MultiplesExerciseTwo.mediaMultiplesGivenInterval(5,20,15);
        assertEquals(17.5,expected);
    }

    @Test
    void mediaMultiplesGivenIntervalZero() {
        double expected = MultiplesExerciseTwo.mediaMultiplesGivenInterval(0,6,4);
        assertEquals(-1,expected);
    }

    @Test
    void mediaofTwoMultiplesGivenInterval() {
        double expected = MultiplesExerciseTwo.mediaofTwoMultiplesGivenInterval(2,3,15,10);
       assertEquals(12.6, expected);
    }
}